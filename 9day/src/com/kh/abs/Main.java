package com.kh.abs;

public class Main {

	public static void main(String[] args) {
		//�ߺ��� ����(Ʋ)�� ����
//		�߻�Ŭ������ ��üȭ (��üȭ) �� �� ����.
//		�߻�Ŭ������ ����(Ÿ��)���θ� ��밡���ϴ�.
//		Phone p = new Phone(); �����͸� ������ �ü��ִ�
		Phone phone = new LgPhone("black");
		phone.on();
		phone.sendVoice();
		phone.off();
		System.out.println(phone.getcolor());
	}	

}
