package com.work;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account implements AccountIf {

	private String owner; // 예금주이름
	private String ano; // 계좌번호
	private int balance; // 잔고

	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	protected String getAno() {
		return ano;
	}
	protected String getOwner() {
		return owner;
	}
	protected int getBalance() {
		return balance;
	}

	@Override
	public int deposit(int anount) throws Exception {
		if (anount < 0) {
			throw new Exception("음수입니다..");
		} else if (anount > 20000) {
			throw new Exception("2만원 이상입니다.");
		} else if (this.balance + anount > 50000) {
			throw new Exception("5만원 초과입니다..");
		} else {
			this.balance += anount;
			return anount;
		}
	}//deposit 입금

	@Override
	public int withdraw(int anount) throws Exception {
		if (this.balance < anount) {
			throw new Exception("잔액이 모자랍니다.");
		} else {
			this.balance -= anount;
			return anount;
		}
	}//withdraw 출금

	private static Account[] accountsArray = new Account[5];
	private static Scanner scanner = new Scanner(System.in);
	private static int seq = 0;              //계좌번호 생성
	private static boolean isCreatd = false; //계좌등록확인

//	protected static void removeAccount() {	//폐지
//		if (!isRegistered()) {
//			System.out.println("먼저 계좌등록을 하세요");
//			return;
//		}
//		System.out.println("해지할 계좌번호");
//		AccountIf account;
//		String ano = scanner.next();
//		account = findAccount(ano);
//		
//		if (account == null) {
//			System.out.println("계좌번호를 확인하세요");
//
//		} else if (account != null) {
//			findAccount3(ano);
//			System.out.println("계좌 해지");
//		}
//	}// 폐지
	
//	protected static void createAccount() { // 신규 등록
//		if (accountList4() == 5) {
//			System.out.println("계좌가 5개입니다");
//		} else {
//			String ano = String.format(new DecimalFormat("000").format(++seq));
//			int amount = 0;
//
//			System.out.print("예금자명>");
//			AccountIf account;
//			String owner = scanner.next();
//			account = findAccount2(owner);
//			if (account != null) {
//				System.out.println("중복입니다");
//			} else {
//				for (int j = 0; j < accountsArray.length; j++) {
//					if (accountsArray[j] == null) {
//						accountsArray[j] = new Account(ano, owner, amount);
//						System.out.println("계좌 등록성공");
//						System.out.println("계좌번호 : " + ano);
//						System.out.println("잔액 : " + amount);
//						isCreatd = true;
//						break;
//					}
//				}
//			}
//		}
//	} // 신규 등록

	protected static void withdraw() {// 출금
		if (!isRegistered()) {
			System.out.println("먼저 계좌등록을 하세요");
			return;
		}

		System.out.println("출금할 계좌번호를 선택하세요>");
		AccountIf anochk = AnoChk();
		
		System.out.println("출금할 금액을 입력하세요>");
		int amount = scanner.nextInt();
		int result;
		try {
			result = anochk.withdraw(amount);
			System.out.println("출금액 :" + result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}// 출금

	protected static void deposit() throws Exception {// 입금
		if (!isRegistered()) {
			System.out.println("먼저 계좌등록을 하세요");
			return;
		}
		System.out.println("입금할 계좌번호를 선택하세요>");
		AccountIf anochk = AnoChk();
		
		System.out.println("입금할 금액을 입력하세요>");
		int amount = scanner.nextInt();
		anochk.deposit(amount);
			System.out.println("예금 성공");
		
	}// 입금
	
	private static AccountIf AnoChk() {//계좌번호 체크
		AccountIf anochk;
		while (true) {
			String ano = scanner.next();
			anochk = findAccount(ano);
			if (anochk == null)
				System.out.println("계좌번호를 확인하세요>");
			else
				break;
		}
		return anochk;
	}//계좌번호 체크
	
	private static Account findAccount(String ano) {// 계좌등록조회
		Account account = null;
		for (int i = 0; i < accountsArray.length; i++) {
			if (accountsArray[i] != null)
				if (accountsArray[i].getAno().equals(ano)) {
					account = accountsArray[i];
				}
		}
		return account;
	}// 계좌등록조회
	
	private static AccountIf findAccount2(String owner) {// 중복확인
		AccountIf account = null;
		for (int i = 0; i < accountsArray.length; i++) {
			if (accountsArray[i] != null)
				if (accountsArray[i].getOwner().equals(owner)) {
					account = accountsArray[i];
				}
		}
		return account;
	}// 중복확인
	
	private static void findAccount3(String ano) {// 빈계좌조회(폐지)
		for (int i = 0; i < accountsArray.length; i++) {
			if (accountsArray[i] != null)
				if (accountsArray[i].getAno().equals(ano)) {
					accountsArray[i] = null;
			}
		}
	} // 빈계좌조회(폐지)
	
//	protected static void accountList2() {// 개별계좌 조회
//		if (!isRegistered()) {
//			System.out.println("먼저 계좌등록을 하세요");
//			return;
//		}
//		System.out.println("계좌번호를 선택하세요>");
//		Account account;
//		while (true) {
//			String ano = scanner.next();
//			account = findAccount(ano);
//			if (account == null)
//				System.out.println("계좌번호를 확인하세요>");
//			else
//				break;
//		}
//		
//		System.out
//				.println("계좌번호 : " + account.getAno() + 
//						", 이름 : " + account.getOwner() + 
//						", 잔액 : " + account.getBalance());
//	}// 개별계좌 조회

	private static int accountList4() {// 계좌카운트
		int count = 0;
		for (int i = 0; i < accountsArray.length; i++) {
			if (accountsArray[i] != null) {
				count++;
			}
		}
		return count;
	}// 계좌카운트
	
	private static boolean isRegistered() {// 계좌등록확인
		return isCreatd;
	} // 계좌등록확인

	public Account() {
		super();
	}
	@Override	//신규
	public Account createNewAccount() {
		if (accountList4() == 5) {
			System.out.println("계좌가 5개입니다");
		} else {
			String ano = String.format(new DecimalFormat("000").format(++seq));
			int amount = 0;

			System.out.print("예금자명>");
			AccountIf account;
			String owner = scanner.next();
			account = findAccount2(owner);
			if (account != null) {
				System.out.println("중복입니다");
			} else {
				for (int j = 0; j < accountsArray.length; j++) {
					if (accountsArray[j] == null) {
						accountsArray[j] = new Account(ano, owner, amount);
						System.out.println("계좌 등록성공");
						System.out.println("계좌번호 : " + ano);
						System.out.println("잔액 : " + amount);
						isCreatd = true;
						break;
					}
				}
			}
		}
		return null;
	}
	@Override// 폐지
	public Account deleteAccount() {

		System.out.println("해지할 계좌번호");
		AccountIf account;
		String ano = scanner.next();
		account = findAccount(ano);
		
		if (account == null) {
			System.out.println("계좌번호를 확인하세요");

		} else if (account != null) {
			findAccount3(ano);
			System.out.println("계좌 해지");
		}
		return null;
	}
	@Override	// 개별 조회
	public void printAccount() {
		if (!isRegistered()) {
			System.out.println("먼저 계좌등록을 하세요");
			return;
		}
		System.out.println("계좌번호를 선택하세요>");
		Account account;
		while (true) {
			String ano = scanner.next();
			account = findAccount(ano);
			if (account == null)
				System.out.println("계좌번호를 확인하세요>");
			else
				break;
		}
		
		System.out
				.println("계좌번호 : " + account.getAno() + 
						", 이름 : " + account.getOwner() + 
						", 잔액 : " + account.getBalance());
	}
	@Override	// 전체 조회
	public void printAllAccount() {
		if (!isRegistered()) {
			System.out.println("먼저 계좌등록을 하세요");
			return;
		}
		for (int i = 0; i < accountsArray.length; i++) {
			if (accountsArray[i] != null) {
				System.out.println(
						"계좌번호 : " + accountsArray[i].getAno() + 
						", 이름 : " + accountsArray[i].getOwner() + 
						", 잔액 : "	+ accountsArray[i].getBalance());
			}
		}
		System.out.println("잔여수 : " + (accountsArray.length - accountList4()));		
	}
	

////계좌리스트
//private static void accountList() {
//	if (!isRegistered()) {
//		System.out.println("먼저 계좌등록을 하세요");
//		return;
//	}
//	for (int i = 0; i < accountsArray.length; i++) {
//		if (accountsArray[i] != null) {
//			System.out.println("계좌번호 : " + accountsArray[i].getAno() + ", 이름 : " + accountsArray[i].getOwner() + ", 잔액 : "
//					+ accountsArray[i].getBalance());
//		}
//	}
//}//계좌리스트

}