package com.kh;

public class Person {
//private 접근제한자,보안?클래서 내부에서만 사용
	private int age;
	private Calculator calculator = new Calculator();
////공개한 범위에서만 컨트롤 가능↓
//	private void setAge(int age) {
//		if (age < 0) {
//			return;
//		}
//		this.age = age;
//		}

//public 다른페키지에도 보임	
	public Person() {
	}
public Person(Calculator calculator) {
	this.calculator = calculator;
}
//디폴트 같은 페키지에서 접근가능 ex: int age;
	public void smile() {
		System.out.println("웃다" + age);
	}

	public void setAge(int age) {
		if (age < 0) {
			return;
		}
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	public Calculator getCalcultor() {
		return this.calculator;
	}
}
