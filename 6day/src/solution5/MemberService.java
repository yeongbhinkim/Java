package solution5;

public class MemberService {
	
	private int failCount; 
	
	// �α���
	public int login(String id, String password) {
		int result = 0; //����
		
		if(id.equals("hong") && password.equals("12345")) {
			result = 1;//����
			failCount = 0;
		}else {
			result = 0;//3�� ����
			//failCount++;
			if(++failCount == 3) {
				result = -1;
			}else {
				result = 0;
			}
		}
		return result;

	}
//		}else {
//			return false;
//		}
//	}

	// �α׾ƿ�
	public void logout(String id) {
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
}