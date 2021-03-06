package main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class b {
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for(String player : participant)
			map.put(player, map.getOrDefault(player, 0)+1);
		
		for(String plarer : completion)
			map.put(plarer, map.getOrDefault(plarer, 0)-1);
		Iterator<Map.Entry<String,Integer>> iter = map.entrySet().iterator();
		
		while(iter.hasNext()) {
			Map.Entry<String,Integer> entry = iter.next();
			
			if(entry.getValue() !=0) {
				answer = entry.getKey();
				break;
			}
		}
		return answer;
	}
	

	public static void main(String[] args) {
		String[] part = { "leo", "kiki", "eden" };
		String[] comp = { "eden", "kiki" };
		b sol = new b();
		System.out.println(sol.solution(part, comp));
		
	}

}
