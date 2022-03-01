package com.ait.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class OrderDetails
{
	@Id
	private int transactionId;

	@ManyToOne
	@JoinColumn(name="orderId")
	private Order order;

	@ManyToOne
	@JoinColumn(name="productId")
	private Product product;
	private Integer quantity;


	public OrderDetails() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderDetails(int transactionId, Order order, Product product, Integer quantity) {
		super();
		this.transactionId = transactionId;
		this.order = order;
		this.product = product;
		this.quantity = quantity;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "OrderDetails [transactionId=" + transactionId + ", order=" + order + ", product=" + product
				+ ", quantity=" + quantity + "]";
	}
}
