package com.main;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		int K = N;
		
		while(true) {
	 	N =	((N%10)*10)+(((N/10)+(N%10))%10);
			count++;
			
			if(N==K) {
				break;
				
			}
		}
		System.out.println(count);
		
	}

}
