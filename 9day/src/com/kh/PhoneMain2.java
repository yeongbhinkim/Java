package com.kh;

public class PhoneMain2 {

	public static void main(String[] args) {
		//변수의 생명주기는 여기서부터★
		//타입변환이란것
		//폰이라는 대전제 개념에 파생한 각각의 특성
		//부모는 자식들 것을 사용할 수 없지만
		//자식들은 부모 것을 사용할 수 있다
		LgPhone p = new LgPhone();
		SamsungPhone p2 = new SamsungPhone();
		
		usePhone(p);
//		usePhone(p2);
		//p가 참조 아래 프레임에 임시로 값을 주는것
		//동전사용?같은느낌?
				//다시 알아보자 p1 p차이
	}//★여기까지
	
	public static void usePhone(Phone p) {
		
		p.makeCall();//?
	 
		if(p instanceof LgPhone) {
		LgPhone lg = (LgPhone)p;
		lg.doInternet();	
	 }else if(p instanceof SamsungPhone) {
		 SamsungPhone sp = (SamsungPhone)p;
		 sp.watchTv();
	 }
	}
}
