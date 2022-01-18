package com.kh.exam1;

public class Main {
								//메인스레드
	public static void main(String[] args) {
	//별도의스레드
		Runnable taskA = new TaskA();
		Thread threadA = new Thread(taskA);
		threadA.start();
	//별도의스레드
		Runnable taskB = new TaskB();  			//테이블
		Thread threadB = new Thread(taskB);	//쓰레드
		threadB.start();										//출력
		
		//이름이 없는 자식객체
		Thread threadC = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 31; i <= 40; i++) {
					System.out.println(i);
					try {
						Thread.sleep(500);//1000에 1초
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
						Thread.sleep(500);//1000에 1초
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		
		//람다표현식, 함수형프로그램밍
		new Thread(()->{
			for (int i = 51; i <= 60; i++) {
				System.out.println(i);
				try {
					Thread.sleep(500);//1000에 1초
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();;
		
	//메인스레드
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);//1000에 1초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
