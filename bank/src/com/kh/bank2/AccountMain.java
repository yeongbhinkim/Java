package com.kh.bank2;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		
		Account[] account = new Account[5];
		Scanner scanner = new Scanner(System.in);
		boolean stop = false;
		
		while(!stop) {
			try {
				String choiceNum = null;		 //������ �޴�
				String accountName = null;	 //�����ָ� 
				String accountNumber = null; //���¹�ȣ
				int money = 0;							 //����ݾ�
				
				System.out.println("1.�ű� 2.���� 3.�Ա� 4.��� 5.������ȸ(����) 6.������ȸ(��ü) 7.����(x)");
				System.out.print("���� > ");
				choiceNum = scanner.nextLine();
				
				switch (choiceNum) {
				case "1": //�ű�
					System.out.print("�����ָ� : ");
					accountName = scanner.nextLine();
					//���»���
					createAccount(account, accountName);
					break;
				case "2": //����
					System.out.print("���¹�ȣ : ");
					accountNumber = scanner.nextLine();
					//��������
					closedAccount(account, accountNumber);
					
					break;
				case "3": //�Ա�
					System.out.print("���¹�ȣ : ");
					accountNumber = scanner.nextLine();
					System.out.print("�Աݾ� : ");
					money = Integer.parseInt(scanner.nextLine());
					
					deposit1(account, accountNumber, money);				
					break;
				case "4": //���
					System.out.print("���¹�ȣ : ");
					accountNumber = scanner.nextLine();
					System.out.print("��ݾ� : ");
					money = Integer.parseInt(scanner.nextLine());
					
					withdaw(account, accountNumber, money);				
					break;
				case "5": //������ȸ
					System.out.print("���¹�ȣ : ");
					accountNumber = scanner.nextLine();
					
					showAccount(account, accountNumber);
					break;
				case "6": //��ü��ȸ
					showAccountAll(account);
					break;
				case "7":	// ����
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

	//��ü ��ȸ
	private static void showAccountAll(AccountIf[] account) {
		for(int i=0; i<account.length; i++) {
			if(account[i] != null) {
				System.out.println(account[i].findAccount());
			}
		}
	}

	//���� ������ȸ
	private static void showAccount(Account[] account, String accountNumber) {
		for(int i=0; i<account.length; i++) {
			if(account[i].getAccountNumber().equals(accountNumber)) {
				System.out.println(account[i].findAccount());
				break;
			}
		}
	}
	// ���
	private static void withdaw(Account[] account, String accountNumber, int money) {
		for(int i=0; i<account.length; i++) {
			if(account[i].getAccountNumber().equals(accountNumber)) {
				account[i].withraw(money);
				break;
			}
		}
	}

	// �Ա�
	private static void deposit1(Account[] account, String accountNumber, int money) {
		for(int i=0; i<account.length; i++) {
			if(account[i].getAccountNumber().equals(accountNumber)) {
				account[i].deposit(money);
				break;
			}
		}
	}

	//���� ����
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
			System.out.println("���°� �����Ǿ����ϴ�." + findedAccount);			
		}else {
			System.out.println("ã���� �ϴ� ���°� �����ϴ�");
		}
	}

	//���»���
	private static void createAccount(AccountIf[] account, String accountName) {
		AccountIf createdAccount = null;
		
		//�������� üũ���� ����
		
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
			System.out.println("���� ������ ���¼��� �ʰ��Ǿ����ϴ�.");
		}else {
			System.out.println("���°� �����Ǿ����ϴ�."+createdAccount);
		}
	}

}
