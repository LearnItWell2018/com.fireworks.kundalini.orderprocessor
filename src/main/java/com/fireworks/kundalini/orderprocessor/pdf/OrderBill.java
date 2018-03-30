package com.fireworks.kundalini.orderprocessor.pdf;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.fireworks.kundalini.orderprocessor.pojo.customer.CustomerAddress;
import com.fireworks.kundalini.orderprocessor.pojo.customerorder.CustomerOrder;
import com.fireworks.kundalini.orderprocessor.pojo.customerorder.OrderDetails;
import com.fireworks.kundalini.orderprocessor.pojo.customerorder.OrderList;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class OrderBill {

	Document document;
	
	String rootDir = "F:/Learning/com.fireworks.kundalini.orderprocessor/src/main/resources/img/items/";
	
	public OrderBill(CustomerOrder customerOrder, String filename) {
		this.document = new Document(PageSize.A4);
		
		try {
			PdfWriter writer = PdfWriter.getInstance(document,
					new FileOutputStream("c:/data/" + filename + ".pdf"));
			this.document.open();

			PdfPTable table = new PdfPTable(2);
			table.addCell(createImageCell(rootDir + "kundalini.jpg"));
			
			Paragraph totalDetails = new Paragraph();
			totalDetails.add(fillCompanyDetails());
			totalDetails.add(fillCustomerDetails(customerOrder));
			table.addCell(totalDetails);
			this.document.add(table);
			fillItemDetails(customerOrder.getOrderDetails().getOrderList());
			document.close();
			writer.close();
		} catch (Exception e) {

		}
	}

	public static PdfPCell createImageCell(String path) throws Exception {
		Image img = Image.getInstance(path);
		return new PdfPCell(img, true);
	}

	private Paragraph fillCompanyDetails() {
		Paragraph companyDetails = new Paragraph();
		Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLDOBLIQUE, 16, Font.BOLD, BaseColor.RED);
		Paragraph companyName = new Paragraph("Kundalini Fireworks", font);
		font = FontFactory.getFont(FontFactory.HELVETICA, 10, Font.BOLD, BaseColor.BLACK);
		Phrase mail = new Phrase("Mail Us:", font);
		font = FontFactory.getFont(FontFactory.HELVETICA, 10, Font.ITALIC, BaseColor.BLUE);
		Phrase mailDetails = new Phrase(" LearnItWell2018@gmail.com", font);
		Paragraph mailUs = new Paragraph();
		mailUs.add(mail);
		mailUs.add(mailDetails);
		
		font = FontFactory.getFont(FontFactory.HELVETICA, 10, Font.BOLD, BaseColor.BLACK);
		Phrase callUs = new Phrase("Call Us:", font);
		font = FontFactory.getFont(FontFactory.HELVETICA, 10, Font.ITALIC, BaseColor.BLUE);
		Phrase mobileDetails = new Phrase("+91 9051915545", font);
		Paragraph callUsDetails = new Paragraph();
		callUsDetails.add(callUs);
		callUsDetails.add(mobileDetails);
		
		companyDetails.add(companyName);
		companyDetails.add(mailUs);
		companyDetails.add(callUsDetails);
		
		return companyDetails;
		
	}
	
	private Paragraph fillCustomerDetails(CustomerOrder customerOrder) {
		
		Paragraph customerDetails = new Paragraph();
		
		Font font = FontFactory.getFont(FontFactory.COURIER, 12, Font.BOLDITALIC, BaseColor.BLACK);
		Paragraph customerCopy = new Paragraph("CUSTOMER COPY", font);
		
		font = FontFactory.getFont(FontFactory.COURIER, 10, Font.NORMAL, BaseColor.BLUE);
		Paragraph customerMail = new Paragraph(customerOrder.getCustomerMail(), font);
		font = FontFactory.getFont(FontFactory.COURIER, 10, Font.BOLD, BaseColor.BLUE);
		Paragraph customerMobile = new Paragraph(customerOrder.getCustomerMobile(), font);
		
		customerDetails.add(customerCopy);
		customerDetails.add(customerMail);
		customerDetails.add(customerMobile);
		
		CustomerAddress customerAddress = customerOrder.getCustomerAddress();
		
		font = FontFactory.getFont(FontFactory.COURIER, 10, Font.BOLD, BaseColor.DARK_GRAY);
		Paragraph street = new Paragraph(customerAddress.getStreet(), font);
		customerDetails.add(street);
		Paragraph room = new Paragraph(customerAddress.getRoomorflatno(), font);
		customerDetails.add(room);
		Paragraph pin = new Paragraph(customerAddress.getPincode(), font);
		customerDetails.add(pin);
		Paragraph near = new Paragraph(customerAddress.getNearestLandMark(), font);
		customerDetails.add(near);
		
		return customerDetails;
		
	}
	
	private PdfPCell provideType1Cell(String content) {
		Font font = FontFactory.getFont(FontFactory.COURIER, 8, Font.NORMAL, BaseColor.BLACK);
		return new PdfPCell(new Phrase(content, font));
	}
	
	private PdfPCell provideType2Cell(String content, BaseColor baseColor) {
		Font font = FontFactory.getFont(FontFactory.TIMES_ROMAN, 12, Font.BOLD, BaseColor.WHITE);
		PdfPCell cell = new PdfPCell(new Phrase(content, font));
		cell.setBackgroundColor(baseColor);
		return cell;
	}
	
	private PdfPCell provideHeaderCell(String content, BaseColor baseColor) {
		Font font = FontFactory.getFont(FontFactory.defaultEncoding, 10, Font.BOLD, BaseColor.BLACK);
		PdfPCell cell = new PdfPCell(new Phrase(content, font));
		cell.setBackgroundColor(baseColor);
		return cell;
	}
	
	private void fillItemDetails(List<OrderList> orderList) throws Exception {
		PdfPTable itemTable;
		
		Float total = new Float(0);
		
		itemTable = new PdfPTable(1);
		itemTable.addCell(provideType2Cell("Order Details", BaseColor.BLUE));
		this.document.add(itemTable);
		
		
		itemTable = new PdfPTable(6);

        itemTable.setWidths(new float[] { 2, 2, 3, 1, 1, 1});

        itemTable.addCell(provideHeaderCell("Product Name", BaseColor.ORANGE));
        itemTable.addCell(provideHeaderCell("Product Image", BaseColor.CYAN));
        itemTable.addCell(provideHeaderCell("Product Details", BaseColor.PINK));
        itemTable.addCell(provideHeaderCell("Unit Price", BaseColor.GREEN));
        itemTable.addCell(provideHeaderCell("Product Count", BaseColor.YELLOW));
        itemTable.addCell(provideHeaderCell("Total", BaseColor.RED));

		this.document.add(itemTable);
		
		
		for (OrderList order : orderList) {

            itemTable = new PdfPTable(6);

            itemTable.setWidths(new float[] { 2, 2, 3, 1, 1, 1});

            itemTable.addCell(provideType1Cell(order.getProductId()));
            itemTable.addCell(createImageCell(order.getItemImage()));
            itemTable.addCell(provideType1Cell(order.getItemDesc()));
            itemTable.addCell(provideType1Cell(order.getItemPrice()));
            itemTable.addCell(provideType1Cell(order.getItemCount()));
            total = total + Float.parseFloat(order.getItemPrice())*Integer.parseInt(order.getItemCount());
            itemTable.addCell(provideType1Cell(Float.toString(Float.parseFloat(order.getItemPrice())*Integer.parseInt(order.getItemCount()))));

            this.document.add(itemTable);

     }

    

     itemTable = new PdfPTable(2);

     itemTable.setWidths(new float[] { 8, 2});

     itemTable.addCell(provideType2Cell("Total Amount in Rupees :", BaseColor.RED));
     itemTable.addCell(provideType2Cell(Float.toString(total), BaseColor.BLACK));

     this.document.add(itemTable);

	}

	public static void main(String[] args) {
		
		String rootDir = "F:/Learning/com.fireworks.kundalini.orderprocessor/src/main/resources/img/items/";

		CustomerOrder customerOrder = new CustomerOrder();
		
		customerOrder.setCustomerMail("suparnog13@gmail.com");
		customerOrder.setCustomerMobile("9051915545");
		
		CustomerAddress address = new CustomerAddress();
		
		address.setPincode("700091");
		address.setStreet("BIPL, Omega building, GP Block, Sector V, Salt Lake City, 8th Floor Reception.");
		address.setNearestLandMark("Near SDF Building");
		address.setRoomorflatno("82");
		
		customerOrder.setCustomerAddress(address);
		
		OrderDetails orderDetails = new OrderDetails();
		List<OrderList> orderList = new ArrayList<>();
		OrderList orderItem1 = new OrderList();

		orderItem1.setProductId("Product_ID");
		orderItem1.setItemPrice("80");
		orderItem1.setItemDesc("Shivaji Rao Gaekwad (born 12 December 1950), known by his mononymous stage name Rajinikanth, is an Indian film actor and politician who works primarily in Tamil cinema. ");
		orderItem1.setItemImage(rootDir + "fountain_l_1.jpg");
		orderItem1.setItemCount("5");
		
		OrderList orderItem2 = new OrderList();

		orderItem2.setProductId("Product_ID");
		orderItem2.setItemPrice("80");
		orderItem2.setItemDesc("Shivaji Rao Gaekwad (born 12 December 1950), known by his mononymous stage name Rajinikanth, is an Indian film actor and politician who works primarily in Tamil cinema. ");
		orderItem2.setItemImage(rootDir + "shell_4.jpg");
		orderItem2.setItemCount("5");
		
		OrderList orderItem3 = new OrderList();

		orderItem3.setProductId("Product_ID");
		orderItem3.setItemPrice("80");
		orderItem3.setItemDesc("Shivaji Rao Gaekwad (born 12 December 1950), known by his mononymous stage name Rajinikanth, is an Indian film actor and politician who works primarily in Tamil cinema. ");
		orderItem3.setItemImage(rootDir + "shell_2.jpg");
		orderItem3.setItemCount("5");
		
		OrderList orderItem4 = new OrderList();

		orderItem4.setProductId("Product_ID");
		orderItem4.setItemPrice("80");
		orderItem4.setItemDesc("Shivaji Rao Gaekwad (born 12 December 1950), known by his mononymous stage name Rajinikanth, is an Indian film actor and politician who works primarily in Tamil cinema. ");
		orderItem4.setItemImage(rootDir + "shell_3.jpg");
		orderItem4.setItemCount("5");

		OrderList orderItem5 = new OrderList();

		orderItem5.setProductId("Product_ID");
		orderItem5.setItemPrice("80");
		orderItem5.setItemDesc("Shivaji Rao Gaekwad (born 12 December 1950), known by his mononymous stage name Rajinikanth, is an Indian film actor and politician who works primarily in Tamil cinema. ");
		orderItem5.setItemImage(rootDir + "shell_1.jpg");
		orderItem5.setItemCount("5");
		
		OrderList orderItem6 = new OrderList();

		orderItem6.setProductId("Product_ID");
		orderItem6.setItemPrice("80");
		orderItem6.setItemDesc("Shivaji Rao Gaekwad (born 12 December 1950), known by his mononymous stage name Rajinikanth, is an Indian film actor and politician who works primarily in Tamil cinema. ");
		orderItem6.setItemImage(rootDir + "sparkler_l_1.jpg");
		orderItem6.setItemCount("5");
		
		OrderList orderItem7 = new OrderList();

		orderItem7.setProductId("Product_ID");
		orderItem7.setItemPrice("80");
		orderItem7.setItemDesc("Shivaji Rao Gaekwad (born 12 December 1950), known by his mononymous stage name Rajinikanth, is an Indian film actor and politician who works primarily in Tamil cinema. ");
		orderItem7.setItemImage(rootDir + "torch_l_1.jpg");
		orderItem7.setItemCount("5");
		
		orderList.add(orderItem1);
		orderList.add(orderItem2);
		orderList.add(orderItem3);
		orderList.add(orderItem4);
		orderList.add(orderItem5);
		orderList.add(orderItem6);
		orderList.add(orderItem7);
		
		orderDetails.setOrderList(orderList);
		customerOrder.setOrderDetails(orderDetails);

		new OrderBill(customerOrder, "Order_ID");

	}

}
