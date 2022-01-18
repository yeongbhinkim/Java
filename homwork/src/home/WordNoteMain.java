package home;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class WordNoteMain {

	public static void main(String[] args) {

		LoginService loginService = new LoginService();
		Map<String, String> map = new HashMap<String, String>();
//		LoginService loginService2 = new LoginService(null, null);
//		List<LoginService> list = new ArrayList<>();
//		Map<String, String> map2 = new HashMap<>();
//		list.add(new LoginService("admin", "1234"));
//		loginService.list;
//		for(int i=0; i<list.size(); i++);{
//			list.get(0);
//		}
			
		Scanner scanner = new Scanner(System.in);
		boolean stop = false;
		boolean stop2 = false;
		boolean stop3 = false;
		String selecteNumber = null;
		boolean loginOk = false;
		int result = 0;
		int chk = 0;
		String id;
		String pw;
		String Word = null;
		String Meaning = null;
		loginService.map2.put("admin","1234");
//		map2.put("admin", "1234");
		
//		list.add(new LoginService("admin", "1234"));
//		chk = LoginService.login(id, pw);
		while (!stop) {
			
//			for (LoginService i : loginService.list) { // for문을 통한 전체출력============================
//				System.out.println(i);
//			}
			System.out.println("1.로그인 2.가입 0.종료");
			System.out.print("선택>");
			
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
					if (id.equals("admin")) {
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
								System.out.println("단어등록");
								System.out.print("단어 : ");
								Word = scanner.nextLine();
								System.out.print("뜻 : ");
								Meaning = scanner.nextLine();
								map.put(Word, Meaning);
								break;
							case "2":
								System.out.println("수정");
								System.out.print("단어 : ");
								Word = scanner.nextLine();
								System.out.print("뜻 : ");
								Meaning = scanner.nextLine();
								map.replace(Word, Meaning);
								for (String key : map.keySet()) {
									System.out.println(String.format("단어 : %s, 뜻 : %s", key, map.get(key)));
								}
								break;
							case "3":
								System.out.println("검색단어 : ");
								Word = scanner.nextLine();
								System.out.println(String.format("단어 : %s,뜻 : %s", Word, map.get(Word)));

								break;
							case "4":
								System.out.print("삭제할 단어 : ");
								map.remove(scanner.nextLine());
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
					} else {
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
								System.out.println("검색단어 : ");
								Word = scanner.nextLine();
								System.out.println(String.format("단어 : %s,뜻 : %s", Word, map.get(Word)));
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

//				list.add(new LoginService("admin", "1234"));
				if (chk == 1) {
					System.out.println("중복된 ID입니다.");
				} else {
					loginService.map2.put(id, pw);
					System.out.println(id + "님 가입을 축하드립니다.");
				}
//					loginService.list.add(new LoginService(id, pw));
//					list.add(new LoginService(id, pw));
//					for(int i=1; i<=list.size(); i++) {
//						
//					}
//					list.put(id, pw);
//					loginService.setID(id);
//					loginService.setPW(pw);
//					map.put(id, pw);
//					int i=1; i<=list.size(); i++
				break;
			default:
				continue;
			}
		//중복
		}
		System.out.println("프로그램종료!");
	}

}
