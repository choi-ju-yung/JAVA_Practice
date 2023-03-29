package com.bs.example.practice3.run;

import com.bs.example.practice3.model.vo.Circle;

public class Run {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.getSizeOfCircle();
		c.getAreaOfCircle();
		System.out.println("==== 반지름 1증가 후 ====");
		c.incrementRadius();
		c.getSizeOfCircle();
		c.getAreaOfCircle();
		System.out.println("==== 반지름 5로 바꾼 후 ====");
		c.setRadius(5); // set함수를 이용해서 radius값을 3으로 바꿈
		c.getRadius(); // 5출력
		c.getPI(); // 3.14 출력
		c.getSizeOfCircle();
		c.getAreaOfCircle();
		
		
	}

}
