package solution6;

public class test {
	//내가 쓸 부품들
	private int failCount;
	private final String Id = "hong";
	private final String PW = "12345";
	
	//작동시킬 프로그램
//로그인 로그인 체크 아디 비번 대입 3번실패 로그아웃
	public LoginChk login(String id, String pw) {
		LoginChk result = null;
		
		if(id.equals(Id) && pw.equals(PW)) {
			result = LoginChk.Ok;
			failCount = 0;
		}else{
			if(++failCount == 3) {
				result = LoginChk.FAIL;
			}else {
				result = LoginChk.NOK;
			}
		}
		
		return result;
	}
	public void logout(String Id) {
		System.out.println("로그아웃");
	}
}
