package com.kh;

public class Car2 {
	int maxSpeed;      //��ü(�ν��Ͻ�)��� �ʵ�
	int count;         // static Ŭ����(����)��� �ʵ� (���� ��ü�� ����)
	static int count2; //Car2.c2=0;
	
	public Car2() {
		count++;
		count2++;
	}
	
	
	int getMaxSpeed() {//��ü(�ν��Ͻ�)��� �޼ҵ�
		return maxSpeed;
	}
	int getCount() {
		return count;
	}
	int getCount2() {
		return count2;
	}
}
