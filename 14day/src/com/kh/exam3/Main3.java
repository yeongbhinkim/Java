package com.kh.exam3;

public class Main3 {

	public static void main(String[] args) {

		Person p1 = new Person("¿À¸®´Â²Ð²Ð", 30);
		Person p2 = p1;
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		chageAge(p2);
		System.out.println(p2.getAge());
		
		
	}

	private static void chageAge(Person p2) {
		p2.setAge(20);
	}

}
