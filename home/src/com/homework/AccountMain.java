package com.homework;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AccountMain {
	private static Account[] accountsArray = new Account[999];
	private static Scanner scanner = new Scanner(System.in);
	private static final String PREDIX = "Bank-";
	private static int seq = 0;
	private static boolean isCreatd = false;

	public static void main(String[] args) {	

		boolean run = true;

		while (run) {
			System.out.println("1.신규|2.폐지|3.예금|4.출금|5.계좌조회(개별)|6.계좌조회(전체)|7.종료");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();

			switch (selectNo) {
			case 1://신규
				createAccount();
				break;
			case 2://폐지
			
				
				break;
			case 3://입금
				deposit();				
				break;
			case 4://출금
				withdraw();
				break;
			case 5:
				accountList();
				break;
			case 6:
				accountList();
				break;
			case 7:
				run = false;
				break;
		
			}

		}		
		System.out.println("프로그램 종료");
	}// end of main()

//	private static void removeAccount() {
//		String ano = PREDIX + String.format(new DecimalFormat("000").format(++seq));
//		System.out.println("예금자명>");
//		String owner = scanner.next();
//
//		
//		int amount = 0;
//		for (int i = 0; i < accountsArray.length; i++) {
//			if (accountsArray[i] == null) {
//				accountsArray[i] = new Account(ano, owner, amount);
//				System.out.println("계좌 등록성공");
//				System.out.println("계좌번호 : "+ano);
//				System.out.println("잔액 : " +amount );
//				isCreatd = true;
//				break;
//			}
//		}
//	}// end of createAccount()




	private static void withdraw() {
		if (!isRegistered()) {
			System.out.println("먼저 계좌등록을 하세요");
			return;
		}
		accountList();
		System.out.println("출금할 계좌번호를 선택하세요>");
		Account account;
		while (true) {
			String ano = scanner.next();
			account = findAccount(ano);
			if (account == null) 
				System.out.println("계좌번호를 확인하세요");
			 else 
				break;
		}
				System.out.println("출금할 금액을 입력하세요>");
				int amount = scanner.nextInt();
				int result;
				try {
					result = account.withdraw(amount);
					System.out.println("출금액 :" + result);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}				
	}// end of withdraw()
		
	private static void deposit() {
		if (!isRegistered()) {
			System.out.println("먼저 계좌등록을 하세요");
			return;
		}
		accountList();
		System.out.println("입금할 계좌번호를 선택하세요>");		
		Account account;
		while(true) {
			String ano = scanner.next();
			account = findAccount(ano);
			if(account==null) 
				System.out.println("계좌번호를 확인하세요>");
			else 
				break;			
		}
		System.out.println("입금할 금액을 입력하세요>");
		int amount = scanner.nextInt();
		if(amount>20000) {
			System.out.println("20000원 초과입니다.");
			
		}else {
		account.deposit(amount);
		System.out.println("예금 성공");
		}
	}//end of deposit()
	

	private static void createAccount() {
		String ano = PREDIX + String.format(new DecimalFormat("000").format(++seq));
		System.out.println("예금자명>");
		String owner = scanner.next();

		
		int amount = 0;
		for (int i = 0; i < accountsArray.length; i++) {
			if (accountsArray[i] == null) {
				accountsArray[i] = new Account(ano, owner, amount);
				System.out.println("계좌 등록성공");
				System.out.println("계좌번호 : "+ano);
				System.out.println("잔액 : " +amount );
				isCreatd = true;
				break;
			}
		}
	}// end of createAccount()

	private static boolean isRegistered() {
		return isCreatd;
	}// end of isRegistered()

	private static Account findAccount(String ano) {
		Account account = null;
		for (int i = 0; 1 < accountsArray.length; i++) {
			if (accountsArray[i]!= null)
				if (accountsArray[i].getAno().equals(ano)) {
					account = accountsArray[i];
				}
		}
		return account;
	}// end of findAccount

	private static void accountList() {
		if (!isRegistered()) {
			System.out.println("먼저 계좌등록을 하세요");
			return;
		}
		for (int i = 0; i < accountsArray.length; i++) {
			if (accountsArray[i] != null) {
				System.out.println(accountsArray[i].getAno() + accountsArray[i].getOwner() + accountsArray[i].getBalance());
			}
		}
	}
}// end of class