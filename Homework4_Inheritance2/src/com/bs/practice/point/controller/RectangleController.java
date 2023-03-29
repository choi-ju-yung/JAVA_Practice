package com.bs.practice.point.controller;

import com.bs.practice.point.model.vo.Rectangle;

public class RectangleController {
	private Rectangle r = new Rectangle();
	
	
	public String calcPerimeter(int x, int y, int height, int width) {
		return x+" "+y+" "+height+" "+width+" "+ " / " + (2*(height+width));
	}
	
	public String calcArea(int x, int y, int height, int width) {
		return x+" "+y+" "+height+" "+width+" "+ " / " + (height * width);
	}
}
