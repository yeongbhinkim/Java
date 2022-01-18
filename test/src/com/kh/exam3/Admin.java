package com.kh.exam3;
//운영자 권한
public class Admin extends Person {
	//음료채우기
	void fillBerverage(ForAdmin admin) {
		admin.fillBerverager();
	}
	//거스름돈채우기
	void fillMoney(ForAdmin admin) {
		admin.fillMoney();
	}
}