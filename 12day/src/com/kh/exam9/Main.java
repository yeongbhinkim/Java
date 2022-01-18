package com.kh.exam9;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {

	public static void main(String[] args) {
								
							//ArrayList 순서가 있다
		// 다이아몬드 연산자 <> 타입정의 목차?
		List<Person> list = new ArrayList<Person>();
		//객체 추가
		list.add(new Person("홍길동", 30));//추가
		list.add(new Person("홍길서", 40));//추가
		list.add(new Person("홍길남", 50));//추가
		//삽입 원하는 곳에 우선예약느낌?
		list.add(1,new Person("홍길순",20));//삽입
		list.set(2,new Person("홍길북",10));//대체 덮어쓰기
		
		                     //.toString()생략되도됨
		System.out.println(list.toString());
		System.out.println(list.size());
		
		//객체 검색 //동등비교 불린 반환타입으로 될려줌
		System.out.println(list.contains(new Person("홍길동", 30)));
		
		Person person = (Person)list.get(0);
		System.out.printf("이름 : %s, 나이 : %d\n",person.getName(),person.getAge());
		System.out.println(list.isEmpty()); //객체가 비어있는지 찾기
		System.out.println(list.size());
		
		//객체 삭제
		Person removedPerson = list.remove(1);
		System.out.println(list.toString());
		System.out.println(list.size());
		
		System.out.println(list.remove(new Person("홍길동",30)));
		System.out.println(list.toString());
		System.out.println(list.size());
		
		list.clear();
		System.out.println(list.toString());
		System.out.println(list.size());
		
//		System.out.println(new Person("홍길동",10).hashCode());
//		System.out.println(new Person("홍길동",10).hashCode());
//		System.out.println(Objects.hash("홍길동",10));
//		System.out.println(Objects.hash("홍길동",11));
		
	}

}
