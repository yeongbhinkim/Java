package com.kh.Person;

public class Person extends Object{
	
	//�ν��Ͻ� ��� �ʵ�
	private String name;
	private int age;
	
	//���� ��� �ʵ�
	static String nationality = "�ѱ�";
	
	//�ν��Ͻ� ��� Ŭ����
	class Calculator{
		String color = "����";
		
		String getColor() {
			return color;
		}
	}
	//���� ��� Ŭ����
	static class Calculator2{
		String color = "���";
		
		String getColor() {
			return color;
		}
	}
	
	
	//����Ʈ ������
	public Person() {
		super();
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//�ν��Ͻ� ��� �޼ҵ�
	//�ν��Ͻ����, ������� ��� ���ο� ��밡��
	public void smile() {
		System.out.println("����");
	}
	
	//���� ��� �޼ҵ�
	//���� ����� ���ο� ��밡��
	static String getNationality() {
		return nationality;
	}

	public String getColorOfCalculator() {
		Calculator c = new Calculator();
		return c.getColor();
	}
	
	
	public String getColorOfCalculator2() {
		
		//����Ŭ���� : �޼ҵ� ���ο� ����� Ŭ����
		//				: ���� Ŭ���� ���� �Ұ���
		class Calculator{
			String color = "����";
			String getcolor() {
				return color;				
			}
		}
		
		Calculator c = new Calculator();
		return c.getcolor();
	}
}
