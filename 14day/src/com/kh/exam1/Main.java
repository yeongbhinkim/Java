package com.kh.exam1;

public class Main {
								//���ν�����
	public static void main(String[] args) {
	//�����ǽ�����
		Runnable taskA = new TaskA();
		Thread threadA = new Thread(taskA);
		threadA.start();
	//�����ǽ�����
		Runnable taskB = new TaskB();  			//���̺�
		Thread threadB = new Thread(taskB);	//������
		threadB.start();										//���
		
		//�̸��� ���� �ڽİ�ü
		Thread threadC = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 31; i <= 40; i++) {
					System.out.println(i);
					try {
						Thread.sleep(500);//1000�� 1��
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		threadC.start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 41; i <= 50; i++) {
					System.out.println(i);
					try {
						Thread.sleep(500);//1000�� 1��
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		
		//����ǥ����, �Լ������α׷���
		new Thread(()->{
			for (int i = 51; i <= 60; i++) {
				System.out.println(i);
				try {
					Thread.sleep(500);//1000�� 1��
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();;
		
	//���ν�����
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);//1000�� 1��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
