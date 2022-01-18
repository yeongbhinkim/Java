package com.kh;

public class Lotto {

	public static void main(String[] args) {

		int[] lotto = new int[6];
		boolean stop = false;
		int count = 0;

		while (!stop) {							//재할당
			int num = (int) (Math.random() * 45) + 1;

			// 중복체크로직!               재할당  는 카운트?
			if (dupChk(lotto, num) && count != 0) {
				continue; // 재할당
			}
			
			lotto[count++] = num;//false는 카운트
			//count++;
			
			// 무한루프 빠져나오는 조건 :
			if (count == 6) {
				stop = true;
			}
		}

		for (int i = 0; i < lotto.length; i++) {
			System.out.printf(lotto[i] + " ");
		}
	}

//중복체크로직!메소드
	public static boolean dupChk(int[] lotto, int num) {
		boolean result = false;

		for (int i = 0; i < lotto.length; i++) {
			if (lotto[i] == num) {
				result = true;
				break;
			}
		}

		return result;
	}		
}
