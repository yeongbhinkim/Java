package com.kh;

public class Person{
	//static//있을때 객체들이 공유하는 상수// 없을때 객체내에서 공유하는 상수?
	
	public final static String nationality= "한국인"; //국적
	private String name;         //이름
	private int age;		 //나이

	public Person() {}
//		super();//기본적으로 생성됨 부모생성자 호출
	
	
	public Person(String name) {
		this(name, 10);//동일 클래스내에서 다른 생성자 호출
	 	//this()는 super랑 같이 못씀
   //생성자 내에서 반듯이 첫줄에 와야됨
  //동일 클래스내에서 다른 생성자 호출
//		this.name = name;
//		this.age = 10;
		
	}
	
	public Person(String name, int age) {
//  	super();//기본적으로 생성됨 부모생성자 호출
// 여기서 this.은 객체이름이 중복일때 다른 것과 명확하게 식별하기위해
		this.name = name;
		this.age = age;
	}
	
	//웃는 행위
	public void smile() {//static
		System.out.println("웃다");
	}
		
	//먹는 행위
	public void eat() { //static
		System.out.println("먹다");
	}
	public void setAge(int age) {
		if(age>0) {
			this.age = age;
		}
	}
	public int getAge() {
		return this.age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}