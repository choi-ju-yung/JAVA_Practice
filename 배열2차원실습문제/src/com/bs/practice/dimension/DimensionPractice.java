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
				sarray[i][j] = (int) (Math.random() * 10 + 1); // 2�� 2������ ������ ����
				sarray[i][sarray.length - 1] += sarray[i][j]; // �� ������ �� ���ϱ�
			}
		}

		for (int i = 0; i < sarray.length; i++) { //
			for (int j = 0; j < sarray.length - 1; j++) {
				sarray[3][i] += sarray[j][i]; // �� ������ �� ���ϱ�
			}

			if (i == sarray.length - 1) { // 3��3���� ���� ������ �� ���ϱ�
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
			System.out.print("�� ũ�� : ");
			int heng = sc.nextInt();
			if (heng > 10 || heng < 1) {
				System.out.println("1~10������ ���ڸ� �Է��ϼ���");
				continue;
			}

			System.out.print("�� ũ�� : ");
			int yul = sc.nextInt();
			if (yul > 10 || yul < 1) {
				System.out.println("1~10������ ���ڸ� �Է��ϼ���");
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
		String[][] strArr = new String[][] { { "��", "��", "��", "��", "��" }, { "��", "��", "��", "��", "��" },
				{ "��", "��", "��", "��", "��" }, { "��", "��", "��", "��", "��" }, { "��", "��", "! ", "��", "!! " } };

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
		System.out.print("���� ũ�� : ");
		int heng = sc.nextInt();
		char[][] str = new char[heng][];

		for (int i = 0; i < heng; i++) {
			System.out.print(i + "���� �� ũ�� : ");
			int yul = sc.nextInt();
			str[i] = new char[yul]; // �� �ึ�� �Է¹��� ��ũ�⸸ŭ ����
		}

		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				str[i][j] = (char) number; // ���ʴ�� 1�� ���ĺ� ����
				number++; // ���ĺ� �������� �̵�
				System.out.print(str[i][j] + " ");
			}
			System.out.println();
		}
	}

	
	public void practice8() {
		String[] str = { "���ǰ�", "������", "�����", "�����", "���̹�", "�ں���", "�ۼ���", "������", "������", "��õ��", "��ǳǥ", "ȫ����" };
		int number = 0;

		String[][] str1 = new String[3][2];
		String[][] str2 = new String[3][2];

		System.out.println("== 1�д� ==");
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str1[i].length; j++) {
				str1[i][j] = str[number];
				number++;
				System.out.print(str1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("== 2�д� ==");
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

		String[] str = { "���ǰ�", "������", "�����", "�����", "���̹�", "�ں���", "�ۼ���", "������", "������", "��õ��", "��ǳǥ", "ȫ����" };
		int number = 0;
		Scanner sc = new Scanner(System.in);

		int bundan = 0;
		String line = "";
		String direction = "";

		String[][] str1 = new String[3][2];
		String[][] str2 = new String[3][2];

		System.out.println("== 1�д� ==");
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str1[i].length; j++) {
				str1[i][j] = str[number];
				number++;
				System.out.print(str1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("== 2�д� ==");
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
			System.out.print("�˻��� �л� �̸��� �Է��ϼ��� : ");
			String name = sc.next();

			for (int i = 0; i < str1.length; i++) {
				for (int j = 0; j < str1[i].length; j++) {
					if (str1[i][j].equals(name)) {
						bundan = 1;
						isFlag = true; // ã�Ҵٴ� ��ȣ �÷���
						if (i == 0) {
							line = "ù";
							if (j == 0) {
								direction = "��";
							} else {
								direction = "����";
							}
						} else if (i == 1) {
							line = "��";
							if (j == 0) {
								direction = "��";
							} else {
								direction = "����";
							}
						} else {
							line = "��";
							if (j == 0) {
								direction = "��";
							} else {
								direction = "����";
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
							line = "ù";
							if (j == 0) {
								direction = "��";
							} else {
								direction = "����";
							}
						} else if (i == 1) {
							line = "��";
							if (j == 0) {
								direction = "��";
							} else {
								direction = "����";
							}
						} else {
							line = "��";
							if (j == 0) {
								direction = "��";
							} else {
								direction = "����";
							}
						}
					}
				}
			}

			if (isFlag == false) {
				System.out.println(name+"�л��� �����ϴ�.");
				continue;
			} else {
				System.out
						.println("�˻��Ͻ� " + name + " �л��� " + bundan + "�д� " + line + " ��° �� " + direction + "�ʿ� �ֽ��ϴ�.");
				break;
			}

		}
	}

}
