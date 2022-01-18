package homework.kh;

import java.util.HashMap;
import java.util.Map;

public class Members {
//�޴� ����
	private Map<String, String> map = new HashMap<>();
	private final String ADMIN_ID = "admin";
	private final String ADMIN_PW = "1234";
	Menu menu = new Menu();

	public Members() {
		map.put(ADMIN_ID, ADMIN_PW);
	}

	/**
	 * �̷��� �ϸ� ���� ȸ�� ����
	 * 
	 * @param id ȸ�����̵�
	 * @param pw ȸ�� ��й�ȣ
	 */
	public void joinMember(String id, String pw) {
		// ���̵� �ߺ�üũ
		if (map.containsKey(id)) {
			throw new IllegalStateException("ȸ�� ���̵�� ����Ҽ� �����ϴ�");
		}
		map.put(id, pw);
		System.out.println(id + "�� ������ ���ϵ帳�ϴ�.");
	}

	// ȸ�� ����
	public boolean isMember(String id, String pw) {
		boolean isMember = false;
		if (map.get(id).equals(pw)) {
			if (id.equals(ADMIN_ID)) {
				System.out.println(id + "�α���");
				isMember = true;
				menu.adminMenu();
			} else {
				System.out.println(id + "�α���");
				isMember = true;
				menu.customerMenu();
			}
		}
		return isMember;
	}

	// ȸ�� Ż��
	public void XXX(String id, String pw) {

		if (map.containsKey(id)) {
			if (map.get(id).equals(pw)) {
				map.remove(id);
				System.out.println(id + "�� Ż��.");
			} else {
				throw new IllegalStateException("���̵� �����ϴ�.");
			}
		}
	}
}