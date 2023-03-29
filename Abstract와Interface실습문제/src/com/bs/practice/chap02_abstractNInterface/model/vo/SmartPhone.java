package com.bs.practice.chap02_abstractNInterface.model.vo;

public abstract class SmartPhone implements Cellphone, TouchDisplay{

	private String maker;
	
	public SmartPhone() {}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	};
	
	public abstract String printInformation(); // 추상메소드
	//추상메소드가 하나라도 있으므로 이 클래스는 추상클래스임
	
}
