package com.kh.exam6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("���*KH".substring(3));
		
		String str = "���----------*KH";
//		System.out.println(str.substring((str.indexOf("*")+1)));
		int findedPosition = str.indexOf("*") + 1;
		System.out.println(str.substring(findedPosition));

		boolean stop = false;
		while (!stop) {
			Scanner sc = new Scanner(System.in);
			System.out.print("�̸��� �Է��ϼ��� : ");
			String name = sc.nextLine();
			System.out.println(name);

			if (existNumber(name)) {
				System.out.println("���ڰ� ���ԵǾ����ϴ�.");
				continue;
			} else {
				stop = true;
				continue;
			}
		}
//	  return existNumber(name);
	}

	private static boolean existNumber(String name) {
		boolean result = false;

		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i); //�ƽ�Ű�ڵ� ��ȯ�ؼ� ���ڰ� �ִ��� �˼��ְ� ��ȯ
			
			if (ch >= 48 && ch <= 58) { // 0~9 ���ԵǾ��ִ��� �Ǵ�
				result = true;
				break;
			}
		}
		return result;
	}

}
