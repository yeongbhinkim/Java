package solution6;

public class test {
	//���� �� ��ǰ��
	private int failCount;
	private final String Id = "hong";
	private final String PW = "12345";
	
	//�۵���ų ���α׷�
//�α��� �α��� üũ �Ƶ� ��� ���� 3������ �α׾ƿ�
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
		System.out.println("�α׾ƿ�");
	}
}
