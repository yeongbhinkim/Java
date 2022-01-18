package com.kh.exam3;
public class Main {
//자판기 내부
	public static void main(String[] args) {
		Client client = new Client();
		Admin admin = new Admin();
		VendingMachine vm = new VendingMachine();
	  //현금투입
		client.inputMoney(vm, 10000);
		//메뉴선택
		client.chiceMenu(vm, 1);
		//음료채우기
		admin.fillBerverage(vm);
		//거스름돈채우기
		admin.fillMoney(vm);
	}
}