package main;

import java.util.HashMap;
import java.util.Map;

class Solution {
	public boolean solution(String[] phoneBook) {
		// 1. HashMap을 선언한다.
		Map<String, Integer> map = new HashMap<>();
		// 2. 모든 전화번호를 HashMap에 넣는다.
		for (int i = 0; i < phoneBook.length; i++)
			map.put(phoneBook[i], i);
			System.out.println("1번 넣고");
		// 3. 모든 전화번호의 substring이 HashMap에 존재하는지 확인한다.
		for (int i = 0; i < phoneBook.length; i++) {
			System.out.println("랭스를 넣고");
			for (int j = 0; j < phoneBook[i].length(); j++) {
				System.out.println("각각의 숫자많큼");
				if (map.containsKey(phoneBook[i].substring(0, j))) {
					System.out.println("결과 1개");
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
