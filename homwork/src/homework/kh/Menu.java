package homework.kh;

import java.util.Scanner;

public class Menu {

	private Scanner scanner = new Scanner(System.in);

	// 메뉴
	// 초기메뉴
	public void initMenu() {
		Members members = new Members();
		String id = null;
		String pw = null;
		String choiceNum = null;
		boolean stop = false;
		
		while (!stop) {
			System.out.println("1.로그인 2.가입 3.회원탈퇴 0.종료");
			System.out.print("선택 > ");
			choiceNum = scanner.nextLine();

			switch (choiceNum) {
			case "0":// 종료
				System.exit(0);
				break;
			case "1":// 로그인
				System.out.print("ID : ");
				id = scanner.nextLine();
				System.out.print("PW : ");
				pw = scanner.nextLine();

				members.isMember(id, pw);
				
				break;
			case "2":// 가입
				System.out.print("ID : ");
				id = scanner.nextLine();
				System.out.print("PW : ");
				pw = scanner.nextLine();

				try {
					members.joinMember(id, pw);
				} catch (IllegalStateException e) {
					System.out.println(e.getMessage());
				}
				break;
			case "3": // 회원탈퇴
				System.out.print("ID : ");
				id = scanner.nextLine();
				System.out.print("PW : ");
				pw = scanner.nextLine();

				try {
					members.XXX(id, pw);
				} catch (IllegalStateException e) {
					System.out.println(e.getMessage());
				}
				break;
			default:
				break;
			}
		}
	}

	// 관리자용메뉴
	public void adminMenu() {
		String id = null;
		String pw = null;
		String choiceNum = null;
		boolean isMember = false;
		admin admin = new admin();
		String word = null;
		String Meaning = null;
		
		while (!isMember) {
			System.out.println("1.등록 2.수정 3.검색 4.삭제 5.단어목록 6.전체목록 7.전체삭제 0.로그아웃");
			System.out.print("선택 > ");
			choiceNum = scanner.nextLine();
			
			switch (choiceNum) {
			case "0":// 로그아웃
				isMember = true;
				break;
			case "1":// 등록
				System.out.println("등록");
				System.out.print("단어 : ");
				word = scanner.nextLine();
				System.out.print("뜻 : ");
				Meaning = scanner.nextLine();
				admin.put(word, Meaning);
				
				
				break;
			case "2":// 수정
				System.out.println("수정");
				System.out.print("단어 : ");
				word = scanner.nextLine();
				System.out.print("뜻 : ");
				Meaning = scanner.nextLine();
				admin.update(word, Meaning);
				break;
			case "3": // 검색
				System.out.print("검색 :");
				word = scanner.nextLine();
				admin.find(word);
				break;
			case "4": // 삭제
				System.out.print("삭제 :");
				word = scanner.nextLine();
				admin.remove(word);
				break;
			case "5": // 단어목록
				System.out.println("단어목록");
				admin.listWords();
				break;
			case "6": // 전체목록
				System.out.println("전체목록");
				admin.listAll();
				break;
			case "7": // 전체삭제
				System.out.println("전체삭제");
				admin.removeAll();
				break;
			default:
				break;
			}
		}
	}

	// 사용자메뉴
	public void customerMenu() {
		String id = null;
		String pw = null;
		String choiceNum = null;
		boolean isMember = false;
		user user = new user();
		String word = null;
		String Meaning = null;
		
		while (!isMember) {
			System.out.println("1.검색 2.단어목록 0.로그아웃");
			System.out.print("선택 > ");
			choiceNum = scanner.nextLine();

			switch (choiceNum) {
			case "0":// 로그아웃
				isMember = true;
				break;
			case "1":// 검색
				System.out.print("검색 :");
				word = scanner.nextLine();
				user.find(word);
				break;
			case "2":// 단어목록
				System.out.println("단어목록");
				user.listWords();
				break;
		
			default:
				break;
			}
		}
	}
}
