package com.kh;

import java.util.Scanner;

public class Scores {

	public static void main(String[] args) {

		boolean stop = false;
		Scanner scanner = new Scanner(System.in);
		int[] student = null;

		do {

			printLine(80);
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			printLine(80);
			System.out.print("���� >> ");
//			String choiceNumber = scanner.nextLine();

			switch (scanner.nextLine()) {
			case "1":
				System.out.print("�л��� > ");
				int studentCount = Integer.parseInt(scanner.nextLine());
				student = new int[studentCount];
				break;
			case "2":
				if (student == null) {
					System.out.println("�л����� �Է����ּ���");
					continue;
				}
				for (int i = 0; i < student.length; i++) {
					System.out.print("����" + (i + 1) + ">");
					student[i] = Integer.parseInt(scanner.nextLine());
				}
				break;
			case "3":
				if (student == null) {
					System.out.println("�л����� �Է����ּ���");
					continue;
				}
				for (int i = 0; i < student.length; i++) {
					System.out.println("score[" + i + "]=" + student[i]);
				}
				break;
			case "4":
				if (student == null) {
					System.out.println("�л����� �Է����ּ���");
					continue;
				}

				System.out.println("�ְ����� : " + maxScore(student));
				System.out.println("�������� : " + minScore(student));
				System.out.println(" ���   : " + avgScore(student));
				break;
			case "5":
				stop = true;
				break;
			default:
				continue;
			}

		} while (!stop);

		System.out.println("���α׷� ����!!");

	}
//	//student�迭 nullüũ
//	private static boolean isStudentNull(int[] scores) {
////		boolean isNull = false;
////		if(scores ==null) {
////			isNull = true;
////		}
////			return isNull;
//		return scores == null;
//	}

	// �ְ�����
	private static int maxScore(int[] scores) {
		int max = scores[0];
		for (int i = 1; i < scores.length; i++) {
			if (scores[i] > max) {
				max = scores[i];
			}
		}
		return max;
	}

	// ��������
	private static int minScore(int[] scores) {
		int min = scores[0];
		for (int i = 1; i < scores.length; i++) {
			if (scores[i] < min) {
				min = scores[i];
			}
		}
		return min;
	}

	// ���
	private static double avgScore(int[] scores) {
		double avg = 0;
		int sum = 0;

		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		avg = sum / (double) scores.length;
		return avg;
	}

	// �������
	public static void printLine(int count) {
		for (int i = 1; i <= count; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
}
