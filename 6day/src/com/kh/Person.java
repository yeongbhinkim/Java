package com.kh;

public class Person {
//private ����������,����?Ŭ���� ���ο����� ���
	private int age;
	private Calculator calculator = new Calculator();
////������ ���������� ��Ʈ�� ���ɡ�
//	private void setAge(int age) {
//		if (age < 0) {
//			return;
//		}
//		this.age = age;
//		}

//public �ٸ���Ű������ ����	
	public Person() {
	}
public Person(Calculator calculator) {
	this.calculator = calculator;
}
//����Ʈ ���� ��Ű������ ���ٰ��� ex: int age;
	public void smile() {
		System.out.println("����" + age);
	}

	public void setAge(int age) {
		if (age < 0) {
			return;
		}
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	public Calculator getCalcultor() {
		return this.calculator;
	}
}
