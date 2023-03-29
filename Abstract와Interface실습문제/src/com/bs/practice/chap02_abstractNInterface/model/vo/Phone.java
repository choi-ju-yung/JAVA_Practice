package com.bs.practice.chap02_abstractNInterface.model.vo;

public interface Phone {
	
	public static char[] NUMBERPAD = {'1','2','3','4','5','6','7',
										'8','9','*','0','#'};
	
	
	public String makeCall(); // 전화거는 추상메소드
	
	public String takeCall(); // 전화받는 추상메소드
}
