package com.kh;

import java.util.Scanner;
public class test {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int balance = 0;
		int[] balance1 = null;

		while (run) {
			System.out.println("------------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("------------------------------------------------");
			System.out.print("����>");

			int menuNum = Integer.parseInt(scanner.nextLine());

			switch (menuNum) {
			case 1:
				System.out.print("�л���> ");
				balance = Integer.parseInt(scanner.nextLine());
				balance1 = new int[balance];
				break;
			case 2:
				for (int i = 0; i < balance1.length; i++) {
					System.out.print("����" + (i+1) + "> ");
					balance1[i] = Integer.parseInt(scanner.nextLine());
				}
				break;
			case 3:
				for (int i = 0; i < balance1.length; i++) {
					System.out.println("score"+"["+i+"] = "+balance1[i]);
				}
				break;
			case 4:
			
				int max = balance1[0];
				int min = balance1[0];
				double avg;
				int sum = 0;
				for (int i = 0; i < balance1.length; i++) {
					sum += balance1[i];
					if (max < balance1[i]) {
						max = balance1[i];
					}
				}
				avg = (double) sum / balance1.length;
				for (int i = 0; i < balance1.length; i++) {
					sum += balance1[i];
					if (min > balance1[i]) {
						min = balance1[i];
					}
				}
				System.out.println("�ְ����� = " + max);
				System.out.println("�������� = " + min);
				System.out.println("��� = " + avg);
				break;
			case 5:
				run = false;
				break;
			}
			System.out.println();
		}
		System.out.println("���α׷� ����!!");
	}
}