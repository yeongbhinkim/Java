package com.kh.exam3;

public class Client extends Person {
	//자판기에 현금 투입하기
	void intotMoney(ForCustomer forCustomer,int money) {
		forCustomer.inputMoney(money);	
	}
	//메뉴선택
	void chiceMenu(ForCustomer forCustomer,int button) {
		forCustomer.menuChoice(button);
		
	}
}
