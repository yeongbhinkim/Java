package com.kh;

public class Lotto {

	public static void main(String[] args) {

		int[] lotto = new int[6];
		boolean stop = false;
		int count = 0;

		while (!stop) {							//���Ҵ�
			int num = (int) (Math.random() * 45) + 1;

			// �ߺ�üũ����!               ���Ҵ�  �� ī��Ʈ?
			if (dupChk(lotto, num) && count != 0) {
				continue; // ���Ҵ�
			}
			
			lotto[count++] = num;//false�� ī��Ʈ
			//count++;
			
			// ���ѷ��� ���������� ���� :
			if (count == 6) {
				stop = true;
			}
		}

		for (int i = 0; i < lotto.length; i++) {
			System.out.printf(lotto[i] + " ");
		}
	}

//�ߺ�üũ����!�޼ҵ�
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