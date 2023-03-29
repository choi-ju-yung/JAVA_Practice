package com.bs.example.practice2.model.vo;

public class Product {
	private String pName;
	private int price;
	private String brand;
	
	public Product() {}
	
	public void information() {
		System.out.println("상품 이름은 : "+pName+"이고, 가격은 "+price+"이며 브랜드는 "
				+ brand+"이다.");
	}
	
	public void setPname(String pName) {
		this.pName = pName;
	}
	
	public String getPname() {
		return this.pName;
	}
	
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return this.brand;
	}
}
