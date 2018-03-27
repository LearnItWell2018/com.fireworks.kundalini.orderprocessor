package com.fireworks.kundalini.orderprocessor.pdf;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

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

	public OrderBill(CustomerOrder customerOrder, String filename) {
		this.document = new Document(PageSize.A4);
		try {
			PdfWriter writer = PdfWriter.getInstance(document,
					new FileOutputStream("c:/data/" + filename + ".pdf"));
			this.document.open();

			PdfPTable table = new PdfPTable(2);
			table.addCell(createImageCell("C:/data/WorkSpace/com.fireworks.kundalini.orderprocessor-master/src/main/resources/img/items/bomb.jpg"));
			table.addCell(fillCustomerDetails(customerOrder));
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

	private Paragraph fillCustomerDetails(CustomerOrder customerOrder) {
		Paragraph customerDetails = new Paragraph();
		
		Paragraph customerMail = new Paragraph(customerOrder.getCustomerMail());
		Paragraph customerMobile = new Paragraph(customerOrder.getCustomerMobile());
		
		customerDetails.add(customerMail);
		customerDetails.add(customerMobile);
		
		return customerDetails;
		
	}
	
	private PdfPCell provideType1Cell(String content) {
		Font font = FontFactory.getFont(FontFactory.COURIER, 8, Font.NORMAL, BaseColor.BLACK);
		return new PdfPCell(new Phrase(content, font));
	}
	
	private PdfPCell provideType2Cell(String content) {
		Font font = FontFactory.getFont(FontFactory.TIMES_ROMAN, 12, Font.BOLD, BaseColor.WHITE);
		PdfPCell cell = new PdfPCell(new Phrase(content, font));
		cell.setBackgroundColor(BaseColor.BLUE);
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
		
		itemTable = new PdfPTable(1);
		itemTable.addCell(provideType2Cell("Order Details"));
		this.document.add(itemTable);
		
		
		itemTable = new PdfPTable(5);
		itemTable.setWidths(new float[] { 2, 2, 3, 1, 1});
		
		itemTable.addCell(provideHeaderCell("Product Name", BaseColor.ORANGE));
		itemTable.addCell(provideHeaderCell("Product Image", BaseColor.CYAN));
		itemTable.addCell(provideHeaderCell("Product Details", BaseColor.PINK));
		itemTable.addCell(provideHeaderCell("Unit Price", BaseColor.GREEN));
		itemTable.addCell(provideHeaderCell("Product Count", BaseColor.YELLOW));

		this.document.add(itemTable);
		
		
		for (OrderList order : orderList) {
			itemTable = new PdfPTable(5);
			itemTable.setWidths(new float[] { 2, 2, 3, 1, 1});
			itemTable.addCell(provideType1Cell(order.getProductId()));
			itemTable.addCell(createImageCell(order.getItemImage()));
			itemTable.addCell(provideType1Cell(order.getItemDesc()));
			itemTable.addCell(provideType1Cell(order.getItemPrice()));
			itemTable.addCell(provideType1Cell(order.getItemCount()));
			this.document.add(itemTable);
		}

	}

	public static void main(String[] args) {

		CustomerOrder customerOrder = new CustomerOrder();
		
		customerOrder.setCustomerMail("suparnog13@gmail.com");
		customerOrder.setCustomerMobile("9051915545");
		
		OrderDetails orderDetails = new OrderDetails();
		List<OrderList> orderList = new ArrayList<>();
		OrderList orderItem1 = new OrderList();

		orderItem1.setProductId("Product_ID");
		orderItem1.setItemPrice("80");
		orderItem1.setItemDesc("Shivaji Rao Gaekwad (born 12 December 1950), known by his mononymous stage name Rajinikanth, is an Indian film actor and politician who works primarily in Tamil cinema. ");
		orderItem1.setItemImage("C:/data/WorkSpace/com.fireworks.kundalini.orderprocessor-master/src/main/resources/img/items/fountain_l_1.jpg");
		orderItem1.setItemCount("5");
		
		OrderList orderItem2 = new OrderList();

		orderItem2.setProductId("Product_ID");
		orderItem2.setItemPrice("80");
		orderItem2.setItemDesc("Shivaji Rao Gaekwad (born 12 December 1950), known by his mononymous stage name Rajinikanth, is an Indian film actor and politician who works primarily in Tamil cinema. ");
		orderItem2.setItemImage("C:/data/WorkSpace/com.fireworks.kundalini.orderprocessor-master/src/main/resources/img/items/shell_4.jpg");
		orderItem2.setItemCount("5");
		
		OrderList orderItem3 = new OrderList();

		orderItem3.setProductId("Product_ID");
		orderItem3.setItemPrice("80");
		orderItem3.setItemDesc("Shivaji Rao Gaekwad (born 12 December 1950), known by his mononymous stage name Rajinikanth, is an Indian film actor and politician who works primarily in Tamil cinema. ");
		orderItem3.setItemImage("C:/data/WorkSpace/com.fireworks.kundalini.orderprocessor-master/src/main/resources/img/items/shell_2.jpg");
		orderItem3.setItemCount("5");
		
		OrderList orderItem4 = new OrderList();

		orderItem4.setProductId("Product_ID");
		orderItem4.setItemPrice("80");
		orderItem4.setItemDesc("Shivaji Rao Gaekwad (born 12 December 1950), known by his mononymous stage name Rajinikanth, is an Indian film actor and politician who works primarily in Tamil cinema. ");
		orderItem4.setItemImage("C:/data/WorkSpace/com.fireworks.kundalini.orderprocessor-master/src/main/resources/img/items/shell_3.jpg");
		orderItem4.setItemCount("5");

		OrderList orderItem5 = new OrderList();

		orderItem5.setProductId("Product_ID");
		orderItem5.setItemPrice("80");
		orderItem5.setItemDesc("Shivaji Rao Gaekwad (born 12 December 1950), known by his mononymous stage name Rajinikanth, is an Indian film actor and politician who works primarily in Tamil cinema. ");
		orderItem5.setItemImage("C:/data/WorkSpace/com.fireworks.kundalini.orderprocessor-master/src/main/resources/img/items/shell_1.jpg");
		orderItem5.setItemCount("5");
		
		OrderList orderItem6 = new OrderList();

		orderItem6.setProductId("Product_ID");
		orderItem6.setItemPrice("80");
		orderItem6.setItemDesc("Shivaji Rao Gaekwad (born 12 December 1950), known by his mononymous stage name Rajinikanth, is an Indian film actor and politician who works primarily in Tamil cinema. ");
		orderItem6.setItemImage("C:/data/WorkSpace/com.fireworks.kundalini.orderprocessor-master/src/main/resources/img/items/sparkler_l_1.jpg");
		orderItem6.setItemCount("5");
		
		OrderList orderItem7 = new OrderList();

		orderItem7.setProductId("Product_ID");
		orderItem7.setItemPrice("80");
		orderItem7.setItemDesc("Shivaji Rao Gaekwad (born 12 December 1950), known by his mononymous stage name Rajinikanth, is an Indian film actor and politician who works primarily in Tamil cinema. ");
		orderItem7.setItemImage("C:/data/WorkSpace/com.fireworks.kundalini.orderprocessor-master/src/main/resources/img/items/torch_l_1.jpg");
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
