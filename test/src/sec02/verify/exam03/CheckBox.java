package sec02.verify.exam03;

import sec02.verify.exam03.CheckBox.OnSelectListener;

public class CheckBox {
//직접만드는 예외?
	OnSelectListener listener; 
//인터페이스를 매개변수에 넣었어
	void setListener(OnSelectListener listener) {
		this.listener = listener;
	}
//값을 받아서 내보냄
	void select() {
		listener.onSelect();
	}
	//자체 인터페이스 선언부
	static interface OnSelectListener {
		void onSelect();
	}
}
