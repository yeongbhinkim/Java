package com.kh;

import java.util.Scanner;

/*
 * �޴� : 1.���� 2.��� 3.����
 * ��,��,�� 3���� ������ �Է¹޾Ƽ� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
*/
public class Average2 {

	public static void main(String[] args) {

		int sum = 0; // ����
		double avg = 0.0; // ���
		Scanner scanner = new Scanner(System.in);

		System.out.println("��,��,�� 3���� ������ �Է¹޾� ��ձ��ϴ� ���α׷��Դϴ�.");
		System.out.print("�������� : ");
		int kor = Integer.parseInt(scanner.nextLine());
		System.out.print("�������� : ");
		int eng = Integer.parseInt(scanner.nextLine());
		System.out.print("�������� : ");
		int math = Integer.parseInt(scanner.nextLine());

		sum = kor + eng + math;
		avg = (double) sum / 3;

//		System.out.println("���� : " + sum);
//		System.out.println("��� : " + avg);
		boolean run = true;

//		int balance = 0;

//		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1.���� | 2.��� | 3.���� |");
			System.out.println("-------------------------------------");
			System.out.print("����> ");

			int menuNum = Integer.parseInt(scanner.nextLine());

			switch (menuNum) {
			case 1:
				System.out.print("���� : " + sum);
//				balance += Integer.parseInt(scanner.nextLine());
				break;
			case 2:
				System.out.print("��� : " + avg);
//				balance -= Integer.parseInt(scanner.nextLine());
				break;
			case 3:
				run = false;
				break;
			}

			System.out.println();
		}

		System.out.println("���α׷� ����");
	}
}