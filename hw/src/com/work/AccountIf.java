package com.work;

public interface AccountIf {

	int deposit(int anount) throws Exception;//deposit 입금

	int withdraw(int anount) throws Exception;//withdraw 출금

	//신규
	Account createNewAccount();

	// 폐지
	Account deleteAccount();
	
	// 개별 조회
	void printAccount();

	// 전체 조회
	void printAllAccount();
}