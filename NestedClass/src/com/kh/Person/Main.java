package com.kh.Person;

public class Main {

	public static void main(String[] args) {

		System.out.println(Person.getNationality());
		
		//�ν��Ͻ� ����� ��üȭ(�ν��Ͻ�ȭ) �� ��밡��
//		System.out.println(Person.smile());		
		Person p1 = new Person("ȫ�浿", 20);
		p1.smile();
		System.out.println(p1.getColorOfCalculator());
		
		Person.Calculator c1 = p1.new Calculator();
		System.out.println(c1.getColor());
		
		Person.Calculator2 c2 = new Person.Calculator2();
		System.out.println(c2.getColor());
		
		System.out.println(p1.getColorOfCalculator2());
	}

}