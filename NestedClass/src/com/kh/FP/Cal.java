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
	//�Լ��� �������̽� (functional interface)
	//�������̽� ���� �߻�޼ҵ尡 1���� ��츦 �ǹ��ϸ�
	//������ü�� ���ٽ����� ǥ���Ҽ� �ִ�.
	interface Expression {
	 int calculate(int i);		
	}
	
	void setExpression(Expression e) {
		this.e = e;
	}
}