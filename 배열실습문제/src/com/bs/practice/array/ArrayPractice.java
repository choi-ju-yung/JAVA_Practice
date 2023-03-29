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
		System.out.print("���� ���� : ");
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
		String[] sarray = {"���","��","����","������","����"};
		System.out.println(sarray[1]);
	}
	
	
	
	public void practice5(){
		
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� : ");
		String moonja = sc.next();
		System.out.print("���� : ");
		char alpha = sc.next().charAt(0);
		
		char[] charArray = new char[moonja.length()]; // �Է¹��� ���ڿ����̸�ŭ �迭����
			
		for(int i=0; i<moonja.length(); i++) {
			charArray[i] = moonja.charAt(i);
		}
		
		System.out.print("application�� "+alpha+"�� �����ϴ� ��ġ(�ε���) : ");
		
		for(int i=0; i<moonja.length(); i++) {
			if(charArray[i] == alpha) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println(alpha+" ���� : "+count);
	}	
	
	
	
	public void practice6(){
		Scanner sc = new Scanner(System.in);
		String[] sArray = {"��","ȭ","��","��","��","��","��"};
		
		System.out.print("0 ~ 6 ���� ���� �Է� : ");
		int num = sc.nextInt();
		if(num > 6 && num < 0) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}else {
			System.out.println(sArray[num]);
		}
	}
	
	
	
	public void practice7(){
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		int[] sArray = new int[num];
		
		for(int i=0; i<sArray.length; i++) {
			System.out.print("�迭 "+i+"��° �ε����� ���� �� : ");
			int input = sc.nextInt();
			sArray[i] = input;
			sum += input;
		}
		
		for(int i=0; i<sArray.length; i++) {
			System.out.print(sArray[i]+" ");
		}
		System.out.println();
		System.out.println("�� �� : "+sum);
	}
	
	
	public void practice8(){
		Scanner sc = new Scanner(System.in);
		

		int cnt = 0;
		
		
		while(true) {
			boolean isFlag = false;
			System.out.print("���� : ");
			int num = sc.nextInt();
			if(num%2 ==0 || num < 3) {
				System.out.println("�ٽ� �Է��ϼ���");
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
		String[] sarray = {"�Ķ��̵�","���","����","���߸���","�Ҵ�"};
		Scanner sc = new Scanner(System.in);
		boolean isFlag = false;
		
		System.out.print("ġŲ �̸��� �Է��ϼ��� : ");
		String chicken = sc.next();
		
		for(int i=0; i<sarray.length; i++) {
			if(sarray[i].equals(chicken)) {
				isFlag = true;
			}
		}
		
		if(isFlag == true) {
			System.out.println(chicken+"ġŲ ��� ����");
		}else {
			System.out.println(chicken+"ġŲ�� ���� �޴��Դϴ�.");
		}
	}
	
	
	
	public void practice10() {
		char[] sarray = new char[14];
		char[] copy = new char[14];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ֹε�Ϲ�ȣ(-����) : ");
		String jumin = sc.next();
		
		for(int i=0; i<sarray.length; i++) {
			sarray[i] = jumin.charAt(i);
		}


		for(int i=0; i<7; i++) {
			copy[i] = sarray[i]; // �������� (������ ���ص� ���纻�� ������ ����)
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
	
	
	
	public void practice12() { // ������ �迭 ���� �� �ּҰ� �ִ밪 ã��
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
		System.out.println("�ִ밪 : "+max);
		System.out.println("�ּҰ� : "+min);
	}
	
	
	
	
	public void practice13(){ // �ߺ��� ���� ������ �迭 ����
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
		
		for(int i=0; i<lotto.length; i++) {  // �ߺ��� ���� �۾�
			lotto[i] = (int)(Math.random()*45+1);
			for(int j=0; j<lotto.length; j++) {
				if(lotto[i] == lotto[j] && i!=j) {
					i--;
					break;
				}
			}
		}
		
		
		int tmp; 
		for(int i=0; i<lotto.length; i++) { // �������� ���� �۾�
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
		System.out.print("���ڿ� : ");
		String str = sc.next();
		int len = str.length();
		int stringCnt = 0;
		char[] sarray = new char[len];
	
		
		for(int i =0; i<sarray.length; i++) {
			sarray[i] = str.charAt(i);
		}
				
		for(int i =0; i<sarray.length; i++) {
			if(str.indexOf(str.charAt(i))== i) { // indexof -> �Լ� �ȿ� ���� �ε�����ȣ ����
				answer += str.charAt(i) + " "; // ���ڿ� ������� ù ��°�� ������ ���� �ε�����ȣ ����
				stringCnt++;
			}
		}
		System.out.print("���ڿ��� �ִ� ���� : ");
		System.out.println(answer);
		
		System.out.println("���� ���� : "+stringCnt);
	
	}
	
	
	
	
	public void practice16() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");
		int len = sc.nextInt();
		
		String[] sarray = new String[len];
		String[] extend = new String[len];
		
		for(int i=0; i<sarray.length; i++) {
			System.out.print(i+1+"��° ���ڿ� : ");
			String str = sc.next();
			sarray[i] = str;
		}
		
		while(true) {
			System.out.print("�� ���� �Է��Ͻðڽ��ϱ�?(Y/N) : ");
			char answer = sc.next().charAt(0);
			if(answer == 'Y'){
				System.out.print("�� �Է��ϰ� ���� ���� : ");
				int add = sc.nextInt();
				
				extend = new String[sarray.length + add]; // �߰�������ŭ ���ؼ� ���ο� �迭 ����
				System.arraycopy(sarray, 0, extend, 0, sarray.length);
				// ���� sarray�� �ִ� �������� extend�� ����
				for (int i = sarray.length; i < extend.length; i++) { // �ٽ� �� ���ĺ��� �Է¹���
					System.out.print(i+1+"��° ���ڿ� : ");
					String str = sc.next();
					extend[i] = str;
				}
				sarray = extend.clone(); // �� ���Ŀ� �ٽ� sarray�� ����� �迭��ŭ �ٽ� �־���(�ݺ�)
				continue;
			}else if(answer =='N') {
				System.out.println(Arrays.toString(sarray));
				break;
			}
		}

	
	}
	
}
