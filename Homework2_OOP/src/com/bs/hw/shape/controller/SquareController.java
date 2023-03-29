package com.bs.hw.shape.controller;

import com.bs.hw.shape.model.vo.Shape;

public class SquareController {
	private Shape s = new Shape(); // Shape 타입 클래스 객체 s 생성해서
	// 함수 호출할때마다 get, set을 이용해서 값을 넣으면 new 연산자로 더 공간을 생성할 필요 없이 
	// 값을 넣을 수 있음
	
	public double calcPerimeter(double height, double width) {
		s = new Shape(2,height,width); // 생성자로 값을 넣을시에는 공간이 더 생겨버림
		
		return (s.getHeight() + s.getWidth())*2;
	}
	
	public double calcArea(double height, double width) {
		s = new Shape(2,height,width);

		return (s.getHeight() * s.getWidth());
	}
	
	public void paintColor(String color) {
		
		s.setColor(color);
		
		if(s.getColor() != null) {
			System.out.println("색이 수정되었습니다.");
		}else {
			System.out.println("색 수정 실패하였습니");
		}
	}
	
	public String print() {
		return "사각형 " + s.information();
	}
}
