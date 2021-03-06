package main;

import java.util.HashMap;
import java.util.Iterator;

public class c {
	
	public int solution(String[][] clothes) {
		//옷을 종류별로 구분하기
		//0+1 0+1 0+1 0+1
		//1+1 1 1
		HashMap<String, Integer>map = new HashMap<String, Integer>();
		
		for(String[] clothe : clothes) {
			String type = clothe[1];
			map.put(type, map.getOrDefault(type, 0)+1);
		}
		
		//입지 않은 경우를 추가하여 모든 조합 계산하기
		//2+1 1+1 1+1
		Iterator<Integer> it = map.values().iterator();

		int answer = 1 ;
	
		while(it.hasNext())
			answer *= it.next().intValue()+1;
		
		return answer-1;
	}

public static void main(String[] args) {
		//배열 String type = clothe[1]; 
		//비교할 것들이
//		String[][] clothes =  {
//				{"yellowhat", "headgear"},
//				{"bluesunglasses", "eyewear"},
//				{"green_turban", "headgear"},
//				};

		String[][] clothes =  {
				{"동그란 안경", "검정 선글라스"},
				{"파란색 티셔츠", "검정 선글라스"},
				{"청바지", "2"},
				{"긴 코트", "3"}
		};
	
		c sol = new c();
		System.out.println(sol.solution(clothes));
		//경우의수
		System.out.println((2*(3+2+1))+3);
		
		
	}

}
