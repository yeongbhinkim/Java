package com.kh.exam1;

public class Main {

	public static void main(String[] args) {
		
		//�̸��ִ� Ŭ�������
		Person person = new Student();
		person.eat();
		//���� �ű�� Ÿ�Ժ�ȯ
		((Student)person).smile();
		
		Person person3 = new Student();
		person3.eat();
		
		//�͸� Ŭ�������
		Person person2 = new Person() {
			@Override
			public void eat() {
				System.out.println("���� �Դ�");
				//�ȿ��� ����ؾߵ�
				smile();
			}
			//������ �ٲܹ���� ����  Ÿ���� �������� �ʾƼ� Ÿ�Ժ�ȯ�� �ȵ�
			public void smile() {
				System.out.println("����");
			}
		};
		person2.eat();
//		person2.smile(); ȣ��Ұ�.
		
		Person person4 = new Person() {
			@Override
			public void eat() {
				System.out.println("���� �Դ�");
			}
		};
		person4.eat();
		
	}
}