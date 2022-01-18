package com.kh;

public class PhoneMain {

	public static void main(String[] args) {
	
		LgPhone lgPhone = new LgPhone();
		lgPhone.makeCall();
		lgPhone.doInternet();
		
		SamsungPhone sp = new SamsungPhone();
		sp.hangup();
		sp.watchTv();
		
		
		//상위 개념만 가지고옴
		//자식이 부모를 바라보는 관점
		Phone phone = (Phone)lgPhone;
		phone.makeCall();
		//자동형변환 (Phone)안보임
		Phone phone2 = sp;
		phone2.makeCall();
		//부모가 자식을 바라보는 관점 
		//(LgPhone)상위에서 하위는 자동형변환이 안된다
		//(LgPhone)강제 형변환을 해야된다 상위에서 하위로 할때
		//시점에 따라 달라짐 생각해보자
		LgPhone lgPhone2 = (LgPhone)phone;
		lgPhone2.doInternet();
		
		
	}

}
