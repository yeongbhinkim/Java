package com.kh;

public class Promotion {

	public static void main(String[] args) {

		byte b = (byte) 129; // -128~127 127������ -128��

		System.out.println(b); // ���� �ս��� �߻� (overflow)

		int x = 10;
  	//��������ȯ : ���� �ս��� ���� ��쿡 �ǹ̰� �ִ�.
		
		byte y = (byte) x;
		System.out.println(y); // ���� ����.
	
		int i = 1;
		int j = 2;
		//(double)i/(double)j;
		double result = (double)i/j;
		System.out.println(result);
		
		int q = 1;
		int w = 2;// w(����) * 1.0 =2.0(�Ǽ�)
		
		double result1 = q/(w*1.0);
		System.out.println(result1);
		
		int diceNumber = (int)(Math.random()*6)+1;
		System.out.println(diceNumber);
		
		//���ڿ��� �⺻Ÿ������ ��ȯ
		String str1 = "10";
		int result2 = Integer.parseInt(str1);
		byte result3 = Byte.parseByte(str1);
		long result4 = Long.parseLong(str1);
		short result5 = Short.parseShort(str1);
		double result7 = Double.parseDouble(str1); 
		
		
		int z = result2 + result3 + (int)result4 + result5;
		System.out.println(z);
		
		byte result6 = (byte)z;
		System.out.println(result6);
		System.out.println(result7);
		
		//�⺻Ÿ���� ���ڿ��� ��ȯ
		String str2 = String.valueOf(result2); 
		String str3 = String.valueOf(result3); 
		String str4 = String.valueOf(result4); 
		String str5 = String.valueOf(result5); 
		
		System.out.println(str2 +"\t"+ str3 +"\t"+ str4 +"\t"+ str5);
	}
}