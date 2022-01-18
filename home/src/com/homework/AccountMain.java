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
			System.out.println("1.�ű�|2.����|3.����|4.���|5.������ȸ(����)|6.������ȸ(��ü)|7.����");
			System.out.print("����> ");
			
			int selectNo = scanner.nextInt();

			switch (selectNo) {
			case 1://�ű�
				createAccount();
				break;
			case 2://����
			
				
				break;
			case 3://�Ա�
				deposit();				
				break;
			case 4://���
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
		System.out.println("���α׷� ����");
	}// end of main()

//	private static void removeAccount() {
//		String ano = PREDIX + String.format(new DecimalFormat("000").format(++seq));
//		System.out.println("�����ڸ�>");
//		String owner = scanner.next();
//
//		
//		int amount = 0;
//		for (int i = 0; i < accountsArray.length; i++) {
//			if (accountsArray[i] == null) {
//				accountsArray[i] = new Account(ano, owner, amount);
//				System.out.println("���� ��ϼ���");
//				System.out.println("���¹�ȣ : "+ano);
//				System.out.println("�ܾ� : " +amount );
//				isCreatd = true;
//				break;
//			}
//		}
//	}// end of createAccount()




	private static void withdraw() {
		if (!isRegistered()) {
			System.out.println("���� ���µ���� �ϼ���");
			return;
		}
		accountList();
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
	}// end of withdraw()
		
	private static void deposit() {
		if (!isRegistered()) {
			System.out.println("���� ���µ���� �ϼ���");
			return;
		}
		accountList();
		System.out.println("�Ա��� ���¹�ȣ�� �����ϼ���>");		
		Account account;
		while(true) {
			String ano = scanner.next();
			account = findAccount(ano);
			if(account==null) 
				System.out.println("���¹�ȣ�� Ȯ���ϼ���>");
			else 
				break;			
		}
		System.out.println("�Ա��� �ݾ��� �Է��ϼ���>");
		int amount = scanner.nextInt();
		if(amount>20000) {
			System.out.println("20000�� �ʰ��Դϴ�.");
			
		}else {
		account.deposit(amount);
		System.out.println("���� ����");
		}
	}//end of deposit()
	

	private static void createAccount() {
		String ano = PREDIX + String.format(new DecimalFormat("000").format(++seq));
		System.out.println("�����ڸ�>");
		String owner = scanner.next();

		
		int amount = 0;
		for (int i = 0; i < accountsArray.length; i++) {
			if (accountsArray[i] == null) {
				accountsArray[i] = new Account(ano, owner, amount);
				System.out.println("���� ��ϼ���");
				System.out.println("���¹�ȣ : "+ano);
				System.out.println("�ܾ� : " +amount );
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
			System.out.println("���� ���µ���� �ϼ���");
			return;
		}
		for (int i = 0; i < accountsArray.length; i++) {
			if (accountsArray[i] != null) {
				System.out.println(accountsArray[i].getAno() + accountsArray[i].getOwner() + accountsArray[i].getBalance());
			}
		}
	}
}// end of class