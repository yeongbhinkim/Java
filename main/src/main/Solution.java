package main;

import java.util.HashMap;
import java.util.Map;

class Solution {
	public boolean solution(String[] phoneBook) {
		// 1. HashMap�� �����Ѵ�.
		Map<String, Integer> map = new HashMap<>();
		// 2. ��� ��ȭ��ȣ�� HashMap�� �ִ´�.
		for (int i = 0; i < phoneBook.length; i++)
			map.put(phoneBook[i], i);
			System.out.println("1�� �ְ�");
		// 3. ��� ��ȭ��ȣ�� substring�� HashMap�� �����ϴ��� Ȯ���Ѵ�.
		for (int i = 0; i < phoneBook.length; i++) {
			System.out.println("������ �ְ�");
			for (int j = 0; j < phoneBook[i].length(); j++) {
				System.out.println("������ ���ڸ�ŭ");
				if (map.containsKey(phoneBook[i].substring(0, j))) {
					System.out.println("��� 1��");
					return false;
				}
	}
			}
		return true;
	}
	public static void main(String[] args) {
			
		String[] phone_book = {"119", "97674223", "1195524421"};
//		String[] phone_book = { "123", "456", "789" };
//		String[] phone_book = {"12","123","1235","567","88"};
		Solution sol = new Solution();
		System.out.println(sol.solution(phone_book));

	}

}