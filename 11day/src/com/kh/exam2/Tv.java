package com.kh.exam2;

public class Tv implements RemoteControll {
//구현클래스
	@Override
	public void turnOff() {
		System.out.println("Tv를 끄다");
	}
	public void turnOn() {
		System.out.println("Tv를 켜다");
	}
}
