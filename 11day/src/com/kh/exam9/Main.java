package com.kh.exam9;

public class Main {

	public static void main(String[] args) {

		String name = "홍길동";
		System.out.println(name.toString());
		//같은것을 사용
		String name2 = "홍길동";
		System.out.println(name.equals(name2));
		System.out.println(name==name2);
		
		
		//서로 각각만들어서 사용
	//주소값은 다르지만 String 문자열로 재정의를 해서 문자열내용을 봄
		String name3 =new String("홍길동");
		String name4 =new String("홍길동");
		//주소값이 다르지만 문자열내용이 맞는지 재정의를 내림
		System.out.println(name3.equals(name4));
		System.out.println(name3==name4);
		
		Person person = new Person();
		Person person2 = new Person();
		Person person3 = person;
		
		//주소값이 틀림 주소값을 비교
		System.out.println(person.equals(person2));//false
		System.out.println(person.equals(person3));
	}
}