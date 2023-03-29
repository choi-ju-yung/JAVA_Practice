package com.bs.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	public TokenController() {
		// TODO Auto-generated constructor stub
	}
	
	public String afterToken(String str) {
		
		String afterStr = "";
		StringTokenizer st = new StringTokenizer(str," ");
		
		while(st.hasMoreElements()) {
			afterStr += st.nextElement();
		}
		
		return afterStr;
	}
	
	public String firstCap(String input) {
		return input.substring(0,1).toUpperCase()+input.substring(1);
	
	}
	
	
	public int findChar(String input, char one) {
		return input.length() - input.replace(input.valueOf(one),"").length();
	}   // 원본 문자열 길이 - (찾을문자를 다 공백처리한 후의 문자열 길이를 빼주면 찾을 문자개수가 나온다)
}


