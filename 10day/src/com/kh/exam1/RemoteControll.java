package com.kh.exam1;

public interface RemoteControll {

//	�������̽� : ��ü�� ����� ������Ÿ��
//	��� : �������̽��� �ʵ�� �⺻������ public static final Ư������
//	�߻�޼ҵ� : �������̽��� �޼ҵ�� public abstract �����ǰ� �޼ҵ� ����θ� �ִ� �߻� �޼ҵ�
//	��� & �������̽�
//		-��� : ���� ���� ����, ���� ���
//		-�������̽� : ������ ��� ����, ���� ����
	
	//public static final �����Ǵ��� �ڵ����� �����Ϸ��� �������ش�.
//	public static final String maker= "�Ｚ";
	String maker= "�Ｚ";
	
	//public abstract�� �����Ǵ��� �ڵ����� �����Ϸ��� �������ش�
	//public abstract void turnOn();
	void turnOn();
	
	void turnOff();
	
	void setVolume(int volme);
}
