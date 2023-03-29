package com.bs.practice.point.controller;

import com.bs.practice.point.model.vo.Circle;



public class CircleController {
	public static final double PI = 3.141592653589793;
	private Circle c = new Circle();
	
	public String calcCircum(int x, int y, int radius) {
		return "둘레 : "+ x+" "+y+" "+radius+" "+" / "+ (radius*2*PI);
	}
	
	public String calcArea(int x, int y, int radius) {
		return "면적 : "+ x+" "+y+" "+radius+" "+" / "+ (radius*radius*PI);
	}
	

}
