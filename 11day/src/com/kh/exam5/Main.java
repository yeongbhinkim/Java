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
			System.out.println("배열범위 초과");
//			ex.printStackTrace();//익스셉션 발생위치
		}
	}
}
