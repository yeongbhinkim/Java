package com.kh;

public class Array1 {

	public static void main(String[] args) {

		// �迭 ���� : new ���
		int[] score = new int[3];
		score[0] = 10;
		score[1] = 20;
		score[2] = 30;

		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}

		// �迭 ���� : {}
		int[] score2 = { 10, 20, 30 };

		for (int i = 0; i < score2.length; i++) {
			System.out.println(score2[i]);
		}
//		���ٿ� �迭 �����ؾ���.		
//		int score3;
//		score3 = {10,20,30};
		
		int[] score3;
		score3 = new int[] { 10, 20, 30 };

		int[] score4; 			// �迭 ����
		score4 = new int[3];// �迭 ����

		// �迭����
		int[] score5 = new int[] { 10, 20, 30 };
		for (int i = 0; i < score2.length; i++) {
			System.out.println(score2[i]);
		}
	}

}