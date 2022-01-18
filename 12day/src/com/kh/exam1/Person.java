package com.kh.exam1;

public class Person {

	private int age;
	
	public Person(int age) {
		this.age = age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
//.equals() 객체의 속성값비교 동등성
	//재정의
//오브젝트 아래에 Person이 있는지를 확인하고
//여기에 선언된 age값과 부모안에 자식읭 age값을 강제형변환 해서 비교 해서 맞으면 true
//값을 불린으로 반환함
	@Override
	public boolean equals(Object obj) {
	boolean result = false;
		
		if(obj instanceof Person) {
			if(this.age == ((Person)obj).age) {
				result = true;
			}
		}
		return result;
	}
	
}
