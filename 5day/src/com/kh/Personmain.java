package com.kh;

import java.util.Scanner;

public class Personmain {

	public static void main(String[] args) {
		
		Person p1 = new Person();	
		
		p1.calculator.on();
		int result = p1.calculator.sum(10, 20);
		System.out.println(result);
		p1.calculator.off();
		
		Calculator c1 = new Calculator("black", "japn");
	
		Person p2 = new Person(c1);
		p2.calculator.on();
		System.out.println(p2.calculator.sum(30, 40));
		p2.calculator.off();
//		Person[] p3 = new Person[3];
//
//		Person p4 = new Person("È«±æµ¿",30,Gender.Male);
//		Person p5 = new Person("È«±æ¼ø",20,Gender.Female);
//		
//		p4.smile();
//		p4.eat();
//		
//		p5.smile();
//		p5.eat();
//		
//		Calculator c1 = new Calculator();
//		Calculator c2 = new Calculator("yellow");
//		Calculator c3 = new Calculator("yellow", "usa");
//		
//		Scanner scnner = new Scanner(System.in);
		
	}

}
