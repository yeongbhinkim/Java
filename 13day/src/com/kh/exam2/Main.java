package com.kh.exam2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		//��� .put
		map.put("person", "���");
		map.put("student", "�л�");
		map.put("teacher", "������");
		
		//��ü��ȸ .entrySet();
		Set<Entry<String, String>> set = map.entrySet();
		wordList(set);
		
		//�ܾ���ȸ .get
		String meaning = map.get("person");
		System.out.println(meaning);
		
		//�ܾ���� .remove
		map.remove("teacher");
		wordList(set);
		
		//�ܾ���� ����� .put �ܾ� containsKey
		String keyworkd = "student";
		meaning = "�л�(����)";
		if(map.containsKey("student")) {
			map.put(keyworkd, meaning);
		}
		wordList(set);
		
		//�ܾ��� ����
		Set<String> words = map.keySet();
		for(String word : words) {
			System.out.printf("%s \t", word);
		}
		System.out.println();
		
	}

	private static void wordList(Set<Entry<String, String>> set) {
		for(Entry<String, String> ele : set) {
			String key = ele.getKey();
			String value = ele.getValue();
			System.out.printf("�ܾ�:%s, �ǹ�:%s \n", key, value);
		}
	}
}