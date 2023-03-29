package com.bs.practice.numRange.controller;

import com.bs.practice.numRange.exception.NumRangeException;

public class NumberController {
	public NumberController() {
		// TODO Auto-generated constructor stub
	}

	public boolean checkDouble(int num1, int num2) throws NumRangeException{
		boolean isFlag = false;	
		
		try {
			
			if((num1 < 1 || num1 > 100) || (num2 < 1 || num2 > 100)) {
				throw new NumRangeException("1부터 100사이의 값이 아닙니다.");
			}
			
			
			if(num1 % num2  == 0) {
				isFlag = true;
			}else {
				isFlag = false;
			}
			
		}catch(NumRangeException e) {
			e.printStackTrace();
		}  
		
		return isFlag;
	}
}
