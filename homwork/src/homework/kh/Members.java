package homework.kh;

import java.util.HashMap;
import java.util.Map;

public class Members {
//메뉴 서비스
	private Map<String, String> map = new HashMap<>();
	private final String ADMIN_ID = "admin";
	private final String ADMIN_PW = "1234";
	Menu menu = new Menu();

	public Members() {
		map.put(ADMIN_ID, ADMIN_PW);
	}

	/**
	 * 이렇게 하면 좋음 회원 가입
	 * 
	 * @param id 회원아이디
	 * @param pw 회원 비밀번호
	 */
	public void joinMember(String id, String pw) {
		// 아이디 중복체크
		if (map.containsKey(id)) {
			throw new IllegalStateException("회원 아이디로 사용할수 없습니다");
		}
		map.put(id, pw);
		System.out.println(id + "님 가입을 축하드립니다.");
	}

	// 회원 인증
	public boolean isMember(String id, String pw) {
		boolean isMember = false;
		if (map.get(id).equals(pw)) {
			if (id.equals(ADMIN_ID)) {
				System.out.println(id + "로그인");
				isMember = true;
				menu.adminMenu();
			} else {
				System.out.println(id + "로그인");
				isMember = true;
				menu.customerMenu();
			}
		}
		return isMember;
	}

	// 회원 탈퇴
	public void XXX(String id, String pw) {

		if (map.containsKey(id)) {
			if (map.get(id).equals(pw)) {
				map.remove(id);
				System.out.println(id + "님 탈퇴.");
			} else {
				throw new IllegalStateException("아이디가 없습니다.");
			}
		}
	}
}
