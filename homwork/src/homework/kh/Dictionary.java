package homework.kh;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//����
public class Dictionary implements DicAdminIf,DicCustomerIf {
//�� Ŭ���� ���� �������̽��� ���� �����?
//Ŭ���� ���� �������̽� ��뼳����
	private Map<String, String> map = new HashMap<>();

	// ���
	@Override
	public void put(String word, String Meaning) {
		map.put(word, Meaning);
	}

	// ����
	@Override
	public void update(String word, String maening) {
		if (map.containsKey(word)) {
			map.put(word, maening);
		}
	}

	// ����
	@Override
	public String remove(String word) {
		return map.remove(word);
	}

	// �˻�
	@Override
	public String find(String word) {
		String meaning = map.get(word);
		if (meaning == null) {
			throw new IllegalArgumentException("ã�����ϴ� �ܾ �����ϴ�.");
		}
		return meaning;
	}

	// �ܾ���
	@Override
	public Set<String> listWords() {
		if (map.size() == 0) {
			throw new IllegalStateException("��ϵ� �ܾ �����ϴ�.");
		}
		return map.keySet();
	}

	// ��ü���
	@Override
	public Map<String, String> listAll() {
		if (map.size() == 0) {
			throw new IllegalArgumentException("ã�����ϴ� �ܾ �����ϴ�.");
		}
		return map;
	}

	// ��ü����
	@Override
	public void removeAll() {
		map.clear();
	}
}