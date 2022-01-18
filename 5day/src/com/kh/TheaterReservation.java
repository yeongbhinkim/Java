package com.kh;

import java.util.Scanner;

/*
 * 영화관 좌석 예매 시스템 구현하기
 */
public class TheaterReservation {

	public static void main(String[] args) {
//틀
		int row = 6;
		int col = 10;
		String[][] seats = new String[row][col];
		boolean stop = false;
		Scanner scanner = new Scanner(System.in);
//정보
		// 좌석 초기화
		int seatNum = 0;
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {

				seats[i][j] = String.valueOf(++seatNum);

			}
		}
		do {
			System.out.println(">>   영화관 좌석 예매   <<");
			System.out.println("=====================");

			// 좌석현황 //출력
			for (int i = 0; i < seats.length; i++) {
				for (int j = 0; j < seats[i].length; j++) {

					System.out.printf("%3s", seats[i][j]);
														//정렬
				}
				System.out.println();
			}

			// 메뉴
			System.out.print("좌석을 선택하세요(1~60) [0.종료] : ");
			int selectedNum = Integer.parseInt(scanner.nextLine());
			if (selectedNum == 0) {
				stop = true;
				continue;
			}
			//좌표
			int seatRow = (selectedNum - 1) / 10;
			int seatCol = (selectedNum - 1) % 10;

			if (seats[seatRow][seatCol] == "X") {
				System.out.println("이미 예약된 좌석입니다!");
			} else{
				seats[seatRow][seatCol] = "X";
			} 

		} while (!stop);
		
		System.out.println("프로그램 종료!!");

	}

//	else if (seats[seatRow][seatCol]>seats.length) {
//		System.out.println("학생수를 입력해주세요");
//		continue;
//	}
}
