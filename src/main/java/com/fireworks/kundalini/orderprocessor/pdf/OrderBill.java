package com.fireworks.kundalini.orderprocessor.pdf;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.fireworks.kundalini.orderprocessor.pojo.customerorder.CustomerOrder;
import com.fireworks.kundalini.orderprocessor.pojo.customerorder.OrderDetails;
import com.fireworks.kundalini.orderprocessor.pojo.customerorder.OrderList;
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
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
			table.addCell("Kundalini");
			this.document.add(table);
			fillItemDetails(customerOrder.getOrderDetails().getOrderList());
			/*HeaderFooterPageEvent event = new HeaderFooterPageEvent();
			writer.setPageEvent(event);*/
			document.close();
			writer.close();
		} catch (Exception e) {

		}
	}

	public static PdfPCell createImageCell(String path) throws Exception {
		Image img = Image.getInstance(path);
		return new PdfPCell(img, true);
	}

	private void fillItemDetails(List<OrderList> orderList) throws Exception {
		PdfPTable itemTable;
		for (OrderList order : orderList) {
			itemTable = new PdfPTable(4);
			itemTable.addCell(order.getProductId());
			itemTable.addCell(createImageCell(order.getItemImage()));
			itemTable.addCell(order.getItemPrice());
			itemTable.addCell(order.getItemCount());
			this.document.add(itemTable);
		}

	}

	public static void main(String[] args) {

		CustomerOrder customerOrder = new CustomerOrder();
		OrderDetails orderDetails = new OrderDetails();
		List<OrderList> orderList = new ArrayList<>();
		OrderList orderItem1 = new OrderList();

		orderItem1.setProductId("Product_ID");
		orderItem1.setItemPrice("80");
		orderItem1.setItemImage("C:/data/WorkSpace/com.fireworks.kundalini.orderprocessor-master/src/main/resources/img/items/fountain_l_1.jpg");
		orderItem1.setItemCount("5");
		
		OrderList orderItem2 = new OrderList();

		orderItem2.setProductId("Product_ID");
		orderItem2.setItemPrice("80");
		orderItem2.setItemImage("C:/data/WorkSpace/com.fireworks.kundalini.orderprocessor-master/src/main/resources/img/items/shell_4.jpg");
		orderItem2.setItemCount("5");

		orderList.add(orderItem1);
		orderList.add(orderItem2);
		orderDetails.setOrderList(orderList);
		customerOrder.setOrderDetails(orderDetails);

		new OrderBill(customerOrder, "Order_ID");

	}

}
