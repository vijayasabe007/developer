package com.ait.dto;

public class Item 
{
	private int productid;
	private String productname;
	private int price;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(int productid, String productname, int price, int qty) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.price = price;
		this.qty = qty;
	}
	private int qty;
	
}
