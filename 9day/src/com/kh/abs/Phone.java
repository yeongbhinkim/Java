package com.kh.abs;
//Ŭ���� �տ� ���� abstract
abstract public class Phone {

	 private String color;
	 
	 public Phone(String color) {
		 super();
		 //Phone ��ü����
		 this.color = color;
	 }
	 
	 public void on() {
		 System.out.println("�޴����� �Ѵ�");
	 }
	 
	 public void sendVoice(){
		 System.out.println("�ұ⸦ �����ϴ�");
	 }
	 public String getcolor() {
		 return this.color;
	 }
	// abstract 
	 abstract void off();
}
