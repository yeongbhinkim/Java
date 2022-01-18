package com.kh.exam7;

public class Main {

	public static void main(String[] args) {

		String name = "홍길동";
		String name2 = "홍길동";
		//대입이 아니라 새로운 객체를 만들어서 내보낸다 (주소값 비교)replace
		String name3 = name2.replace("동", "순");
		System.out.println(name == name2);
		System.out.println(name2 == name3);
		
		
	}

}
