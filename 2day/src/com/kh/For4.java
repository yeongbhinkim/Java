package com.kh;

public class For4 {

	public static void main(String[] args) {
		// 4행 4열 별표 출력
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j > 0; j--) {
				if (j < i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}		
			}
			System.out.println();
		}
		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >= 1; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}		
			}
			System.out.println();
		}
	}
}
//i		1 |	2 2 | 3 3 3 | 4 4 4 4
//j		1 |	1 2 | 1 2 3 | 1 2 3 4
//출력	o |	o o | o o o | o o o o
//마름모?
//sss* 
//ss**
//s***
//****