package com.kh.exam3;
//자판기 외부
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
	@Override//현금투입
	public void inputMoney(int money) {
		this.money = money;
	}
	@Override//메뉴 선택
	public void menuChoice(int button) {
		this.button = button;
	}
}