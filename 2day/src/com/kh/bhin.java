package com.kh;

import java.util.Scanner;

public class bhin {

	public static void main(String[] args) {
		// for, 
		//while,    진행방향 조건 실행
		//do-while  진행방향 실행 조건
//		int sum = 0;
//
//		for (int i = 1; i <= 100; i++) {
//			if (i % 3 == 0) {
//				sum = sum + i;
//			}
//		}
//		System.out.println(sum);
//
//		while (true) {
//			int number = (int) (Math.random() * 6) + 1;
//			int number2 = (int) (Math.random() * 6) + 1;
//			System.out.println("(" + number + ", " + number2 + ")");
//			if ((number + number2) == 5) {
//				break;
//			}
//		}
//		System.out.println();
//
//		for (int x = 1; x <= 10; x++) {
//			for (int y = 1; y <= 10; y++) {
//				if ((4 * x) + (5 * y) == 60) {
//					System.out.println("(" + x + ", " + y + ")");
//				}
//			}
//			for (int i = 1; i <= 4; i++) {
//				for(int j =4; j>=1; j--){
//					if(j > i) {
//						System.out.print(" ");					
//					}else {
//						System.out.print("*");					
//					}
//				}
//				System.out.println();
//			}
//		}
//		for (int i = 1; i <=4; i++) {
//			for(int j = 4; j>=1; j--){
//				if(j < i) {
//					System.out.print(" ");					
//				}else {
//					System.out.print("*");					
//				}
//		}
//			System.out.println();		
//		}	
//		for(int i = 1; i<=4; i++) {
//			for(int j = 1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i = 1; i<=5; i++){      //줄
//			for(int j =0; j<=5-i; j++){ //열
//			System.out.print("s");
//		}
//			for(int k = 0; k<(2*i)-1;k++) {
//				System.out.print("*");
//			}System.out.println();
//}		
//		for(int i = 1; i<=4; i++){
//			for(int j =1; j<=i+1; j++){
//			System.out.print("s");
//		}
//			for(int k = 0; k<9-(2*i);k++) {
//				System.out.print("*");
//			}System.out.println();
//}
//		for(int i = 4; i>0; i--){
//			for(int j =0; j<6-i; j++){
//			System.out.print("s");
//		}
//			for(int k = 0; k<(2*i)-1;k++) {
//				System.out.print("*");
//			}System.out.println();
//}
//	
			
		
	
			
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------------");
			System.out.print("선택>");

			int menuNum = Integer.parseInt(scanner.nextLine());

			switch (menuNum) {
			case 1:
				System.out.print("예금액> : ");
				balance += Integer.parseInt(scanner.nextLine());
				break;
			case 2:
				System.out.print("출금액> : ");
				balance -= Integer.parseInt(scanner.nextLine());
				break;
			case 3:
				System.out.print("잔고액> : ");
				System.out.println(balance);
				break;
			case 4:
				run = false;
				break;
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");

	}
}