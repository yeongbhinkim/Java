package com.work;

public interface AccountIf {

	int deposit(int anount) throws Exception;//deposit �Ա�

	int withdraw(int anount) throws Exception;//withdraw ���

	//�ű�
	Account createNewAccount();

	// ����
	Account deleteAccount();
	
	// ���� ��ȸ
	void printAccount();

	// ��ü ��ȸ
	void printAllAccount();
}