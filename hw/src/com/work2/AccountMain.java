package com.work2;

import java.util.Scanner;

public class AccountMain extends Account {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean run = true;
		String selectNo = null;
//중복제거 인터페이스 입력값이 중복
		while (run) {
			try {
				System.out.println("1.신규|2.폐지|3.예금|4.출금|5.계좌조회(개별)|6.계좌조회(전체)|7.종료");
				System.out.print("선택> ");
				selectNo = sc.nextLine();

				switch (selectNo) {
				case "1":// 신규
					createAccount();
					break;
				case "2":// 폐지
					removeAccount();
					break;
				case "3":// 입금
					deposit();
					break;
				case "4":// 출금
					withdraw();
					break;
				case "5":// 개별
					accountList3();
					break;
				case "6":// 전체
					accountList2();
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

//	//계좌리스트
//	private static void accountList() {
//		if (!isRegistered()) {
//			System.out.println("먼저 계좌등록을 하세요");
//			return;
//		}
//		for (int i = 0; i < accountsArray.length; i++) {
//			if (accountsArray[i] != null) {
//				System.out.println("계좌번호 : " + accountsArray[i].getAno() + ", 이름 : " + accountsArray[i].getOwner() + ", 잔액 : "
//						+ accountsArray[i].getBalance());
//			}
//		}
//	}//계좌리스트

	
}// end of class