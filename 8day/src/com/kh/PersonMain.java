package com.kh;

public class PersonMain {

	public static void main(String[] args) {
	
		Person p1 = new Person();
		p1.setName("ȫ?浿");
		p1.setAge(30);
//		String name = p1.getName();
//		
//		System.out.println(name);
		
		Person p2 = new Person("ȫ????",20);
		p2.setAge(-40);
		int age = p2.getAge();
		System.out.println(age);
		
		Person p3 = new Person("ȫ?泲");
		p3.setAge(40);
		String name = p3.getName();
		
		System.out.println(name);
//   	Person.eat();
		System.out.println(Person.nationality);
//		Person.nationality = "?̱???";
		
		
	}

}
