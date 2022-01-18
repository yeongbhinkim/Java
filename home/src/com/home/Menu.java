package com.home;

import java.util.Scanner;



public class Menu {
	Scanner scanner = new Scanner(System.in);
	private AccountIf accountIf;
	
	public Menu() {
		super();
		this.accountIf = new Account();		
	}
	
	public void initMenu() {
	boolean run = true;

	int balance = 0;
	String id = null;

	while (run) {
		System.out.println("-------------------------------------");
		System.out.println("1.�ű�|2.����|3.����|4.���|5.������ȸ(����)|6.������ȸ(��ü)|7.����");
		System.out.println("-------------------------------------");
		System.out.print("����> ");
		String menuNum = null;
		 menuNum = scanner.nextLine();

		switch (menuNum) {
		case "1"://�ű�
			System.out.print("�̸� : ");
			id = scanner.nextLine();
			LoginChk loginChk = accountIf.isMember(id);
			
			
			break;
		case "2"://����
		
			break;
		case "3":
			//���¹�ȣ ���ݾ��� �ֱ�
			System.out.print("���ݾ�> ");
			balance += Integer.parseInt(scanner.nextLine());
			break;
		case "4":
			System.out.print("��ݾ�> ");
			balance -= Integer.parseInt(scanner.nextLine());
			break;
		case "5":
			System.out.print("�ܰ�> ");
			System.out.println(balance);
			break;
		case "6":
			System.out.print("���ݾ�> ");
			balance += Integer.parseInt(scanner.nextLine());
			break;
		case "7":
			run = false;
			break;
		}

		System.out.println();
	}
	
	System.out.println("���α׷� ����");

}

}
