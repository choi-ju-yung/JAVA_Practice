package com.bs.practice.chap02_abstractNInterface.controller;

import com.bs.practice.chap02_abstractNInterface.model.vo.GalaxyNote9;
import com.bs.practice.chap02_abstractNInterface.model.vo.Phone;
import com.bs.practice.chap02_abstractNInterface.model.vo.V40;

public class PhoneController {

	private String[] result = new String[2];
	
	
	public String[] method() {

		Phone[] phones = new Phone[2];
		
		phones[0] = new GalaxyNote9();
		phones[1] = new V40();
		
		
//		for(int i=0; i<phones.length; i++) {
//			if(phones[i] instanceof GalaxyNote9)  //객체비교 함수 
//			{
//				result[0] = ((GalaxyNote9)phones).printInformation();
//			}
//		}
		
		for(Phone i : phones) {
			if(i instanceof GalaxyNote9) {
				result[0] = ((GalaxyNote9)i).printInformation();
			}else if(i instanceof V40) {
				result[1] = ((V40)i).printInformation();
			}else {
				System.out.println("존재하지 않는 모델입니다.");
			}
		}
		
		return result;
	}
}
