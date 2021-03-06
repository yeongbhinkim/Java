package homework.kh;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//사전
public class Dictionary implements DicAdminIf,DicCustomerIf {
//이 클래스 보다 인터페이스를 먼저 만든다?
//클래스 개념 인터페이스 사용설명서
	private Map<String, String> map = new HashMap<>();

	// 등록
	@Override
	public void put(String word, String Meaning) {
		map.put(word, Meaning);
	}

	// 수정
	@Override
	public void update(String word, String maening) {
		if (map.containsKey(word)) {
			map.put(word, maening);
		}
	}

	// 삭제
	@Override
	public String remove(String word) {
		return map.remove(word);
	}

	// 검색
	@Override
	public String find(String word) {
		String meaning = map.get(word);
		if (meaning == null) {
			throw new IllegalArgumentException("찾고자하는 단어가 없습니다.");
		}
		return meaning;
	}

	// 단어목록
	@Override
	public Set<String> listWords() {
		if (map.size() == 0) {
			throw new IllegalStateException("등록된 단어가 없습니다.");
		}
		return map.keySet();
	}

	// 전체목록
	@Override
	public Map<String, String> listAll() {
		if (map.size() == 0) {
			throw new IllegalArgumentException("찾고자하는 단어가 없습니다.");
		}
		return map;
	}

	// 전체삭제
	@Override
	public void removeAll() {
		map.clear();
	}
}
