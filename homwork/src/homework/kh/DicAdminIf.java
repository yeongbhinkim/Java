package homework.kh;

import java.util.Map;
//관리자
public interface DicAdminIf extends DicCommonIf {

	// 등록
	void put(String word, String Meaning);

	// 수정
	void update(String word, String maening);

	// 삭제
	String remove(String word);

	// 전체목록
	Map<String, String> listAll();

	// 전체삭제
	void removeAll();

}