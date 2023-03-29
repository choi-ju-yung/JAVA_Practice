package com.bs.controller;

public class MethodTest {

	
	public void printMsg(String msg) { // 1번
		System.out.println(msg);
	}
	
	
	public int returnSum() { // 2번
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		return sum;
	}
	
	
	public String returnEvenOdd(int number) { // 3번
		if(number%2 == 0) {
			return "짝수";
		}else {
			return "홀수";
		}
	}
	
	
	public boolean charInString(String msg) { // 4번
		// true -> 중복값 있음  false -> 중복값 없음
		for(int i=0; i<msg.length(); i++) {
			if((msg.charAt(i) >= 'A' && msg.charAt(i)<='Z') ||
					(msg.charAt(i) >= 'a' && msg.charAt(i) <= 'z')) {
				return true;
			}
		}
		return false;
	}
	
	
	public void charInStringCnt(String msg, char ch) { //5번
		int cnt = 0;
		
		for(int i=0; i<msg.length(); i++) {
			if(msg.charAt(i) == ch) {
				cnt++;
			}
		}
		System.out.println(msg+"안에 "+ch+"문자의 개수는 : "+cnt);
	}
	
	
	public void multiplicationTable(int number) { // 6번
		System.out.println("=== "+number+"단===");
		for(int i=1; i<=9; i++) {
			System.out.println(number+" * "+i+" = "+number*i);
		}
	}
	
	
	public void lottoRand() {
		int[] lotto = new int[6];
		int tmp; 
		
		for(int i=0; i<lotto.length; i++) {  // 로또 번호 중복값 없이 생성
			lotto[i] = (int)(Math.random()*45+1);
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j] && i!=j) {
					i--;
					break;
				}
			}
		}

		
		for(int i=0; i<lotto.length; i++) { // 오름차순 정렬
			for(int j=i; j<lotto.length; j++) {
				if(lotto[i] > lotto[j]) {
					tmp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = tmp;
				}
			}
		}
		
		System.out.print("로또 자동 생성 6개번호 : ");
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i]+" ");
		}
	}
	
	
	
	
	
}
