package com.kh;

public class For2 {

	public static void main(String[] args) {

		int startDansu = 1;
		int endDansu = 10;

		for (int i = startDansu; i <= endDansu; i++) {

			if (i % 2 == 0) {
				continue;
			} // for문 내에서 continue를 만나면 변경식으로 제어가 이동된다.

			System.out.println("===" + i + "단 출력 ===");

			for (int j = 1; j <= 9; j++) {

				System.out.println(i + " * " + j + " = " + i * j);

			}
		}

	}

}

//for (int i = 2; i <= 3; i++) {
//1		2,12,22		11,21
//for (int j = 1; j <= 2; j++) {
//	3,13	4,7,10,14,17,20		6,9,16,19
//System.out.println(i + " * " + j + " = " + i * j);
//5,8,15,18