package com.kh.exam9;

public class Main {
//이름이 없다 타입을 만들지 않았다 새로만들어야된다
	public static void main(String[] args) {
		
	Person person =	new Person() {
			public void study() {
				System.out.println("공부하다");
			}
			
			@Override
			public void eat() {
				System.out.println("많이 먹다");
				study();
			}
		};
		
		person.eat();  
		
		
	}

}
