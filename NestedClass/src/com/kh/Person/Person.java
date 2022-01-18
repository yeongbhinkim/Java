package com.kh.Person;

public class Person extends Object{
	
	//인스턴스 멤버 필드
	private String name;
	private int age;
	
	//정적 멤버 필드
	static String nationality = "한국";
	
	//인스턴스 멤버 클래스
	class Calculator{
		String color = "빨강";
		
		String getColor() {
			return color;
		}
	}
	//정적 멤버 클래스
	static class Calculator2{
		String color = "노랑";
		
		String getColor() {
			return color;
		}
	}
	
	
	//디폴트 생성자
	public Person() {
		super();
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//인스턴스 멤버 메소드
	//인스턴스멤버, 정적멤버 모두 내부에 사용가능
	public void smile() {
		System.out.println("웃다");
	}
	
	//정적 멤버 메소드
	//정적 멤버만 내부에 사용가능
	static String getNationality() {
		return nationality;
	}

	public String getColorOfCalculator() {
		Calculator c = new Calculator();
		return c.getColor();
	}
	
	
	public String getColorOfCalculator2() {
		
		//로컬클래스 : 메소드 내부에 선언된 클래스
		//				: 정적 클래스 선언 불가능
		class Calculator{
			String color = "검정";
			String getcolor() {
				return color;				
			}
		}
		
		Calculator c = new Calculator();
		return c.getcolor();
	}
}
