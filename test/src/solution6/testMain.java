package solution6;

import java.util.Scanner;

public class testMain {

	public static void main(String[] args) {
	//콘솔 상에 아이디 패스워드 받기
	//로그인 로그아웃 종료 3번 틀리면 종료
		//sc.close();
		
		// 내가쓸 부품들
		test test = new test();
		Scanner sc = new Scanner(System.in);
		String Number=null;
		String id = null;
		String pw = null;
		boolean stop = false;
		boolean loginOk = false;
		LoginChk result = null;
		
		// 작동시킬 프로그램
		while(!stop) {
			
			System.out.println("1.로그인 2.로그아웃 0.종료");
			System.out.print("선택 >>");
			Number = sc.nextLine();
			
			switch (Number) {
			case "0":
				stop = true;
				continue;
			case "1":
				if(loginOk) {
					System.out.println("로그인했음");
					continue;
				}else {
				
				System.out.print("ID :");
				id = sc.nextLine();
				System.out.print("PW :");
				pw = sc.nextLine();
				}
				result = test.login(id,pw);
				if(result == LoginChk.Ok) {
					loginOk = true;
					System.out.println("로그인되었습니다.");
				}else if(result == LoginChk.NOK){
					loginOk = false;
					System.out.println("틀림");
				}else if(result == LoginChk.FAIL){
					loginOk = false;
					stop = true;
					System.out.println("로그인 3번실패");
				}
				break;
			case "2":
				if(loginOk) {
					test.logout(id);
					loginOk=false;
				}else {
					System.out.println("로그인X");
				}
				break;
						
			default:
				continue;
			}
		}
System.out.println("종료");

	}
}