package com.kh;

public class PhoneMain3 {

	public static void main(String[] args) {
		
//		Phone p1 = new LgPhone();
//		Phone p2 = new SamsungPhone();
		
//		userPhone(p1);
//		userPhone(p2);
		
		usePhone(new LgPhone());
		usePhone(new SamsungPhone());
	}

		public static void usePhone(Phone p) {
			p.makeCall();
		}
}