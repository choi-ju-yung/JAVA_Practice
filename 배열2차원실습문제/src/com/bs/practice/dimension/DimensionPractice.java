package com.bs.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {

	public void practice1() {
		String[][] sarray = new String[3][3];

		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				sarray[i][j] = "(" + i + ", " + j + ")";
				System.out.print(sarray[i][j]);
			}
			System.out.println();
		}
	}

	
	public void practice2() {
		int[][] sarray = new int[4][4];
		int num = 1;

		for (int i = 0; i < sarray.length; i++) {
			for (int j = 0; j < sarray[i].length; j++) {
				sarray[i][j] = num;
				System.out.printf("%2d" + " ", sarray[i][j]);
				num++;
			}
			System.out.println();
		}
	}

	
	public void practice3() {
		int[][] sarray = new int[4][4];
		int num = 16;

		for (int i = 0; i < sarray.length; i++) {
			for (int j = 0; j < sarray[i].length; j++) {
				sarray[i][j] = num;
				System.out.printf("%2d" + " ", sarray[i][j]);
				num--;
			}
			System.out.println();
		}
	}

	
	public void practice4() {
		int[][] sarray = new int[4][4];

		for (int i = 0; i < sarray.length - 1; i++) {
			for (int j = 0; j < sarray.length - 1; j++) {
				sarray[i][j] = (int) (Math.random() * 10 + 1); // 2행 2열까지 랜덤값 대입
				sarray[i][sarray.length - 1] += sarray[i][j]; // 행 값들의 합 구하기
			}
		}

		for (int i = 0; i < sarray.length; i++) { //
			for (int j = 0; j < sarray.length - 1; j++) {
				sarray[3][i] += sarray[j][i]; // 열 값들의 합 구하기
			}

			if (i == sarray.length - 1) { // 3행3열은 행들과 열들의 합 구하기
				for (int k = 0; k < sarray.length - 1; k++) {
					sarray[3][i] += sarray[3][k];
				}
			}

		}

		for (int i = 0; i < sarray.length; i++) {
			for (int j = 0; j < sarray[i].length; j++) {
				System.out.print(sarray[i][j] + " ");
			}
			System.out.println();
		}
	}

	
	public void practice5() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("행 크기 : ");
			int heng = sc.nextInt();
			if (heng > 10 || heng < 1) {
				System.out.println("1~10사이의 숫자를 입력하세요");
				continue;
			}

			System.out.print("열 크기 : ");
			int yul = sc.nextInt();
			if (yul > 10 || yul < 1) {
				System.out.println("1~10사이의 숫자를 입력하세요");
				continue;
			}

			char[][] sarray = new char[heng][yul];

			for (int i = 0; i < heng; i++) {
				for (int j = 0; j < yul; j++) {
					sarray[i][j] = (char) (Math.random() * 25 + 65);
					System.out.print(sarray[i][j] + " ");
				}
				System.out.println();
			}
			break;
		}
	}

	
	public void practice6() {
		String[][] strArr = new String[][] { { "이", "까", "왔", "앞", "힘" }, { "차", "지", "습", "으", "냅" },
				{ "원", "열", "니", "로", "시" }, { "배", "심", "다", "좀", "다" }, { "열", "히", "! ", "더", "!! " } };

		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[j][i] + " ");
			}
			System.out.println();
		}
	}

	
	public void practice7() {
		int number = 97;
		Scanner sc = new Scanner(System.in);
		System.out.print("행의 크기 : ");
		int heng = sc.nextInt();
		char[][] str = new char[heng][];

		for (int i = 0; i < heng; i++) {
			System.out.print(i + "행의 열 크기 : ");
			int yul = sc.nextInt();
			str[i] = new char[yul]; // 각 행마다 입력받은 열크기만큼 생성
		}

		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				str[i][j] = (char) number; // 차례대로 1씩 알파벳 넣음
				number++; // 알파벳 다음으로 이동
				System.out.print(str[i][j] + " ");
			}
			System.out.println();
		}
	}

	
	public void practice8() {
		String[] str = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };
		int number = 0;

		String[][] str1 = new String[3][2];
		String[][] str2 = new String[3][2];

		System.out.println("== 1분단 ==");
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str1[i].length; j++) {
				str1[i][j] = str[number];
				number++;
				System.out.print(str1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("== 2분단 ==");
		for (int i = 0; i < str2.length; i++) {
			for (int j = 0; j < str2[i].length; j++) {
				str2[i][j] = str[number];
				number++;
				System.out.print(str2[i][j] + " ");
			}
			System.out.println();
		}
	}

	
	public void practice9() {

		String[] str = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };
		int number = 0;
		Scanner sc = new Scanner(System.in);

		int bundan = 0;
		String line = "";
		String direction = "";

		String[][] str1 = new String[3][2];
		String[][] str2 = new String[3][2];

		System.out.println("== 1분단 ==");
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str1[i].length; j++) {
				str1[i][j] = str[number];
				number++;
				System.out.print(str1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("== 2분단 ==");
		for (int i = 0; i < str2.length; i++) {
			for (int j = 0; j < str2[i].length; j++) {
				str2[i][j] = str[number];
				number++;
				System.out.print(str2[i][j] + " ");
			}
			System.out.println();
		}

		while (true) {
			boolean isFlag = false;
			System.out.println("========================");
			System.out.print("검색할 학생 이름을 입력하세요 : ");
			String name = sc.next();

			for (int i = 0; i < str1.length; i++) {
				for (int j = 0; j < str1[i].length; j++) {
					if (str1[i][j].equals(name)) {
						bundan = 1;
						isFlag = true; // 찾았다는 기호 플래그
						if (i == 0) {
							line = "첫";
							if (j == 0) {
								direction = "왼";
							} else {
								direction = "오른";
							}
						} else if (i == 1) {
							line = "두";
							if (j == 0) {
								direction = "왼";
							} else {
								direction = "오른";
							}
						} else {
							line = "세";
							if (j == 0) {
								direction = "왼";
							} else {
								direction = "오른";
							}
						}
					}
				}
			}

			for (int i = 0; i < str2.length; i++) {
				for (int j = 0; j < str2[i].length; j++) {
					if (str2[i][j].equals(name)) {
						isFlag = true;
						bundan = 2;
						if (i == 0) {
							line = "첫";
							if (j == 0) {
								direction = "왼";
							} else {
								direction = "오른";
							}
						} else if (i == 1) {
							line = "두";
							if (j == 0) {
								direction = "왼";
							} else {
								direction = "오른";
							}
						} else {
							line = "세";
							if (j == 0) {
								direction = "왼";
							} else {
								direction = "오른";
							}
						}
					}
				}
			}

			if (isFlag == false) {
				System.out.println(name+"학생은 없습니다.");
				continue;
			} else {
				System.out
						.println("검색하신 " + name + " 학생은 " + bundan + "분단 " + line + " 번째 줄 " + direction + "쪽에 있습니다.");
				break;
			}

		}
	}

}
