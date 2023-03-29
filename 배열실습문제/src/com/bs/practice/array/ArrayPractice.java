package com.bs.practice.array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1(){
		int[] iarray = new int[10];
		
		for(int i=0; i<=iarray.length; i++) {
			iarray[i] = i+1;
		}
		
		for(int i=0; i<=9; i++) {
			System.out.print(iarray[i]+" ");
		}
	}
	
	
	
	public void practice2(){
		int[] iarray = new int[10];
		
		for(int i=0; i<iarray.length; i++) {
			iarray[i] = 10-i;
		}
		
		for(int i=0; i<iarray.length; i++) {
			System.out.print(iarray[i]+" ");
		}
	}
	
	
	
	
	public void practice3(){
		System.out.print("양의 정수 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int[] iarray = new int[num];
		
		for(int i=0; i<iarray.length; i++) {
			iarray[i] = i+1;
		}
		
		for(int i=0; i<iarray.length; i++) {
			System.out.print(iarray[i]+" ");
		}
	}
	
	
	
	
	public void practice4(){
		String[] sarray = {"사과","귤","포도","복숭아","참외"};
		System.out.println(sarray[1]);
	}
	
	
	
	public void practice5(){
		
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String moonja = sc.next();
		System.out.print("문자 : ");
		char alpha = sc.next().charAt(0);
		
		char[] charArray = new char[moonja.length()]; // 입력받은 문자열길이만큼 배열생성
			
		for(int i=0; i<moonja.length(); i++) {
			charArray[i] = moonja.charAt(i);
		}
		
		System.out.print("application에 "+alpha+"가 존재하는 위치(인덱스) : ");
		
		for(int i=0; i<moonja.length(); i++) {
			if(charArray[i] == alpha) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println(alpha+" 개수 : "+count);
	}	
	
	
	
	public void practice6(){
		Scanner sc = new Scanner(System.in);
		String[] sArray = {"월","화","수","목","금","토","일"};
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		if(num > 6 && num < 0) {
			System.out.println("잘못 입력하셨습니다.");
		}else {
			System.out.println(sArray[num]);
		}
	}
	
	
	
	public void practice7(){
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] sArray = new int[num];
		
		for(int i=0; i<sArray.length; i++) {
			System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
			int input = sc.nextInt();
			sArray[i] = input;
			sum += input;
		}
		
		for(int i=0; i<sArray.length; i++) {
			System.out.print(sArray[i]+" ");
		}
		System.out.println();
		System.out.println("총 합 : "+sum);
	}
	
	
	public void practice8(){
		Scanner sc = new Scanner(System.in);
		

		int cnt = 0;
		
		
		while(true) {
			boolean isFlag = false;
			System.out.print("정수 : ");
			int num = sc.nextInt();
			if(num%2 ==0 || num < 3) {
				System.out.println("다시 입력하세요");
				isFlag = true;
			}else {
				int[] iarray = new int[num];
				for(int i=0; i<=iarray.length/2; i++) {
					iarray[i] = cnt+1;
					cnt++;
				}
				for(int i=iarray.length/2+1; i<iarray.length; i++) {
					iarray[i] = cnt-1;
					cnt--;
				}
				
				for(int i=0; i<iarray.length; i++) {
					System.out.print(iarray[i]+", ");
				}
			}
			if(isFlag == false) {
				break;
			}
		}
	}
	
	
	
	
	public void practice9(){
		String[] sarray = {"후라이드","양념","간장","고추마요","불닭"};
		Scanner sc = new Scanner(System.in);
		boolean isFlag = false;
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String chicken = sc.next();
		
		for(int i=0; i<sarray.length; i++) {
			if(sarray[i].equals(chicken)) {
				isFlag = true;
			}
		}
		
		if(isFlag == true) {
			System.out.println(chicken+"치킨 배달 가능");
		}else {
			System.out.println(chicken+"치킨은 없는 메뉴입니다.");
		}
	}
	
	
	
	public void practice10() {
		char[] sarray = new char[14];
		char[] copy = new char[14];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String jumin = sc.next();
		
		for(int i=0; i<sarray.length; i++) {
			sarray[i] = jumin.charAt(i);
		}


		for(int i=0; i<7; i++) {
			copy[i] = sarray[i]; // 깊은복사 (원본이 변해도 복사본은 변하지 않음)
		}
		for(int i=7; i<sarray.length; i++) {
			copy[i] = '*';
		}
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]);
		}	
	}
	
	
	
	
	public void practice11() {
		int[] randArray = new int[10];
		
		for(int i=0; i<10; i++) {
			randArray[i] = (int)(Math.random()*10+1);
		}
		
		for(int i=0; i<10; i++) {
			System.out.print(randArray[i]+" ");
		}
		
	}
	
	
	
	public void practice12() { // 난수로 배열 저장 후 최소값 최대값 찾기
		int[] randArray = new int[10];

		for(int i=0; i<10; i++) {
			randArray[i] = (int)(Math.random()*10+1);
		}
		
		int max = randArray[0];
		int min = randArray[0];
		
		for(int i=1; i<randArray.length; i++) {
			if(max < randArray[i]) {
				max = randArray[i];
			}
			if(min > randArray[i]) {
				min = randArray[i];
			}
		}
		
		for(int i=0; i<10; i++) {
			System.out.print(randArray[i]+" ");
		}
		System.out.println();
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
	}
	
	
	
	
	public void practice13(){ // 중복값 없이 난수로 배열 저장
		int[] randArray = new int[10];
		
		for(int i=0; i<randArray.length; i++) {
			randArray[i] = (int)(Math.random()*10+1);
			for(int j=0; j<randArray.length; j++) {
				if((randArray[i] == randArray[j]) && i!=j) {
					i--;
					break;	
				}
			}
		}
		
		for(int i=0; i<10; i++) {
			System.out.print(randArray[i]+" ");
		}
	}
	
	
	
	
	public void practice14(){
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {  // 중복값 제거 작업
			lotto[i] = (int)(Math.random()*45+1);
			for(int j=0; j<lotto.length; j++) {
				if(lotto[i] == lotto[j] && i!=j) {
					i--;
					break;
				}
			}
		}
		
		
		int tmp; 
		for(int i=0; i<lotto.length; i++) { // 오름차순 정렬 작업
			for(int j=i+1; j<lotto.length; j++) {
				if(lotto[i] > lotto[j]) {
					tmp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = tmp;
				}
			}
		}
		
		
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i]+" ");
		}
	}
	
	
	
	
	public void practice15() {
	
		Scanner sc = new Scanner(System.in);
		boolean isFlag = false;
		String answer = "";  
		System.out.print("문자열 : ");
		String str = sc.next();
		int len = str.length();
		int stringCnt = 0;
		char[] sarray = new char[len];
	
		
		for(int i =0; i<sarray.length; i++) {
			sarray[i] = str.charAt(i);
		}
				
		for(int i =0; i<sarray.length; i++) {
			if(str.indexOf(str.charAt(i))== i) { // indexof -> 함수 안에 값의 인덱스번호 리턴
				answer += str.charAt(i) + " "; // 문자열 순서대로 첫 번째로 나오는 값의 인덱스번호 리턴
				stringCnt++;
			}
		}
		System.out.print("문자열에 있는 문자 : ");
		System.out.println(answer);
		
		System.out.println("문자 개수 : "+stringCnt);
	
	}
	
	
	
	
	public void practice16() {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요 : ");
		int len = sc.nextInt();
		
		String[] sarray = new String[len];
		String[] extend = new String[len];
		
		for(int i=0; i<sarray.length; i++) {
			System.out.print(i+1+"번째 문자열 : ");
			String str = sc.next();
			sarray[i] = str;
		}
		
		while(true) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char answer = sc.next().charAt(0);
			if(answer == 'Y'){
				System.out.print("더 입력하고 싶은 개수 : ");
				int add = sc.nextInt();
				
				extend = new String[sarray.length + add]; // 추가개수만큼 더해서 새로운 배열 생성
				System.arraycopy(sarray, 0, extend, 0, sarray.length);
				// 원래 sarray의 있던 개수까지 extend에 복사
				for (int i = sarray.length; i < extend.length; i++) { // 다시 그 이후부터 입력받음
					System.out.print(i+1+"번째 문자열 : ");
					String str = sc.next();
					extend[i] = str;
				}
				sarray = extend.clone(); // 그 이후에 다시 sarray에 복사된 배열만큼 다시 넣어줌(반복)
				continue;
			}else if(answer =='N') {
				System.out.println(Arrays.toString(sarray));
				break;
			}
		}

	
	}
	
}
