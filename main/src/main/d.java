package main;

import java.util.Scanner;

public class d {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		boolean run = true;
		int count = 1;
		
		System.out.println("1~100 숫자를 맞춰주세요");
		
		int num = (int) (Math.random() * 100) + 1;
		System.out.println(num);
		while(run) {
			int a=sc.nextInt();
			if (num == a) {
				System.out.println("정답입니다 "+count+"회만에 맞췄어요");
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
