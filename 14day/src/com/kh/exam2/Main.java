package com.kh.exam2;

public class Main {

	public static void main(String[] args) {

		ThreadA threadA = new ThreadA("A");
		ThreadB threadB = new ThreadB("B");

		threadA.start();
		threadB.start();

		Thread threadC = new Thread("C") {
			@Override
			public void run() {
				for (int i = 21; i <= 30; i++) {
					System.out.println(getName() + ":"+i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};		
		threadC.start();

		new Thread("D") {
			@Override
			public void run() {// 1~10
				for (int i = 31; i <= 40; i++) {
					System.out.println(getName() + ":"+i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
		System.out.println(Thread.currentThread().getName() + ": 메인스레드");
	}
}
