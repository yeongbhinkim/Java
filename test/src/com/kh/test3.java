package com.kh;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;

		String[][] names = { 
				{ " 1", " 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9", "10" },
				{ "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" },
				{ "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" },
				{ "31", "32", "33", "34", "35", "36", "37", "38", "39", "40" },
				{ "41", "42", "43", "44", "45", "46", "47", "48", "49", "50" },
				{ "51", "52", "53", "54", "55", "56", "57", "58", "59", "60" }, };

		while (run) {

			for (int i = 0; i < names.length; i++) {
				for (int j = 0; j < names[i].length; j++) {
					System.out.print(names[i][j] + " ");
				}
				System.out.println();
			}

			System.out.print("��ȭ�� �¼��� �����ϼ��� (1~60, 0:����) >>");

			int menuNum = Integer.parseInt(scanner.nextLine());
			int row = (menuNum - 1) / 10;
			int col = (menuNum - 1) % 10;
			if (menuNum == 0) {
				run = false;
				System.out.println("���α׷� ����");
			} else if (names[row][col] != "X") {
				names[row][col] = "X";
				System.out.println("                                 ");
				System.out.println("                                 ");
				System.out.println("����Ǿ����ϴ�");
			} else if (names[row][col] == "X") {
				System.out.println("                                 ");
				System.out.println("                                 ");
				System.out.println("�̹� ����Ǿ����ϴ�!!");
				System.out.println("�ٸ��¼��� �������ּ���!!");

			}

		}
	}
}