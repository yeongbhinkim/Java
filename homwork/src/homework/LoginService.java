package homework;

import java.util.HashMap;
import java.util.Map;

public class LoginService {

	static Map<String, String> map2 = new HashMap<String, String>();

	public LoginService() { //아이디
		map2.put("admin", "1234");
	}

	private int failCount; //로그인 카운트

	// 로그인
	public int login(String id, String pw) {
		int result = 0; // 실패
		if (LoginService.map2.containsKey(id)) {
			if (LoginService.map2.get(id).equals(pw))
				result = 1;// 성공
			failCount = 0;
		} else {
			result = 0;// 3번 실패
			failCount++;
			if (++failCount == 3) {
				result = -1;
			} else {
				result = 0;
			}
		}
		return result;

	}

	// 아이디 중복체크
	public int IdChk(String id, String pw) {
		int chk = 0;
		if (LoginService.map2.containsKey(id)) {
			chk = 1;// 성공
		}
		return chk;
	}

	// 로그아웃
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
