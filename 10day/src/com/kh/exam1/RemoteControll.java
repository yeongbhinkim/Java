package com.kh.exam1;

public interface RemoteControll {

//	인터페이스 : 객체의 사용방법 정의한타입
//	상수 : 인터페이스의 필드는 기본적으로 public static final 특성가짐
//	추상메소드 : 인터페이스의 메소드는 public abstract 생략되고 메소드 선언부만 있는 추상 메소드
//	상속 & 인터페이스
//		-상속 : 상위 하위 개념, 단일 상속
//		-인터페이스 : 수평적 기능 정의, 다중 구현
	
	//public static final 생략되더라도 자동으로 컴파일러가 생성해준다.
//	public static final String maker= "삼성";
	String maker= "삼성";
	
	//public abstract가 생성되더라도 자동으로 컴파일러가 생성해준다
	//public abstract void turnOn();
	void turnOn();
	
	void turnOff();
	
	void setVolume(int volme);
}
