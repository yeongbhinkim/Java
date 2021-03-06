package com.work;

import java.util.Scanner;


public class AccountMain extends Account {
	public static void main(String[] args) {
		
		AccountIf account = new Account();
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		String selectNo = null;
		while (run) {
			
			try {
				System.out.println("1.신규|2.폐지|3.예금|4.출금|5.계좌조회(개별)|6.계좌조회(전체)|7.종료");
				System.out.print("선택> ");
				selectNo = sc.nextLine();

				switch (selectNo) {
				case "1":// 신규
					account.createNewAccount();
					break;
				case "2":// 폐지
					account.deleteAccount();
					break;
				case "3":// 입금
					deposit();
					break;
				case "4":// 출금
					withdraw();
					break;
				case "5":// 개별
					account.printAccount();
					break;
				case "6":// 전체
					account.printAllAccount();
					break;
				case "7":// 종료
					System.out.println("프로그램 종료");
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