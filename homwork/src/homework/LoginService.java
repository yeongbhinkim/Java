package homework;

import java.util.HashMap;
import java.util.Map;

public class LoginService {

	static Map<String, String> map2 = new HashMap<String, String>();

	public LoginService() { //���̵�
		map2.put("admin", "1234");
	}

	private int failCount; //�α��� ī��Ʈ

	// �α���
	public int login(String id, String pw) {
		int result = 0; // ����
		if (LoginService.map2.containsKey(id)) {
			if (LoginService.map2.get(id).equals(pw))
				result = 1;// ����
			failCount = 0;
		} else {
			result = 0;// 3�� ����
			failCount++;
			if (++failCount == 3) {
				result = -1;
			} else {
				result = 0;
			}
		}
		return result;

	}

	// ���̵� �ߺ�üũ
	public int IdChk(String id, String pw) {
		int chk = 0;
		if (LoginService.map2.containsKey(id)) {
			chk = 1;// ����
		}
		return chk;
	}

	// �α׾ƿ�
	public void logout(String id) {
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
}
