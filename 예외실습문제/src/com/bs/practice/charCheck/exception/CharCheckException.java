package com.bs.practice.charCheck.exception;

public class CharCheckException extends Exception{  // 최상위 예외클래스인 Exception 상속
	public CharCheckException() {
		// TODO Auto-generated constructor stub
	}
	
	public CharCheckException(String msg) {
		super(msg);  // 부모생성자로 메시지 호출
	}
}
