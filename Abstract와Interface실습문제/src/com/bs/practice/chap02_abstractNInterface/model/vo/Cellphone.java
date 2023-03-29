package com.bs.practice.chap02_abstractNInterface.model.vo;

public interface Cellphone extends Phone,Camera{
	public String charge(); // 충전방식 추상메소드
}
