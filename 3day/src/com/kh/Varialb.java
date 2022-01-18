package com.kh;

public class Varialb {//void 반환값 X
//선언부  void:타임,main:메소드 이름,(String[] args):매개변수
	public static void main(String[] args) {
		int x; // 변수 선언
		x = 100; // 초기화 : 변수 선언 후 최초의 값을 할당하는 행위
		System.out.println(x);

		x = 200;// 재할당
		System.out.println(x);

		int y; // 변수 선언
		y = x; // x변수값을 읽어서 y변수값 초기화
		System.out.println(y);

		int z; // 변수 선언
		z = x + y;
		System.out.println(z);

		int k; // 변수 선언
		k = sum(x, y);
		System.out.println(k);
		
		int j;
		j = sum(z, k);
		System.out.println(j);
		
		double m;
		m = sum(1.4, 2.5);
		System.out.println(m);
		
		double n;
		n = sum(1.4+1, 2.5+1);
		System.out.println(n);
	}

	// 메소드 정의 //구현부//int 반환값이 정수
	public static int sum(int num1, int num2) {
		
		int result = num1 + num2;
		System.out.println("int sum(int num1, int num2) 호출");
		return result;
	
	}//로컬 변수 value,sum
	public static double sum(double num1, double num2) {
		System.out.println("sum(double num1, double num2)호출");
		double result = num1 + num2;
		//int value = 10;
		//int sum = value + 20;
		return result;
	
	}
}
