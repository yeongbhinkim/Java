package com.kh.exam1;

public class Main {

	public static void main(String[] args) {
		//���� ������ �ּҰ��� ������ ����
		//���� ��ü�� ������
		Person p1 = new Person(20);
		Person p2 = new Person(20);
		//==��ä(p1,p2)�� ������ (�ּҰ��� ������ �ٸ���) ���ϼ�
		System.out.println(p1 == p2);      //���ϼ� üũ
		//.equals �����͸� ����
		System.out.println(p1.equals(p2)); //��� üũ
		
		//�ּҰ��� �ٸ��� ���ڿ��� ���� 
		String name3 = new String("ȫ�浿");
		String name4 = new String("ȫ�浿");
//		String name2 = new String("ȫ�浿");
		System.out.println(name3 == name4);
		System.out.println(name3.equals(name4));

		//�ּҰ��� ���ڿ��� ����
		String name = "ȫ�浿";
		String name2 = "ȫ�浿";
//		String name2 = new String("ȫ�浿");
		System.out.println(name == name2);
		System.out.println(name.equals(name2));
		
		
		
		//���� ����(pass by value)
		int a = 10;
		int b = a;
		b = 20;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
//����Ÿ�Կ����� 2�� �̻��� ���������� ������ ��ü�� �����Ұ�� ��������!
		//�ּҰ��� ����(pass by reference)
		//���� ��ü�� �������ؼ� ���� ���� ���� 
		Person p3 = new Person(10);
		Person p4 = p3;
		p4.setAge(20);
		System.out.println("p3.age="+p3.getAge());
		System.out.println("p4.age="+p4.getAge());
//����Ÿ�Կ����� 2���̻��� ����������
//����Ÿ�� ��ü�� ������ ���ַ��� ������ ��ü�� ��������
		//���� �ٸ� ��ü�� ����
		Person p5 = new Person(10);
		Person p6 = new Person(10);
		p6.setAge(20);
		System.out.println("p3.age="+p5.getAge());
		System.out.println("p4.age="+p6.getAge());
		
	}
}