package com.kh.exam3;
public class Main {
//���Ǳ� ����
	public static void main(String[] args) {
		Client client = new Client();
		Admin admin = new Admin();
		VendingMachine vm = new VendingMachine();
	  //��������
		client.inputMoney(vm, 10000);
		//�޴�����
		client.chiceMenu(vm, 1);
		//����ä���
		admin.fillBerverage(vm);
		//�Ž�����ä���
		admin.fillMoney(vm);
	}
}