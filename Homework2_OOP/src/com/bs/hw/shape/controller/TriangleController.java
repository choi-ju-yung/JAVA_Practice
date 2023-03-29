package com.bs.hw.shape.controller;

import com.bs.hw.shape.model.vo.Shape;

public class TriangleController {
	private Shape s = new Shape();
	
	public double calcArea(double height, double width) {
		s = new Shape(1,height,width);
		
		return s.getHeight() * s.getWidth() / 2;
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
		return "삼각형 "+s.information();
	}
}
