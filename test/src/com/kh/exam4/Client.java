package com.kh.exam4;
public class Client extends Person {
	private ForCustomer forCustomer;//����
	
	public Client(ForCustomer forCustomer) {
		this.forCustomer = forCustomer;
	}
	//���Ǳ⿡ ���� �����ϱ�
	void intotMoney(int money) {
		forCustomer.inputMoney(money);	
	}
	//�޴�����
	void chiceMenu(int button) {
		forCustomer.menuChoice(button);
	}
	//����ä���
	void fillBerverage() {
	if(forCustomer instanceof VendingMachine) {
		VendingMachine vm = (VendingMachine)forCustomer;
		vm.fillBerverager();
	}
	}
}