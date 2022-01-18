package com.kh;

public class Car3 {
	private String color;
	private int count2; // nas로 관리하냐 클라우드로 관리하냐
	private static int count;

	public Car3() throws Exception {
		count2++;
		
		if(++count == 3) {
			throw new Exception("객체생성한도초과!");
		}
	}
//메소드
	public static int getCount() { //private를 사용하기 떄문에 필요함
		return count;
	}
	public String getcolor() {
		return color;
	}
	public int getCount2() {
		return count2;
	}
}
