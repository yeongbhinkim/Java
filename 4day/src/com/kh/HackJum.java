package com.kh;
/*
 * ��, ��, �� ����, ��� ���ϱ�(�迭����ϱ�)
 */
public class HackJum {

	public static void main(String[] args) {
		
		int sum = 0;							  //����
		double avg = 0.0;				  	//���
		int[] subject = new int[3];//��Ƽ���� : ������ 3������ ���� 4byte �迭����
		
		subject[0]	= 90;
		subject[1]  = 70;
		subject[2] 	= 80;
		
		//subject[3]	= 50;
		
		System.out.println(subject[2]);
		System.out.println(subject.length);//���� ũ��?, ������ �˷���
		//System.out.println(subject[3]);
		
		//int sum = subject[0] + subject[1] + subject[2];
		
		for(int i=0; i<subject.length; i++) {
			sum += subject[i];
		}
	
		avg = (double)sum / subject.length;
		
		System.out.println("����"+sum);
		System.out.println("���"+avg);	
		
	}

}
