package com.kh.exam3;

public class Client extends Person {
	//���Ǳ⿡ ���� �����ϱ�
	void intotMoney(ForCustomer forCustomer,int money) {
		forCustomer.inputMoney(money);	
	}
	//�޴�����
	void chiceMenu(ForCustomer forCustomer,int button) {
		forCustomer.menuChoice(button);
		
	}
}