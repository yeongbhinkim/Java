package com.kh;

import java.util.Scanner;

/*
 * ��ȭ�� �¼� ���� �ý��� �����ϱ�
 */
public class TheaterReservation {

	public static void main(String[] args) {
//Ʋ
		int row = 6;
		int col = 10;
		String[][] seats = new String[row][col];
		boolean stop = false;
		Scanner scanner = new Scanner(System.in);
//����
		// �¼� �ʱ�ȭ
		int seatNum = 0;
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {

				seats[i][j] = String.valueOf(++seatNum);

			}
		}
		do {
			System.out.println(">>   ��ȭ�� �¼� ����   <<");
			System.out.println("=====================");

			// �¼���Ȳ //���
			for (int i = 0; i < seats.length; i++) {
				for (int j = 0; j < seats[i].length; j++) {

					System.out.printf("%3s", seats[i][j]);
														//����
				}
				System.out.println();
			}

			// �޴�
			System.out.print("�¼��� �����ϼ���(1~60) [0.����] : ");
			int selectedNum = Integer.parseInt(scanner.nextLine());
			if (selectedNum == 0) {
				stop = true;
				continue;
			}
			//��ǥ
			int seatRow = (selectedNum - 1) / 10;
			int seatCol = (selectedNum - 1) % 10;

			if (seats[seatRow][seatCol] == "X") {
				System.out.println("�̹� ����� �¼��Դϴ�!");
			} else{
				seats[seatRow][seatCol] = "X";
			} 

		} while (!stop);
		
		System.out.println("���α׷� ����!!");

	}

//	else if (seats[seatRow][seatCol]>seats.length) {
//		System.out.println("�л����� �Է����ּ���");
//		continue;
//	}
}
