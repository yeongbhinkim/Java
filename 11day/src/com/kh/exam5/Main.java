package com.kh.exam5;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		method1();
		
	}
	private static void method1() {
		int[] arr = new int [3];
		try {
		System.out.println(arr[3]);
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("�迭���� �ʰ�");
//			ex.printStackTrace();//�ͽ����� �߻���ġ
		}
	}
}
