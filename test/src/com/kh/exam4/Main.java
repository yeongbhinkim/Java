package com.kh.exam4;
public class Main {
//���Ǳ� ����
	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		Client client = new Client(vm);
		Admin admin = new Admin();
	  //��������
		client.intotMoney(10000);
	  //�޴�����
		client.chiceMenu(1);
	//����ä���
		client.fillBerverage();
	//����ä���
		admin.fillBerverage(vm);
	//�Ž�����ä���
		admin.fillMoney(vm);
	}
}