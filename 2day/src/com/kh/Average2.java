package com.kh;

import java.util.Scanner;

/*
 * 메뉴 : 1.총점 2.평균 3.종료
 * 국,영,수 3과목 점수를 입력받아서 평균을 구하는 프로그램을 작성하시오.
 * 
*/
public class Average2 {

	public static void main(String[] args) {

		int sum = 0; // 총점
		double avg = 0.0; // 평균
		Scanner scanner = new Scanner(System.in);

		System.out.println("국,영,수 3과목 점수를 입력받아 평균구하는 프로그램입니다.");
		System.out.print("국어점수 : ");
		int kor = Integer.parseInt(scanner.nextLine());
		System.out.print("영어점수 : ");
		int eng = Integer.parseInt(scanner.nextLine());
		System.out.print("수학점수 : ");
		int math = Integer.parseInt(scanner.nextLine());

		sum = kor + eng + math;
		avg = (double) sum / 3;

//		System.out.println("총점 : " + sum);
//		System.out.println("평균 : " + avg);
		boolean run = true;

//		int balance = 0;

//		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1.총점 | 2.평균 | 3.종료 |");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");

			int menuNum = Integer.parseInt(scanner.nextLine());

			switch (menuNum) {
			case 1:
				System.out.print("총점 : " + sum);
//				balance += Integer.parseInt(scanner.nextLine());
				break;
			case 2:
				System.out.print("평균 : " + avg);
//				balance -= Integer.parseInt(scanner.nextLine());
				break;
			case 3:
				run = false;
				break;
			}

			System.out.println();
		}

		System.out.println("프로그램 종료");
	}
}