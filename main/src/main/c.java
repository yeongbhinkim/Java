package main;

import java.util.HashMap;
import java.util.Iterator;

public class c {
	
	public int solution(String[][] clothes) {
		//���� �������� �����ϱ�
		//0+1 0+1 0+1 0+1
		//1+1 1 1
		HashMap<String, Integer>map = new HashMap<String, Integer>();
		
		for(String[] clothe : clothes) {
			String type = clothe[1];
			map.put(type, map.getOrDefault(type, 0)+1);
		}
		
		//���� ���� ��츦 �߰��Ͽ� ��� ���� ����ϱ�
		//2+1 1+1 1+1
		Iterator<Integer> it = map.values().iterator();

		int answer = 1 ;
	
		while(it.hasNext())
			answer *= it.next().intValue()+1;
		
		return answer-1;
	}

public static void main(String[] args) {
		//�迭 String type = clothe[1]; 
		//���� �͵���
//		String[][] clothes =  {
//				{"yellowhat", "headgear"},
//				{"bluesunglasses", "eyewear"},
//				{"green_turban", "headgear"},
//				};

		String[][] clothes =  {
				{"���׶� �Ȱ�", "���� ���۶�"},
				{"�Ķ��� Ƽ����", "���� ���۶�"},
				{"û����", "2"},
				{"�� ��Ʈ", "3"}
		};
	
		c sol = new c();
		System.out.println(sol.solution(clothes));
		//����Ǽ�
		System.out.println((2*(3+2+1))+3);
		
		
	}

}