package com.bank;

public interface AccountIf {

	/***
	 *  �Ա�
	 * @param money
	 */
	void deposit(int money);

	/***
	 *  ���
	 * @param money
	 */
	void withraw(int money);

	/***
	 *  ��ȸ
	 * @return
	 */
	String findAccount();

}