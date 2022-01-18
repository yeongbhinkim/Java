package com.kh.exam4;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {

		//Class 按眉 积己规过
		//case1)
		Class Obj = Person.class;
		
		//case2)
		Class Obj2 = Class.forName("com.kh.exam4.Person");
		
		//case3)
		Person p1 = new Person("全辨悼", 30);
		Class Obj3 = p1.getClass();
		
//		obj2.getConstructors()

		System.out.println(Obj2.getName());
		System.out.println(Obj2.getSimpleName());
		System.out.println(Obj2.getPackage().getName());
	}

}
