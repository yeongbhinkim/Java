package com.kh;

import java.util.Scanner;

//필드↓
public class Main {
	String name;

	// 지역변수↓              //매개변수↓
	public static void main(String[] args) {

		Person p1 = new Person();
//		Calculator calculator =p1.getalCulator();
//		int result10 = calculator().sum(10,20);
		int result = p1.getCalcultor().sum(10,20);
		System.out.println(result);
			
		Calculator c1 = new Calculator("korea", "whihe");
		Person p2= new Person(c1); 
		 int result2 = p2.getCalcultor().sum(20, 30);
		 System.out.println(result2);
		  
		 Person p3 = new Person();
		 p3.setCalculator(c1);
		 int result3 = p3.getCalcultor().sum(30, 30);
		 System.out.println(result3);
		 
		 
//		System.out.println(p1);
//		System.out.println(p1.getAge());
//		p1.setAge(20);
//		System.out.println(p1.getAge());
//		
//		System.out.println(p1);
//		p1.smile();
//		p1.setAge(-20);
//		Calculator c1 = new Calculator();
//		System.out.println(c1);
//
//		Car car1 = new Car();
//		System.out.println(car1);
//
//		Scanner scanner = new Scanner(System.in);
//		String str = scanner.nextLine();
	}
}