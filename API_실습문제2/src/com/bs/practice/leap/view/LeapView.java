package com.bs.practice.leap.view;

import java.util.Calendar;
import java.util.Scanner;

import com.bs.practice.leap.controller.LeapController;


public class LeapView {
	private LeapController lc = new LeapController();
	Scanner sc = new Scanner(System.in);
	Calendar c = Calendar.getInstance();
	
	public LeapView() {
		
		int year = c.get(Calendar.YEAR);
		boolean Isflag = lc.isLeapYear(year);
		String py = "";
		

		if(Isflag == true) {
			py = "윤년";
		}else {
			py = "평년";
		}
		
		System.out.println(year+"년은 "+py);
		long day = lc.leapDate(c);
		System.out.println("총 날짜 수 : "+day);
		
	}

}
