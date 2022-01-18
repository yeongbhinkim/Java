package com.kh;

public class Operator {

	public static void main(String[] args) {
		
//		//1) 증감연산자 단속으로 사용될 경우 : 전위 증감연산자, 후위 증감연산자 
//		int x = 1;
//		int y = 1;
//		
//		x++; //x = x+1;
//		y++; //y = y+1;
//		
//		System.out.println("x="+x);
//		System.out.println("y="+y);
//		
//		//2) 증감연산자가 수식에 참여할때
//		//	 전위 증감 연산자 : 자기자신을 증감한후 식에 참여
//		//   후위 증감 연산자 : 식에 참여한후 자기자신을 증감
//		
//		int i = 1;
//		int j = 1;
//		//j++ + 1 = j=(1+j) n=(j+1)
//		int m = ++i + 1;
//		int n = j++ + 1;
//		
//		System.out.println("m="+m);
//		System.out.println("n="+n);
//		
//		System.out.printf("i=%d, j=%d \n", i , j);
//		int charcode = 'A';
//		
//		if((charcode >= 65)&(charcode<=90)) {
//			System.out.println("대문자이군요");
//		}
//		if((charcode >= 97)&(charcode<=122)) {
//			System.out.println("소문자이군요");
//		}
//	
//		if((charcode > 48)&(charcode<57)) {
//			System.out.println("0~9 숫자군요");
//		}
//		
//		int value = 6;
//		
//		if((value%2==0)|(value%3==0)) {
//			System.out.println("2 또는 3의배수군요");
//		}
//		
//		if((value%2==0)||(value%3==0)) {
//			System.out.println("2 또는 3의배수군요");
//		}
//	
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("------------------");
		x++; //11
		++x; //12
		System.out.println("x="+x);//12
		
		System.out.println("------------------");
		y--; //9
		--y; //8
		System.out.println("y="+y);//8
		
		System.out.println("------------------");
		z=x++;
		System.out.println("z="+z); //12
		System.out.println("x="+x); //13
		
		System.out.println("------------------");
		z=++x;// 
		System.out.println("z="+z); //14
		System.out.println("x="+x); //14
		
		System.out.println("------------------");
		z= ++x + y++;
		System.out.println("z="+z); //15+8
		System.out.println("x="+x); //15
		System.out.println("y="+y); //9
	}
}
