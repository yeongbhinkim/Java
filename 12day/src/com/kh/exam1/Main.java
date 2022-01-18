package com.kh.exam1;

public class Main {

	public static void main(String[] args) {
		//참조 변수는 주소값을 가지고 있음
		//각각 객체를 생성함
		Person p1 = new Person(20);
		Person p2 = new Person(20);
		//==객채(p1,p2)를 구별함 (주소값이 같은지 다른지) 동일성
		System.out.println(p1 == p2);      //동일성 체크
		//.equals 데이터를 비교함
		System.out.println(p1.equals(p2)); //동등성 체크
		
		//주소값은 다르고 문자열은 같다 
		String name3 = new String("홍길동");
		String name4 = new String("홍길동");
//		String name2 = new String("홍길동");
		System.out.println(name3 == name4);
		System.out.println(name3.equals(name4));

		//주소값과 문자열이 같다
		String name = "홍길동";
		String name2 = "홍길동";
//		String name2 = new String("홍길동");
		System.out.println(name == name2);
		System.out.println(name.equals(name2));
		
		
		
		//값이 복사(pass by value)
		int a = 10;
		int b = a;
		b = 20;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
//참조타입에서는 2개 이상의 참조변수가 동일한 객체를 참조할경우 주의하자!
		//주소값이 복사(pass by reference)
		//같은 객체에 대입을해서 같은 값이 나옴 
		Person p3 = new Person(10);
		Person p4 = p3;
		p4.setAge(20);
		System.out.println("p3.age="+p3.getAge());
		System.out.println("p4.age="+p4.getAge());
//참조타입에서는 2개이상의 참조변수가
//동일타입 객체에 영향을 안주려면 별도의 객체를 생성하자
		//각각 다른 객체로 만듬
		Person p5 = new Person(10);
		Person p6 = new Person(10);
		p6.setAge(20);
		System.out.println("p3.age="+p5.getAge());
		System.out.println("p4.age="+p6.getAge());
		
	}
}