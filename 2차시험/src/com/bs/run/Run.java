package com.bs.run;
import com.bs.controller.MethodTest;

public class Run {

	public static void main(String[] args) {
		
		MethodTest mt = new MethodTest();
		
		mt.printMsg("최주영바보");
		System.out.println(mt.returnSum());
		
		System.out.println(mt.returnEvenOdd(15));
		
		System.out.println(mt.charInString("안녕하세z"));
		
		mt.charInStringCnt("pabpplpep", 'p');
		
		mt.multiplicationTable(5);
		
		mt.lottoRand();
	}

}
