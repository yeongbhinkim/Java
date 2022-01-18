package com.kh.bank;

public class Account implements AccountIf {
	private String accountName;		//�������̸�
	private final String accountNumber;		//���¹�ȣ
	private int balance;					//�ܰ�
	
	private static int cnt;					//������ ���°��� ī��Ʈ
	
	private static final int ACCOUNT_NUM_SIZE = 3; //���¹�ȣ 3�ڸ�
	//1ȸ �Ա��ѵ�
	private static final int ONE_TIME_MONEY_LIMIT = 20_000;
	//��ġ�� �ѵ�
	private static final int DEPOSIT_MONEY_LIMIT = 50_000;
	
	public Account(String accountName) {
		this.accountName = accountName;
		cnt++;
		this.accountNumber = createAccountNumber();
	}

	//�Ա�
	@Override
	public void deposit(int money) {
		String msg = null;
		
		//����üũ
		if(money < 0) {
			throw new IllegalArgumentException("�������� �ԷµǾ����ϴ�");
		}
		
		//1ȸ �Ա��ѵ� üũ
		if(money > 20000) {
			msg = "1ȸ �Ա��ѵ� " + ONE_TIME_MONEY_LIMIT + " �� �ʰ��Ͽ����ϴ�.";
			throw new IllegalArgumentException(msg);	
		}
		
		//��ġ���ѵ� üũ
		if(this.balance + money > DEPOSIT_MONEY_LIMIT) {
			msg = "�����ѵ� " + DEPOSIT_MONEY_LIMIT + " �ʰ� �Ͽ����ϴ�.";
			throw new IllegalArgumentException("�����ѵ� �ʰ��Ͽ����ϴ�.");	
		}
		
		this.balance += money;
	}
	//���
	@Override
	public void withraw(int money) {
		
		//����üũ
		if(money < 0) {
			throw new IllegalArgumentException("�������� �ԷµǾ����ϴ�");
		}
		
		//�ܾ׺��� ��ݾ��� ū���
		if(this.balance < money) {
			throw new IllegalArgumentException("�ܾ��� �����մϴ�.");
		}
		
		this.balance -= money;
	}
	
	//��ȸ
	@Override
	public String findAccount() {
		String str = "���¹�ȣ : " + this.accountNumber + "\t" + 
				 "�������̸� : " + this.accountName + "\t" +
				 "�ܰ� : " + this.balance;
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

	
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	@Override
	public String toString() {
		String str = "���¹�ȣ : " + this.accountNumber + "\t" + 
					 "�������̸� : " + this.accountName + "\t" +
					 "�ܰ� : " + this.balance;
		return str;
	}
	
	//���¹�ȣ ����
	private String createAccountNumber() {
		String zero = "";
		String numjber = String.valueOf(cnt);
		for(int i=1; i<=ACCOUNT_NUM_SIZE-numjber.length();i ++) {
			zero += "0";
		}
		return zero+cnt;
	}	
}
