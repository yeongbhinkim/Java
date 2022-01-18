package com.kh.exam3;

public class Main {

	public static void main(String[] args) {
		
		Client client = new Client();
		Admin admin = new Admin();
		
		VendingMachine vm = new VendingMachine();
		
		client.intotMoney(vm, 10000);
		client.chiceMenu(vm, 1);
		
		admin.fillBerverage(vm);
		admin.fillMoney(vm);
		
	}

}
