package main;

import java.util.Scanner;

public class i {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double m = sc.nextInt();
		double n = sc.nextInt();
		
		if(n<1) {
			System.out.println("�ι�° ���� 1���� ū���� �����ּ���");
			
		}	else {
			System.out.printf("%.0f\n", Math.ceil(m/n));
		}
	}
}
