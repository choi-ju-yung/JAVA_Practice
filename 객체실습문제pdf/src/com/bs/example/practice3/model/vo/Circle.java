package com.bs.example.practice3.model.vo;

public class Circle {
	private static final double PI = 3.14;
	private static int radius = 1;  // static으로 선언된 변수는 객체생성하지않고 클래스명으로 접근
	
	
	public Circle(){}
	
	public void incrementRadius() {
		Circle.radius++;
	}
	
	public void getAreaOfCircle() { // 원넓이 공식 : 반지름 * 반지름 * 파이값
		System.out.println("반지름 넓이 : "+radius+" * "+radius+" * "+PI+" = "+
				radius * radius * PI);
	}
	
	public void getSizeOfCircle() { // 원둘레 공식 : 반지름 * 2 * PI
		System.out.println("반지름 둘레 길이 : "+radius+" * "+2+" * "+PI+" = "+
				radius * 2 * PI);
	}
	
	// 상수는 값을 변경할 수 없으므로 set함수는 만들지 않음
	
	public double getPI() {
		return Circle.PI;
	}
	
	public void setRadius(int radius) {
		Circle.radius = radius;
	}
	
	public int getRadius() {
		return Circle.radius;
	}
	
}
