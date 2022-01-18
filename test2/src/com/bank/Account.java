package com.bank;

public class Account implements AccountIf {
	private String accountName; // 예금주 이름
	private String accountNumber; // 계좌번호
	private int balance; // 잔고

	private static int cnt; // 개설된 계좌갯수 카운트
	// 계좌번호 3자리
	private static final int ACCOUNT_NUM_SIZE = 3;
	// 1회 입금한도
	private static final int ONE_TIME_MONEY_LIMIT = 20_000;
	// 예치금 한도
	private static final int DEPOSIT_MONEY_LIMIT = 50_000;

//		public Account() {
//			super();
//		}

	public Account(String accountName) {
		this.accountName = accountName;
		cnt++;
		this.accountNumber = createAccountNumber();
	}

	//입금
	@Override
	public void deposit(int money) {
		String msg = null;
		// 음수체크
		if (money < 0) {
			throw new IllegalArgumentException("음수값이 입력되었습니다.");
		}
		// 1회 입금한도 체크
		if (money > 20000) {
			msg = "1회 입금한도가 " + ONE_TIME_MONEY_LIMIT + " 초과하였습니다.";
			throw new IllegalArgumentException();
		}
		// 예치금한도 체크
		if (this.balance + money > DEPOSIT_MONEY_LIMIT) {
			msg = "예금한도가 + DEPOSIT_MONEY_LIMIT + 초과하였습니다.";
			throw new IllegalArgumentException();
		}
		this.balance += money;
	}

	// 출금
	@Override
	public void withraw(int money) {
		// 음수체크
		if (money < 0) {
			throw new IllegalArgumentException("음수값이 입력되었습니다.");
		}
		// 잔액보다 출금액이 큰경우
		if (this.balance < money) {
			throw new IllegalArgumentException("잔액이 부족합니다.");
		}
		this.balance -= money;
	}

	// 조회
	@Override
	public String findAccount() {
		String str = "계좌번호 : " + this.accountNumber + "\t" + "예금주이름 : " + this.accountName + "\t" + "잔고 : " + this.balance;
		return str;
	}

	public String getAccountName() {
		return accountName;
	}

	public int getBalance() {
		return balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	// 이름변경
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	@Override
	public String toString() {
		String str = "계좌번호 : " + this.accountNumber + "\t" + "예금주이름 : " + this.accountName + "\t" + "잔고 : " + this.balance;
		return str;
	}

	private String createAccountNumber() {
		String zero = "";
		String numjber = String.valueOf(cnt);
		for (int i = 1; i <= ACCOUNT_NUM_SIZE - numjber.length(); i++) {
			zero += "0";
		}
		return zero + cnt;
	}
}
