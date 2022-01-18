package com.kh.FP;

public class Main {

	public static void main(String[] args) {

		Cal cal = new Cal();
		
//		cal.setExpression(new Cal.Expression() {
//			
//			@Override
//			public int calculate(int i) {
//
//				return i * 4;
//			}
//		});
		cal.setExpression(i -> i * 4);
		
		cal.perform();
	}

}
