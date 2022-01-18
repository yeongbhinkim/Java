package solution5;

import java.util.Scanner;

public class testMain {

	public static void main(String[] args) {

		test Test = new test();
		Scanner scanner = new Scanner(System.in);
		boolean stop = false;

		String selecteNumber = null;
		String id = null;
		String pw = null;
		boolean logInOk = false;
		int count = 0;

		while (!stop) {

			System.out.println("1.로그인 2.로그아웃 0.종료");
			System.out.print("선택>");
			selecteNumber = scanner.nextLine();

			switch (selecteNumber) {

			case "0":// 종료
				stop = true;

			case "1":// 로그인

				if (logInOk) {
					System.out.println("이미로그인 하셨습니다");
					continue;
				}
				System.out.print("id:");
				id = scanner.nextLine();
				System.out.print("pw:");
				pw = scanner.nextLine();
				logInOk = Test.login(id, pw);
				if (logInOk) {
					System.out.println("로그인됨");
				} else if (count > 1) {
					stop = true;
				} else {
					System.out.println("틀림 3번 틀리면 종료");
					++count;
				}
				break;
			case "2":// 로그아웃
				if (logInOk) {
					Test.logout(id);
					logInOk = false;
				} else {
					System.out.println("로그인 하지 않음");
				}
				break;
			default:
				continue;
			}

		}
	}
//3회 이상 틀리면 종료
}
