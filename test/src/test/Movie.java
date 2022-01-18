package test;

import java.util.Scanner;

public class Movie {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] seat = new String[6][10];

		//좌석 배열
		int cnt = 0;
		for(int i=0; i<seat.length; i++) {
			for(int j=0; j<seat[i].length; j++) {
				seat[i][j] = "" + ++cnt;
			}
		}
		
		while(true) {
			
			//좌석 보여주기
			for(int i=0; i<seat.length; i++) {
				for(int j=0; j<seat[i].length; j++) {
					System.out.printf("%3s", seat[i][j]);
				}
				System.out.println();
			}
			
			//좌석 선택
			System.out.print("영화관 좌석을 선택하세요(1~60)>>");
			int mySeat = sc.nextInt();
			int myRow = (mySeat - 1) / 10;	// 0.0 1.0 2.0 이런수가 나올수있음
			int myCol = (mySeat - 1) % 10;  // 0~9숫자가나오고 
//			int myRow = (mySeat % 10 == 0) ? (mySeat / 10) - 1 : (mySeat / 10);
//			int myCol = (mySeat % 10 == 0) ? 9 : (mySeat % 10) - 1;
			
			if(mySeat < 1 || mySeat >60) {
				System.out.println("잘못된 좌석 번호입니다. 다시 선택하세요.");
				continue;
			}

			if(seat[myRow][myCol].equals("X")) {
				System.out.println("이미 예약된 좌석입니다. 다른 좌석을 선택하십시오.");
			}
			else {
				seat[myRow][myCol] = "X";
				System.out.println("예매가 완료되었습니다.");
			}
		}

	}

}
