package com.kh;

public class Car3 {
	private String color;
	private int count2; // nas�� �����ϳ� Ŭ����� �����ϳ�
	private static int count;

	public Car3() throws Exception {
		count2++;
		
		if(++count == 3) {
			throw new Exception("��ü�����ѵ��ʰ�!");
		}
	}
//�޼ҵ�
	public static int getCount() { //private�� ����ϱ� ������ �ʿ���
		return count;
	}
	public String getcolor() {
		return color;
	}
	public int getCount2() {
		return count2;
	}
}
