package com.kh;

public class PhoneMain {

	public static void main(String[] args) {
	
		LgPhone lgPhone = new LgPhone();
		lgPhone.makeCall();
		lgPhone.doInternet();
		
		SamsungPhone sp = new SamsungPhone();
		sp.hangup();
		sp.watchTv();
		
		
		//���� ���丸 �������
		//�ڽ��� �θ� �ٶ󺸴� ����
		Phone phone = (Phone)lgPhone;
		phone.makeCall();
		//�ڵ�����ȯ (Phone)�Ⱥ���
		Phone phone2 = sp;
		phone2.makeCall();
		//�θ� �ڽ��� �ٶ󺸴� ���� 
		//(LgPhone)�������� ������ �ڵ�����ȯ�� �ȵȴ�
		//(LgPhone)���� ����ȯ�� �ؾߵȴ� �������� ������ �Ҷ�
		//������ ���� �޶��� �����غ���
		LgPhone lgPhone2 = (LgPhone)phone;
		lgPhone2.doInternet();
		
		
	}

}
