package sec02.verify.exam03;

import sec02.verify.exam03.CheckBox.OnSelectListener;

public class CheckBox {
//��������� ����?
	OnSelectListener listener; 
//�������̽��� �Ű������� �־���
	void setListener(OnSelectListener listener) {
		this.listener = listener;
	}
//���� �޾Ƽ� ������
	void select() {
		listener.onSelect();
	}
	//��ü �������̽� �����
	static interface OnSelectListener {
		void onSelect();
	}
}
