package com.kh;

import java.util.Scanner;
public class Ex {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		
		while(run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.print("선택 > ");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo == 1) {
				System.out.print("학생수 > ");
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum];
			} else if(selectNo == 2) {
				for(int i=0; i<scores.length; i++) {
					System.out.print("scores["+i+"] > ");
					scores[i] = Integer.parseInt(sc.nextLine());
				}
			} else if(selectNo == 3) {
				for(int i=0; i<scores.length; i++) {
				System.out.println("scores["+i+"] > "+scores[i]);
				}
			} else if(selectNo == 4) {
				int max=scores[0];
				double avg;
				int sum=0;
				for(int i=0; i<scores.length; i++) {
					sum += scores[i];
					if(max<scores[i]) {
						max=scores[i];
					}
				}
				System.out.println("최고점수: " + max);
				avg = (double)sum / scores.length;
				System.out.println("합계점수: " + sum);
				System.out.println("평균점수: " + avg);
			} else if(selectNo == 5) {
				System.out.println("프로그램 종료");
				System.exit(0);
			}
		}
	}
}
 


