package com.kh.exam4;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {

		//Class ��ü �������
		//case1)
		Class Obj = Person.class;
		
		//case2)
		Class Obj2 = Class.forName("com.kh.exam4.Person");
		
		//case3)
		Person p1 = new Person("ȫ�浿", 30);
		Class Obj3 = p1.getClass();
		
//		obj2.getConstructors()

		System.out.println(Obj2.getName());
		System.out.println(Obj2.getSimpleName());
		System.out.println(Obj2.getPackage().getName());
	}

}
