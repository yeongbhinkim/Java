package com.kh.FP;

public class Cal {

	final int[] v = {1,2,3,4,5};
	Expression e;
	
	void perform() {
		for(int i =0; i < v.length; i++) {
//			System.out.println(v[i]*2);
			System.out.println(e.calculate(v[i]));
		}
	}
	//함수적 인터페이스 (functional interface)
	//인터페이스 내에 추상메소드가 1개인 경우를 의미하며
	//구현객체는 람다식으로 표현할수 있다.
	interface Expression {
	 int calculate(int i);		
	}
	
	void setExpression(Expression e) {
		this.e = e;
	}
}