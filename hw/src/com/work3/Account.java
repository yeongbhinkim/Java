package com.work3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account implements AccountIf {

	private String owner; // �������̸�
	private String ano; // ���¹�ȣ
	private int balance; // �ܰ�

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
			throw new Exception("�����Դϴ�..");
		} else if (anount > 20000) {
			throw new Exception("2���� �̻��Դϴ�.");
		} else if (this.balance + anount > 50000) {
			throw new Exception("5���� �ʰ��Դϴ�..");
		} else {
			this.balance += anount;
			return anount;
		}
	}//deposit �Ա�
 @Override
	public int withdraw(int anount) throws Exception {
		if (this.balance < anount) {
			throw new Exception("�ܾ��� ���ڶ��ϴ�.");
		} else {
			this.balance -= anount;
			return anount;
		}
	}//withdraw ���
  
	private static Account[] accountsArray = new Account[5];
	private static Scanner scanner = new Scanner(System.in);
	private static int seq = 0;              //���¹�ȣ ����
	private static boolean isCreatd = false; //���µ��Ȯ��

	protected static void removeAccount() {	//����
		if (!isRegistered()) {
			System.out.println("���� ���µ���� �ϼ���");
			return;
		}
		System.out.println("������ ���¹�ȣ");
		Account account;
		String ano = scanner.next();
		account = findAccount(ano);
		
		if (account == null) {
			System.out.println("���¹�ȣ�� Ȯ���ϼ���");

		} else if (account != null) {
			findAccount3(ano);
			System.out.println("���� ����");
		}
	}// ����
	
	protected static void createAccount() { // �ű� ���
		if (accountList4() == 5) {
			System.out.println("���°� 5���Դϴ�");
		} else {
			String ano = String.format(new DecimalFormat("000").format(++seq));
			int amount = 0;

			System.out.print("�����ڸ�>");
			Account account;
			String owner = scanner.next();
			account = findAccount2(owner);
			if (account != null) {
				System.out.println("�ߺ��Դϴ�");
			} else {
				for (int j = 0; j < accountsArray.length; j++) {
					if (accountsArray[j] == null) {
						accountsArray[j] = new Account(ano, owner, amount);
						System.out.println("���� ��ϼ���");
						System.out.println("���¹�ȣ : " + ano);
						System.out.println("�ܾ� : " + amount);
						isCreatd = true;
						break;
					}
				}
			}
		}
	} // �ű� ���

	protected static void withdraw() {// ���
		if (!isRegistered()) {
			System.out.println("���� ���µ���� �ϼ���");
			return;
		}

		System.out.println("����� ���¹�ȣ�� �����ϼ���>");
		Account account;
		while (true) {
			String ano = scanner.next();
			account = findAccount(ano);
			if (account == null)
				System.out.println("���¹�ȣ�� Ȯ���ϼ���");
			else
				break;
		}
		System.out.println("����� �ݾ��� �Է��ϼ���>");
		int amount = scanner.nextInt();
		int result;
		try {
			result = account.withdraw(amount);
			System.out.println("��ݾ� :" + result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}// ���

	protected static void deposit() throws Exception {// �Ա�
		if (!isRegistered()) {
			System.out.println("���� ���µ���� �ϼ���");
			return;
		}

		System.out.println("�Ա��� ���¹�ȣ�� �����ϼ���>");
		Account account;
		while (true) {
			String ano = scanner.next();
			account = findAccount(ano);
			if (account == null)
				System.out.println("���¹�ȣ�� Ȯ���ϼ���>");
			else
				break;
		}
		System.out.println("�Ա��� �ݾ��� �Է��ϼ���>");
		int amount = scanner.nextInt();
		if (amount > 20000) {
			System.out.println("20000�� �ʰ��Դϴ�.");

		} else {
			account.deposit(amount);
			System.out.println("���� ����");
		}
	}// �Ա�
	
	private static Account findAccount(String ano) {// ���µ����ȸ
		Account account = null;
		for (int i = 0; i < accountsArray.length; i++) {
			if (accountsArray[i] != null)
				if (accountsArray[i].getAno().equals(ano)) {
					account = accountsArray[i];
				}
		}
		return account;
	}// ���µ����ȸ
	
	private static Account findAccount2(String owner) {// �ߺ�Ȯ��
		Account account = null;
		for (int i = 0; i < accountsArray.length; i++) {
			if (accountsArray[i] != null)
				if (accountsArray[i].getOwner().equals(owner)) {
					account = accountsArray[i];
				}
		}
		return account;
	}// �ߺ�Ȯ��
	
	private static void findAccount3(String ano) {// �������ȸ(����)
		for (int i = 0; i < accountsArray.length; i++) {
			if (accountsArray[i] != null)
				if (accountsArray[i].getAno().equals(ano)) {
					accountsArray[i] = null;
			}
		}
	} // �������ȸ(����)
	
	protected static void accountList2() {// �������� ��ȸ
		if (!isRegistered()) {
			System.out.println("���� ���µ���� �ϼ���");
			return;
		}
		System.out.println("���¹�ȣ�� �����ϼ���>");
		Account account;
		while (true) {
			String ano = scanner.next();
			account = findAccount(ano);
			if (account == null)
				System.out.println("���¹�ȣ�� Ȯ���ϼ���>");
			else
				break;
		}
		System.out
				.println("���¹�ȣ : " + account.getAno() + ", �̸� : " + account.getOwner() + ", �ܾ� : " + account.getBalance());
	}// �������� ��ȸ
	
	protected static void accountList3() {// ��ü��ȸ
		if (!isRegistered()) {
			System.out.println("���� ���µ���� �ϼ���");
			return;
		}
		for (int i = 0; i < accountsArray.length; i++) {
			if (accountsArray[i] != null) {
				System.out.println(
						"���¹�ȣ : " + accountsArray[i].getAno() + 
						", �̸� : " + accountsArray[i].getOwner() + 
						", �ܾ� : "	+ accountsArray[i].getBalance());
			}
		}
		System.out.println("�ܿ��� : " + (accountsArray.length - accountList4()));
	}// ��ü��ȸ

	private static int accountList4() {// ����ī��Ʈ
		int count = 0;
		for (int i = 0; i < accountsArray.length; i++) {
			if (accountsArray[i] != null) {
				count++;
			}
		}
		return count;
	}// ����ī��Ʈ
	
	private static boolean isRegistered() {// ���µ��Ȯ��
		return isCreatd;
	} // ���µ��Ȯ��

	public Account() {
		super();
	}
	
	

////���¸���Ʈ
//private static void accountList() {
//	if (!isRegistered()) {
//		System.out.println("���� ���µ���� �ϼ���");
//		return;
//	}
//	for (int i = 0; i < accountsArray.length; i++) {
//		if (accountsArray[i] != null) {
//			System.out.println("���¹�ȣ : " + accountsArray[i].getAno() + ", �̸� : " + accountsArray[i].getOwner() + ", �ܾ� : "
//					+ accountsArray[i].getBalance());
//		}
//	}
//}//���¸���Ʈ

}