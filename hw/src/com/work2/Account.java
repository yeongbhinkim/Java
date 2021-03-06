package com.work2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

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

	protected void setAno(String ano) {
		this.ano = ano;
	}

	protected String getOwner() {
		return owner;
	}

	protected void setOwner(String owner) {
		this.owner = owner;
	}

	protected int getBalance() {
		return balance;
	}

	protected void setBalance(int balance) {
		this.balance = balance;
	}

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
	}

	public int withdraw(int anount) throws Exception {
		if (this.balance < anount) {
			throw new Exception("잔액이 모자랍니다.");
		} else {
			this.balance -= anount;
			return anount;
		}
	}

	private static Account[] accountsArray = new Account[5];
	private static Scanner scanner = new Scanner(System.in);
	private static int seq = 0;
	private static boolean isCreatd = false;

	protected static void removeAccount() {

		System.out.println("해지할 계좌번호");
		Account account;

		String ano = scanner.next();
		account = findAccount(ano);
		if (account == null) {
			System.out.println("계좌번호를 확인하세요");

		} else if (account != null) {
			findAccount3(ano);
			System.out.println("계좌 해지");
		}
	}// 폐지

	protected static void createAccount() {
		if (accountList4() == 5) {
			System.out.println("계좌가 5개입니다");
		} else {
			String ano = String.format(new DecimalFormat("000").format(++seq));
			int amount = 0;

			System.out.print("예금자명>");
			Account account;
			String owner = scanner.next();
			account = findAccount(owner);
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
	} // 신규 등록

	protected static void withdraw() {
		if (!isRegistered()) {
			System.out.println("먼저 계좌등록을 하세요");
			return;
		}

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
	}// 출금

	protected static void deposit() throws Exception {
		if (!isRegistered()) {
			System.out.println("먼저 계좌등록을 하세요");
			return;
		}

		System.out.println("입금할 계좌번호를 선택하세요>");
		Account account;
		while (true) {
			String ano = scanner.next();
			account = findAccount(ano);
			if (account == null)
				System.out.println("계좌번호를 확인하세요>");
			else
				break;
		}
		System.out.println("입금할 금액을 입력하세요>");
		int amount = scanner.nextInt();
		if (amount > 20000) {
			System.out.println("20000원 초과입니다.");

		} else {
			account.deposit(amount);
			System.out.println("예금 성공");
		}
	}// 입금

	private static Account findAccount2(String owner) {
		Account account = null;
		for (int i = 0; i < accountsArray.length; i++) {
			if (accountsArray[i] != null)
				if (accountsArray[i].getOwner().equals(owner)) {
					account = accountsArray[i];
				}
		}
		return account;
	}// 중복확인

	private static boolean isRegistered() {
		return isCreatd;
	} // 계좌등록확인

	private static Account findAccount(String ano) {
		Account account = null;
		for (int i = 0; i < accountsArray.length; i++) {
			if (accountsArray[i] != null)
				if (accountsArray[i].getAno().equals(ano)) {
					account = accountsArray[i];
				}
		}
		return account;
	}// 계좌등록조회

	private static void findAccount3(String ano) {

		for (int i = 0; i < accountsArray.length; i++) {
			if (accountsArray[i] != null)
				if (accountsArray[i].getAno().equals(ano)) {
					accountsArray[i] = null;
				}
		}
	} // 빈계좌조회

	protected static void accountList3() {
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
				.println("계좌번호 : " + account.getAno() + ", 이름 : " + account.getOwner() + ", 잔액 : " + account.getBalance());
	}// 개별계좌 조회

	protected static void accountList2() {
		if (!isRegistered()) {
			System.out.println("먼저 계좌등록을 하세요");
			return;
		}
		for (int i = 0; i < accountsArray.length; i++) {
			if (accountsArray[i] != null) {
				System.out.println("계좌번호 : " + accountsArray[i].getAno() + ", 이름 : " + accountsArray[i].getOwner() + ", 잔액 : "
						+ accountsArray[i].getBalance());
			}
		}
		System.out.println("잔여수 : " + (accountsArray.length - accountList4()));
	}// 전체조회

	private static int accountList4() {

		int count = 0;
		for (int i = 0; i < accountsArray.length; i++) {
			if (accountsArray[i] != null) {
				count++;
			}
		}
		return count;

	}// 계좌카운트

	public Account() {
		super();
	}

}