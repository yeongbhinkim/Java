package com.kh;

public class Person {
	//?????ʵ?
	String name;
	int age;
	
	//??????
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//?޼ҵ?
	public void smile() {
		System.out.println(name+age+": ????");
	}
	
	public void eat() {
		System.out.println(name+age+": ?Դ?");
	}
}
