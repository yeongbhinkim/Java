package com.kh.bank;

public interface AccountIf {

	/**
	 * 입금
	 * @param money
	 */
	void deposit(int money);

	/**
	 * 출금
	 * @param money
	 */
	void withraw(int money);

	/**
	 * 조회
	 * @return
	 */
	String findAccount();

}