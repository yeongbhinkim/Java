package homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordNoteMain {
	public static void main(String[] args) {

		LoginService loginService = new LoginService();
		Map<String, String> map = new HashMap<String, String>();

		Scanner scanner = new Scanner(System.in);
		boolean stop = false; // 초기화면
		boolean stop2 = false; // 관리자화면
		boolean stop3 = false; // 일반화면
		String selecteNumber = null; // 메뉴선택
		boolean loginOk = false; // 로그인체크
		int result = 0; // 로그인체크
		int chk = 0; // 중복체크
		String id;
		String pw;
		String Word = null; // 단어
		String Meaning = null; // 뜻

		while (!stop) {

			System.out.println("1.로그인 2.가입 0.종료");
			System.out.print("선택>");
			stop2 = false;
			stop3 = false;
			selecteNumber = scanner.nextLine();
			switch (selecteNumber) {
			case "0":// 종료
				stop = true;
				continue;
			case "1":// 로그인
				if (loginOk) {
					System.out.println("이미로그인 하셨습니다.");
					continue;
				}
				System.out.print("id:");
				id = scanner.nextLine();
				System.out.print("pw:");
				pw = scanner.nextLine();
				result = loginService.login(id, pw);

				if (result == 1) {// 성공
					if (id.equals("admin")) { // 관리자 로그인
						loginOk = true;
						System.out.println("관리자 로그인 되었습니다.");
						while (!stop2) {
							System.out.println("1.등록 2.수정 3.검색 4.삭제 5.단어목록 6.전체목록 0.로그아웃");
							System.out.print("선택>");
							selecteNumber = scanner.nextLine();

							switch (selecteNumber) {
							case "0":
								if (loginOk) {
									loginService.logout(id);
									stop2 = true;
									loginOk = false;
								}
								break;
							case "1":
								System.out.print("단어등록: ");
								Word = scanner.nextLine();
								if (map.containsKey(Word)) {
									System.out.println("중복된 단어입니다.");
								} else {
									System.out.print("뜻 등록: ");
									Meaning = scanner.nextLine();
									map.put(Word, Meaning);
								System.out.println(String.format("단어 : %s, 뜻 : %s 등록되었습니다", Word, Meaning));
								}
								break;
							case "2":
								System.out.print("수정할 단어: ");
								Word = scanner.nextLine();
								if (!map.containsKey(Word)) {
									System.out.println("없는 단어입니다");
								} else {
									System.out.print("뜻 수정: ");
									Meaning = scanner.nextLine();
									map.replace(Word, Meaning);
									System.out.println(String.format("단어 : %s, 뜻 : %s 수정되었습니다", Word, Meaning));
								}
								break;
							case "3":
								System.out.print("검색단어 : ");
								Word = scanner.nextLine();
								if (!map.containsKey(Word)) {
									System.out.println("없는 단어입니다");
								} else {
									System.out.println(String.format("단어 : %s,뜻 : %s 입니다", Word, map.get(Word)));
								}
								break;
							case "4":
								System.out.print("삭제할 단어 : ");
								if (!map.containsKey(Word)) {
									System.out.println("없는 단어입니다");
								} else {
									map.remove(scanner.nextLine());
									System.out.println(String.format(Word + " 삭제되었습니다"));
								}
								break;
							case "5":
								System.out.println("단어목록");
								for (String key : map.keySet()) {
									System.out.println(String.format("단어 : %s", key));
								}
								break;
							case "6":
								System.out.println("전체목록");
								for (String key : map.keySet()) {
									System.out.println(String.format("단어 : %s, 뜻 : %s", key, map.get(key)));
								}
								break;

							default:
								break;
							}

						}
					} else { // 일반로그인
						loginOk = true;
						System.out.println("로그인 되었습니다.");
						while (!stop3) {
							System.out.println("1.단어검색 2.단어목록 0.로그아웃");
							System.out.print("선택>");
							selecteNumber = scanner.nextLine();
							switch (selecteNumber) {
							case "0":
								if (loginOk) {
									loginService.logout(id);
									loginOk = false;
									stop3 = true;
								}
								break;
							case "1":
								System.out.print("검색단어 : ");
								Word = scanner.nextLine();
								if (!map.containsKey(Word)) {
									System.out.println("없는 단어입니다");
								} else {
									System.out.println(String.format("단어 : %s,뜻 : %s 입니다", Word, map.get(Word)));
								}
								break;
							case "2":
								System.out.println("단어목록");
								for (String key : map.keySet()) {
									System.out.println(String.format("단어 : %s", key));
								}
								break;

							default:
								break;
							}
						}
					}
				} else if (result == 0) {// 실패
					loginOk = false;
					System.out.println("id 또는 passwrod가 올바르지 않습니다 3번 실패시 종료");
				} else if (result == -1) {// 3번실패
					loginOk = false;
					stop = true;
					System.out.println("로그인 3번 실패 했습니다!");
				}
				break;

			case "2": // 가입 중복체크
				System.out.print("id:");
				id = scanner.nextLine();
				System.out.print("pw:");
				pw = scanner.nextLine();

				chk = loginService.IdChk(id, pw);

				if (chk == 1) {
					System.out.println("중복된 ID입니다.");
				} else {
					loginService.map2.put(id, pw);
					System.out.println(id + "님 가입을 축하드립니다.");
				}
				break;
			default:
				continue;
			}
		}
		System.out.println("프로그램종료!");
	}
}