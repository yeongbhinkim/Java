package com.kh.exam5;

public class Main {

	public static void main(String[] args) {
		//int 값을 (String)문자열로 변환 아스키코드
		byte[] bytes = {72,101,108,108,111,32,74,97,118,97};
		String str1 = new String(bytes);
		System.out.println(str1);
		
		//0~5여섯번째부터 시작해서 네번째까지 
		String str2 = new String (bytes, 5,4);
		System.out.println(str2);
		
	
	
	}

}
