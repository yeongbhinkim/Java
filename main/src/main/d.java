package main;

import java.util.Scanner;

public class d {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		boolean run = true;
		int count = 1;
		
		System.out.println("1~100 ���ڸ� �����ּ���");
		
		int num = (int) (Math.random() * 100) + 1;
		System.out.println(num);
		while(run) {
			int a=sc.nextInt();
			if (num == a) {
				System.out.println("�����Դϴ� "+count+"ȸ���� ������");
				run =false;
			}else if(num < a){
				System.out.println("DOWM");
				count++;
			}else if(num > a){
				System.out.println("UP");
				count++;
			}
		}
	}
}