package com.kh;

public class Operator {

	public static void main(String[] args) {
		
//		//1) ���������� �ܼ����� ���� ��� : ���� ����������, ���� ���������� 
//		int x = 1;
//		int y = 1;
//		
//		x++; //x = x+1;
//		y++; //y = y+1;
//		
//		System.out.println("x="+x);
//		System.out.println("y="+y);
//		
//		//2) ���������ڰ� ���Ŀ� �����Ҷ�
//		//	 ���� ���� ������ : �ڱ��ڽ��� �������� �Ŀ� ����
//		//   ���� ���� ������ : �Ŀ� �������� �ڱ��ڽ��� ����
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
//			System.out.println("�빮���̱���");
//		}
//		if((charcode >= 97)&(charcode<=122)) {
//			System.out.println("�ҹ����̱���");
//		}
//	
//		if((charcode > 48)&(charcode<57)) {
//			System.out.println("0~9 ���ڱ���");
//		}
//		
//		int value = 6;
//		
//		if((value%2==0)|(value%3==0)) {
//			System.out.println("2 �Ǵ� 3�ǹ������");
//		}
//		
//		if((value%2==0)||(value%3==0)) {
//			System.out.println("2 �Ǵ� 3�ǹ������");
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
