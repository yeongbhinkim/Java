package com.kh;
/*
 * 국, 영, 수 총점, 평균 구하기(배열사용하기)
 */
public class HackJum {

	public static void main(String[] args) {
		
		int sum = 0;							  //총점
		double avg = 0.0;				  	//평균
		int[] subject = new int[3];//인티저형 : 공간을 3개만듬 개당 4byte 배열생성
		
		subject[0]	= 90;
		subject[1]  = 70;
		subject[2] 	= 80;
		
		//subject[3]	= 50;
		
		System.out.println(subject[2]);
		System.out.println(subject.length);//방의 크기?, 개수를 알려줌
		//System.out.println(subject[3]);
		
		//int sum = subject[0] + subject[1] + subject[2];
		
		for(int i=0; i<subject.length; i++) {
			sum += subject[i];
		}
	
		avg = (double)sum / subject.length;
		
		System.out.println("총점"+sum);
		System.out.println("평균"+avg);	
		
	}

}
