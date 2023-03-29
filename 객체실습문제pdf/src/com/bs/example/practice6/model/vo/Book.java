package com.bs.example.practice6.model.vo;

public class Book {
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	public Book() {} //기본생성자
	
	// String, String, String 타입의 매개변수가 있는 생성자
	public Book(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	
	// String, String, String, int, double 타입의 생성자
	public Book(String title, String publisher, String author
			,int price, double discountRate) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}
	
	public void inform() { // 매개변수 3개와 5개 생성자로 각각 만든 객체를 디폴트값 없이 출력
		if(!this.title.equals(null) && !this.publisher.equals(null) 
				&& !this.author.equals(null)){
			System.out.print(this.title+" "+this.publisher+" "+this.author+" ");
			if(this.price != 0 && this.discountRate != 0.0) {
				System.out.print(this.price+" "+this.discountRate);
			}
		}
	}
	
	
	
	
}
