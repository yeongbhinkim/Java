package home;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;





public class LoginService {
	
//	private String ID;
//	private String PW;
	
 static Map<String, String> map2 = new HashMap<String, String>();
//	List<LoginService> list = new ArrayList<LoginService>();
//	Set<LoginService> set = new HashSet<>(list);
//	public LoginService() {
//		map2.put("admin", "1234");
//	}
		
//		list.add(new LoginService("admin", "1234"));
//		list.add(new LoginService(ID, PW));
//		String valueA = list.get(0).toString();

//	public LoginService(String iD, String pW) {
//		super();
//		ID = iD;
//		PW = pW;
//	}

//	public String getID() {
//		return ID;
//	}
//	public String getPW() {
//		return PW;
//	}
//
//	public void setID(String iD) {
//		ID = iD;
//	}
//
//
//	public void setPW(String pW) {
//		PW = pW;
//	}
	

//	@Override
//	public  String toString() {
//		return "LoginService [ID=" + ID + ", PW=" + PW + "]";
//	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(ID, PW);
//	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) //동일객체면 true
//			return true;
//		if (obj == null)//null 비교는 false
//			return false;
//		if (getClass() != obj.getClass())//타입이 다르면 false
//			return false;
//		LoginService other = (LoginService) obj;
//		return ID == other.ID && Objects.equals(PW, other.PW);
//	}
	
//	@Override
//	public boolean equals(Object obj) {
//	boolean result = false;
//		
//		if(obj instanceof LoginService) {
//			if(this.id == ((LoginService)obj).ID) {
//				result = true;
//			}
//		}
//		return result;
//	}
	public LoginService() {
		LoginService.map2.put("admin","1234");
		map2.put("admin","1234");
	}

	private int failCount; 
	
	// 로그인
	public int login(String id, String pw) {
		int result = 0; //실패
//		if(id.equals("admin") && pw.equals("1234")) {
//			result = 1;//성공
//			failCount = 0;  LoginService.map2.containsKey(id) && LoginService.map2.containsKey(pw)
//		} 키로만 하니까 키랑 데이터  loginMap.get(id).equals(pw)
		if(LoginService.map2.get(id).equals(pw)) {
			result = 1;//성공
			failCount = 0;
		}
		else {
			result = 0;//3번 실패
			//failCount++;
			if(++failCount == 3) {
				result = -1;
			}else {
				result = 0;
			}
		}
		return result;

	}
	

//static
//		list.contains(ID) id.equals  LoginService  loginService
//		if(id.equals(ID)){ iterator() WordNoteMain 	toArray()
	public int IdChk(String id, String pw) {
		 int chk = 0; 
			if(LoginService.map2.containsKey(id)){
			chk = 1;//성공
		}
				return chk;
	}

	// 로그아웃
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
