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
		System.out.println("1.신규|2.폐지|3.예금|4.출금|5.계좌조회(개별)|6.계좌조회(전체)|7.종료");
		System.out.println("-------------------------------------");
		System.out.print("선택> ");
		String menuNum = null;
		 menuNum = scanner.nextLine();

		switch (menuNum) {
		case "1"://신규
			System.out.print("이름 : ");
			id = scanner.nextLine();
			LoginChk loginChk = accountIf.isMember(id);
			
			
			break;
		case "2"://폐지
		
			break;
		case "3":
			//계좌번호 예금액을 넣기
			System.out.print("예금액> ");
			balance += Integer.parseInt(scanner.nextLine());
			break;
		case "4":
			System.out.print("출금액> ");
			balance -= Integer.parseInt(scanner.nextLine());
			break;
		case "5":
			System.out.print("잔고> ");
			System.out.println(balance);
			break;
		case "6":
			System.out.print("예금액> ");
			balance += Integer.parseInt(scanner.nextLine());
			break;
		case "7":
			run = false;
			break;
		}

		System.out.println();
	}
	
	System.out.println("프로그램 종료");

}

}
