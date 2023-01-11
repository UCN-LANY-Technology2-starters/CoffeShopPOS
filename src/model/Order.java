package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

	public final static String ORDER_STATUS_FINISHED = "Finished";
	public final static String ORDER_STATUS_NEW = "New";
	public final static String ORDER_STATUS_ACTIVE = "Active";
	
	private Date date;
	private String status;
	private int discount;
	private String customerName;
	private List<Orderline> orderlines;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public Date getDate() {
		return date;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public List<Orderline> getOrderlines() {
		return orderlines;
	}

	public void addOrderline(Orderline ol) {

	}

	public double getTotalPrice() {

		return 0;
	}
	
	public Order() {
		
		this.date = new Date();
		this.orderlines = new ArrayList<Orderline>();
	}

}
