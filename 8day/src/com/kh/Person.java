package com.kh;

public class Person{
	//static//������ ��ü���� �����ϴ� ���// ������ ��ü������ �����ϴ� ���?
	
	public final static String nationality= "�ѱ���"; //����
	private String name;         //�̸�
	private int age;		 //����

	public Person() {}
//		super();//�⺻������ ������ �θ������ ȣ��
	
	
	public Person(String name) {
		this(name, 10);//���� Ŭ���������� �ٸ� ������ ȣ��
	 	//this()�� super�� ���� ����
   //������ ������ �ݵ��� ù�ٿ� �;ߵ�
  //���� Ŭ���������� �ٸ� ������ ȣ��
//		this.name = name;
//		this.age = 10;
		
	}
	
	public Person(String name, int age) {
//  	super();//�⺻������ ������ �θ������ ȣ��
// ���⼭ this.�� ��ü�̸��� �ߺ��϶� �ٸ� �Ͱ� ��Ȯ�ϰ� �ĺ��ϱ�����
		this.name = name;
		this.age = age;
	}
	
	//���� ����
	public void smile() {//static
		System.out.println("����");
	}
		
	//�Դ� ����
	public void eat() { //static
		System.out.println("�Դ�");
	}
	public void setAge(int age) {
		if(age>0) {
			this.age = age;
		}
	}
	public int getAge() {
		return this.age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}