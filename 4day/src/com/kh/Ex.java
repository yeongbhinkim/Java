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
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.print("���� > ");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo == 1) {
				System.out.print("�л��� > ");
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
				System.out.println("�ְ�����: " + max);
				avg = (double)sum / scores.length;
				System.out.println("�հ�����: " + sum);
				System.out.println("�������: " + avg);
			} else if(selectNo == 5) {
				System.out.println("���α׷� ����");
				System.exit(0);
			}
		}
	}
}
 


