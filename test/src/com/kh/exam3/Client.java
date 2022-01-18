package com.kh.exam3;//고객 권한
public class Client extends Person {
	//자판기에 현금 투입하기
	void inputMoney(ForCustomer forCustomer,int money) {
		forCustomer.inputMoney(money);	
	}
	//메뉴선택
	void chiceMenu(ForCustomer forCustomer,int button) {
		forCustomer.menuChoice(button);
	}
}