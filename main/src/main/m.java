package main;

import java.util.Scanner;

public class m {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		in.close();

		int count = 0;
		count += count;

		loop: for (int i = 0; i < 10; i++) {
			int c = 0;
			for (int j = 0; j < str.length(); j++) {
				if ((str.charAt(j) - '0') == i) {
					c++;
					count++;
				}
			}
			if (c != 1) {
				System.out.println(false);
				break loop;
			} else if (count == 10) {
				System.out.println(true);
				break loop;
			}
		}
	}
}