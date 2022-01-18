package com.kh.exam2;

public class Example {

	public static void main(String[] args) {

		ImplementsationC imp1 = new ImplementsationC();
		imp1.methodA();
		imp1.methodB();

		InterfaceC imp2 = new ImplementsationC();
		imp2.methodA();
		imp2.methodB();

		InterfaceB imp3 = new ImplementsationC();
		imp3.methodB();

		InterfaceA imp4 = new ImplementsationC();
		imp4.methodA();

	}

}
