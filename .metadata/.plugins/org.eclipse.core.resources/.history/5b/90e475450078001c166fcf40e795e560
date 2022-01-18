package com.kh.button;

public class Button {
	
	//인스턴스 멤버 필드
	OnClickListener listener;
	
	//인스턴스 멤버 메소드
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}

	//인스턴스 멤버 메소드
	void click() {
		listener.onClick();
	}
	
	//인스턴스 멤버 인터페이스 
	interface OnClickListener{
		void onClick();
	}
}
