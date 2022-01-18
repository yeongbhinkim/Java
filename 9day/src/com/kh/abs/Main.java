package com.kh.abs;

public class Main {

	public static void main(String[] args) {
		//중복된 개념(틀)을 모운다
//		추상클래스는 객체화 (실체화) 할 수 없다.
//		추상클래스는 개념(타입)으로만 사용가능하다.
//		Phone p = new Phone(); 데이터만 가지고 올수있다
		Phone phone = new LgPhone("black");
		phone.on();
		phone.sendVoice();
		phone.off();
		System.out.println(phone.getcolor());
	}	

}
