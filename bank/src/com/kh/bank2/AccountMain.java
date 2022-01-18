package com.kh.bank2;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		
		Account[] account = new Account[5];
		Scanner scanner = new Scanner(System.in);
		boolean stop = false;
		
		while(!stop) {
			try {
				String choiceNum = null;		 //선택한 메뉴
				String accountName = null;	 //예금주명 
				String accountNumber = null; //계좌번호
				int money = 0;							 //입출금액
				
				System.out.println("1.신규 2.폐지 3.입금 4.출금 5.계좌조회(개별) 6.계좌조회(전체) 7.종료(x)");
				System.out.print("선택 > ");
				choiceNum = scanner.nextLine();
				
				switch (choiceNum) {
				case "1": //신규
					System.out.print("예금주명 : ");
					accountName = scanner.nextLine();
					//계좌생성
					createAccount(account, accountName);
					break;
				case "2": //폐지
					System.out.print("계좌번호 : ");
					accountNumber = scanner.nextLine();
					//계좌폐지
					closedAccount(account, accountNumber);
					
					break;
				case "3": //입금
					System.out.print("계좌번호 : ");
					accountNumber = scanner.nextLine();
					System.out.print("입금액 : ");
					money = Integer.parseInt(scanner.nextLine());
					
					deposit1(account, accountNumber, money);				
					break;
				case "4": //출금
					System.out.print("계좌번호 : ");
					accountNumber = scanner.nextLine();
					System.out.print("출금액 : ");
					money = Integer.parseInt(scanner.nextLine());
					
					withdaw(account, accountNumber, money);				
					break;
				case "5": //개별조회
					System.out.print("계좌번호 : ");
					accountNumber = scanner.nextLine();
					
					showAccount(account, accountNumber);
					break;
				case "6": //전체조회
					showAccountAll(account);
					break;
				case "7":	// 종료
					System.exit(0);
					break;
				default:
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	//전체 조회
	private static void showAccountAll(AccountIf[] account) {
		for(int i=0; i<account.length; i++) {
			if(account[i] != null) {
				System.out.println(account[i].findAccount());
			}
		}
	}

	//개별 계좌조회
	private static void showAccount(Account[] account, String accountNumber) {
		for(int i=0; i<account.length; i++) {
			if(account[i].getAccountNumber().equals(accountNumber)) {
				System.out.println(account[i].findAccount());
				break;
			}
		}
	}
	// 출금
	private static void withdaw(Account[] account, String accountNumber, int money) {
		for(int i=0; i<account.length; i++) {
			if(account[i].getAccountNumber().equals(accountNumber)) {
				account[i].withraw(money);
				break;
			}
		}
	}

	// 입금
	private static void deposit1(Account[] account, String accountNumber, int money) {
		for(int i=0; i<account.length; i++) {
			if(account[i].getAccountNumber().equals(accountNumber)) {
				account[i].deposit(money);
				break;
			}
		}
	}

	//계좌 폐지
	private static void closedAccount(Account[] account, String accountNumber) {
		boolean flag = false;
		AccountIf findedAccount = null;
		for(int i=0; i<account.length; i++) {
			if(account[i].getAccountNumber().equals(accountNumber)) {
				findedAccount =  account[i];
				account[i] = null;
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.println("계좌가 폐지되었습니다." + findedAccount);			
		}else {
			System.out.println("찾고자 하는 계좌가 없습니다");
		}
	}

	//계좌생성
	private static void createAccount(AccountIf[] account, String accountName) {
		AccountIf createdAccount = null;
		
		//동명이인 체크로직 삽입
		
		boolean flag = false;
		for(int i=0; i<account.length; i++) {
			if( account[i] == null) {
				account[i] = new Account(accountName);
				createdAccount = account[i];
				flag = true;
				break;
			}
		}
		if(!flag) {
			System.out.println("개설 가능한 계좌수가 초과되었습니다.");
		}else {
			System.out.println("계좌가 개설되었습니다."+createdAccount);
		}
	}

}
