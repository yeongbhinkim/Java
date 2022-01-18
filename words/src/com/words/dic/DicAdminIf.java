package com.words.dic;

import java.util.Map;

public interface DicAdminIf extends DicCommonIf {

	// ���
	void put(String word, String Meaning);

	// ����
	void update(String word, String maening);

	// ����
	String remove(String word);

	// ��ü���
	Map<String, String> listAll();

	// ��ü����
	void removeAll();

}