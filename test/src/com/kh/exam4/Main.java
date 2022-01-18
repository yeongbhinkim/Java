package com.kh.exam4;
public class Main {
//자판기 내부
	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		Client client = new Client(vm);
		Admin admin = new Admin();
	  //현금투입
		client.intotMoney(10000);
	  //메뉴선택
		client.chiceMenu(1);
	//음료채우기
		client.fillBerverage();
	//음료채우기
		admin.fillBerverage(vm);
	//거스름돈채우기
		admin.fillMoney(vm);
	}
}