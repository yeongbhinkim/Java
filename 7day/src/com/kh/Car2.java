package com.kh;

public class Car2 {
	int maxSpeed;      //객체(인스턴스)멤버 필드
	int count;         // static 클래스(정적)멤버 필드 (값을 전체가 공유)
	static int count2; //Car2.c2=0;
	
	public Car2() {
		count++;
		count2++;
	}
	
	
	int getMaxSpeed() {//객체(인스턴스)멤버 메소드
		return maxSpeed;
	}
	int getCount() {
		return count;
	}
	int getCount2() {
		return count2;
	}
}
