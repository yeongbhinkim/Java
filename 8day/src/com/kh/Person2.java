package com.kh;

public class Person2 {
	
	private static final String nationanlity = "한국인";
	private  int age= 10;
	
	private static String city = "울산";
	
//	public Person2() {
//		super();
//	}
	                  //여기에 담겠다
	public static String getNationality() {
		return nationanlity;//이 값을
	}
	//클래식(정적)메소스 내에서 객체(인스턴스) 멤버필드는 사용할 수 없다.
//	public static int getAge() {
//		return age;
//	}
	public  int getAge2() {
		return age;
	}
	
	//객체(인스턴스) 멤버필드는 클래스(정적)메소드 내에서 사용할 수 있다.
	public String getCity() {//static 있고없고 받을수있고 없고?
		return city;
	}
	public static String getCity2() {
		return city;
	}
}
