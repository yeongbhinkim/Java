package com.kh.exam2;

public class Main {

	public static void main(String[] args) {

		//�̸��ִ� Ŭ������ ���
		RemoteControll rc = new Tv();
		rc.turnOff();
		((Tv)rc).turnOn();
		
		//�͸� Ŭ���� ���
		RemoteControll rc2 = new RemoteControll(){
		//����Ŭ������ �̸��� ����
			@Override
			public void turnOff() {
				System.out.println("Tv�� ����");
				turnOn();
			}
//			�͸�Ŭ���� ���ο� �߰��� ���ǵ� �ʵ�, 
//			�޼ҵ�� �͸�Ŭ���� ���ο����� ��밡��
			void turnOn() {
				System.out.println("Tv�� �Ѵ�");
			}
		};
		rc.turnOff();
		
	}

}
