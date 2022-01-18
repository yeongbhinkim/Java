package com.kh.abs;
//클래스 앞에 붙은 abstract
abstract public class Phone {

	 private String color;
	 
	 public Phone(String color) {
		 super();
		 //Phone 객체생성
		 this.color = color;
	 }
	 
	 public void on() {
		 System.out.println("휴대폰을 켜다");
	 }
	 
	 public void sendVoice(){
		 System.out.println("소기를 전달하다");
	 }
	 public String getcolor() {
		 return this.color;
	 }
	// abstract 
	 abstract void off();
}
