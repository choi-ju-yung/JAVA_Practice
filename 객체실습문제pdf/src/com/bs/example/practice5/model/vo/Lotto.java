package com.bs.example.practice5.model.vo;

public class Lotto {
	private int[] lotto = new int[6];  // 필드에 정수형배열 선언
	
	{ // 초기화블록
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45+1);
		}
	}
	
	public Lotto() {}
	
	public void information() {
		System.out.print("로또 번호는 : ");
		for(int i=0; i<=5; i++) {
			System.out.print(lotto[i]+" ");
		}
	}
}
