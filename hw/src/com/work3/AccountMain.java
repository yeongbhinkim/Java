package com.work3;

import java.util.Scanner;

public class AccountMain extends Account {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean run = true;
		String selectNo = null;
		while (run) {
			try {
				System.out.println("1.�ű�|2.����|3.����|4.���|5.������ȸ(����)|6.������ȸ(��ü)|7.����");
				System.out.print("����> ");
				selectNo = sc.nextLine();

				switch (selectNo) {
				case "1":// �ű�
					createAccount();
					break;
				case "2":// ����
					removeAccount();
					break;
				case "3":// �Ա�
					deposit();
					break;
				case "4":// ���
					withdraw();
					break;
				case "5":// ����
					accountList2();
					break;
				case "6":// ��ü
					accountList3();
					break;
				case "7":// ����
					System.out.println("���α׷� ����");
					System.exit(0);
					break;

				default:
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		sc.close();
	}// end of main()


	
}// end of class