package com.kh;

public class Array2 {

	public static void main(String[] args) {
		
//		int[] score = new int[3];
//		System.out.println(score);
//		System.out.println(score.length);
//		System.out.println(score[0]);
//		System.out.println(score[1]);
//		System.out.println(score[2]);
		
//		int[][] array = new int[2][3];//대입연산자:오른족부터 실행
//		
//		array[1][1] = 10;
//		
//		System.out.println(array);
//		System.out.println(array.length);
//		System.out.println(array[0]);
//		System.out.println(array[1]);
//		System.out.println(array[0].length);
//		System.out.println(array[1].length);
//		
//		System.out.println(array[0][0]);
//		System.out.println(array[0][1]);
//		System.out.println(array[0][2]);
//		System.out.println(array[1][0]);
//		System.out.println(array[1][1]);
//		System.out.println(array[1][2]);
	
		int[][][] array3 = new int[3][2][4];
		
		int[][] array4 = new int[3][];
		array4[0] = new int[3];
		array4[1] = new int[2];
		array4[2] = new int[4];
		
		int[][][] array5 = new int[3][][];
		
		array5[0] = new int[2][];
		array5[1] = new int[3][];
		array5[2] = new int[2][];
		
		array5[0][0] = new int[10];
		array5[0][1] = new int[3];
		
	}

}
