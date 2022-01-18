package com.kh.exam1;

public class Main {

	public static void main(String[] args) {
		
		//이름있는 클래스사용
		Person person = new Student();
		person.eat();
		//관점 옮기기 타입변환
		((Student)person).smile();
		
		Person person3 = new Student();
		person3.eat();
		
		//익명 클래스사용
		Person person2 = new Person() {
			@Override
			public void eat() {
				System.out.println("많이 먹다");
				//안에서 사용해야됨
				smile();
			}
			//관점을 바꿀방법이 없음  타입이 정해지지 않아서 타입변환이 안됨
			public void smile() {
				System.out.println("웃다");
			}
		};
		person2.eat();
//		person2.smile(); 호출불가.
		
		Person person4 = new Person() {
			@Override
			public void eat() {
				System.out.println("많이 먹다");
			}
		};
		person4.eat();
		
	}
}