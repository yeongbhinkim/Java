package solution6;

public class test {
	
	private int failCount; 

	public boolean login(String id, String password) {
				boolean result = false;
		if (id.equals("hong") && password.equals("12345")) {
			return true;
		}
		return false;
	}

	public void logout(String id) {
		System.out.println("로그아웃이 되었습니다");
	}
}