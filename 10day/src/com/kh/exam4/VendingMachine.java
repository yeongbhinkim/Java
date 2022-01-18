package com.kh.exam4;

public class VendingMachine implements ForAll {

	private int money; //투입한돈
	private int button;//선택한메뉴
	
	
	@Override
	public void fillBerverager() {
		System.out.println("음료를 채우다");
	}
	
	@Override
	public void fillMoney() {
		System.out.println("거스름톤을 채우다");
	}
	
	@Override
	public void inputMoney(int mony) {
		this.money = money;
	}

	@Override
	public void menuChoice(int button) {
		this.button = button;
	}

}
