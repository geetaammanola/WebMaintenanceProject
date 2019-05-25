package com.project.MaintenanceSolutions.modal;

import java.util.Date;

public class Products {
	private int productId;
	private String productName;
	private int price;
	private int unit;
	private Date date;
	

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getUnit() {
		return unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	
	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productName=" + productName + ", price=" + price + ", unit="
				+ unit  + "]";
	}

}
