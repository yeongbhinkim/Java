package homework.kh;

import java.util.Set;
//관리자,일반사용자
public interface DicCommonIf {

	// 검색
	String find(String word);

	// 단어목록
	Set<String> listWords();

}