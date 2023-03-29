package com.bs.practice.leap.controller;

import java.util.Calendar;

public class LeapController {
	
	public boolean isLeapYear(int year) {
		
		if((year % 4 == 0 && year % 100 !=0) || year % 400 == 0) {
			return true;
		}else {
			return false;
		}
	}

	
	// 0001년 ~ 현재년 -1년 까지 일수구하기
	public long leapDate(Calendar c) {  
	
		long day = 0;
		for(int i = 1; i<=c.get(Calendar.YEAR)-1; i++) {
			if((i % 4 == 0 && i % 100 !=0) || i % 400 == 0) {
				day += 366;
			}else {
				day += 365;
			}
		}
		
		
	    // 현재년 1월~ 현재년 현재월-1까지 구하기
		for(int j=1;  j<=c.get(Calendar.MONTH); j++) {
			switch(j) {
			case 1:case 3:case 5:case 7:case 8:case 10:case 12:day+=31; break;
			case 4:case 6:case 9:case 11: day+=30; break;
			case 2:
				if((j % 4 == 0 && j % 100 !=0) || j % 400 == 0){
					day += 29;
				}else {
					day += 28;
				}
				break;
				
			default:break;
			}
		}
		
		// 현재년 현재월 1일부터 ~ 현재일까지 구하기
		for(int k=1; k<=c.get(Calendar.DATE)-1; k++) {
			day += 1;
		}

		return day;  // 총 일 수 나옴
	}
	
}
