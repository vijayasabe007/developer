package com.ait.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Product 
{
	@Id
	@GeneratedValue(generator ="productsequence")
	@SequenceGenerator(name="productsequence")	
	private int id;
	private String name;
	private int ram;
	private int ssd;
	private int graphicsCard;
	private int price;
	private int quantity;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String name, int ram, int ssd, int graphicsCard, int price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.ram = ram;
		this.ssd = ssd;
		this.graphicsCard = graphicsCard;
		this.price = price;
		this.quantity = quantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getSsd() {
		return ssd;
	}
	public void setSsd(int ssd) {
		this.ssd = ssd;
	}
	public int getGraphicsCard() {
		return graphicsCard;
	}
	public void setGraphicsCard(int graphicsCard) {
		this.graphicsCard = graphicsCard;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", ram=" + ram + ", ssd=" + ssd + ", GraphicsCard="
				+ graphicsCard + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
	
}
