package com.kh;

public class Person2 {
	
	private static final String nationanlity = "�ѱ���";
	private  int age= 10;
	
	private static String city = "���";
	
//	public Person2() {
//		super();
//	}
	                  //���⿡ ��ڴ�
	public static String getNationality() {
		return nationanlity;//�� ����
	}
	//Ŭ����(����)�޼ҽ� ������ ��ü(�ν��Ͻ�) ����ʵ�� ����� �� ����.
//	public static int getAge() {
//		return age;
//	}
	public  int getAge2() {
		return age;
	}
	
	//��ü(�ν��Ͻ�) ����ʵ�� Ŭ����(����)�޼ҵ� ������ ����� �� �ִ�.
	public String getCity() {//static �ְ����� �������ְ� ����?
		return city;
	}
	public static String getCity2() {
		return city;
	}
}