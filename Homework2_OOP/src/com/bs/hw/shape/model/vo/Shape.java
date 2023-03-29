package com.bs.hw.shape.model.vo;

public class Shape {
	private int type;
	private double height;
	private double width;
	private String color = "white";
	
	public Shape() {}
	
	public Shape(int type, double height, double width) {
		this.type = type;
		this.height = height;
		this.width = width;
	}
	
	public String information() {
		return this.height + " "+ this.width+" "+this.color;
	}
	
	public void setType(int type) {
		this.type = type;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getType() {
		return this.type;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public String getColor() {
		return this.color;
	}
	
}
