package com.kh;

public class MVP {

	public static void main(String[] args) {
		String value = "    ";
		String[][] names = { { "    ", "김재엽", "    ", "박성모", "    ", "박현근", "    ", "이규민" },
				{ "배지희", "    ", "유기상", "    ", "최재훈", "    ", "권영경", "    " },
				{ "이준혁", "김강현", "이한봄", "김무년", "전은우", "김세영", "전윤해", "김소라" },
				{ "김영빈", "    ", "하태우", "    ", "조세령", "    ", "최수빈", "    " }, };

		printLine(85);
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[i].length; j++) {
				if (names[i][j] != value) {
					System.out.print(names[i][j] + "(" + i + "," + j + ")");
				} else {
					System.out.print("빈자리(" + i + "," + j + ")");
				}
			}

			System.out.println();
		}
		printLine(85);

		int randomRow = (int) (Math.random() * names.length);
		int randomCol = (int) (Math.random() * names[randomRow].length);

		System.out.printf("오늘의 MVP 두구두구두구~~(%d,%d)\n", randomRow, randomCol);
		if (names[randomRow][randomCol] != value) {
			System.out.println(names[randomRow][randomCol] + "님 축하합니다!!");
		} else {
			System.out.println("아쉽게 다음기회에!");
		}
	}

	public static void printLine(int count) {
		for (int i = 1; i <= count; i++) {
			System.out.print("=");
		}
		System.out.println();
	}
}
