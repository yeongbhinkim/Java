package solution5;

import java.util.Scanner;

public class BoardMain {

	static Board[] boards = new Board[10];

	public static void main(String[] args) {

		// Board board1 = new Board("제목", "내용1");
		boolean stop = false;
		Scanner scanner = new Scanner(System.in);
		String selectedNumber = null;

		do {
			String title = null;
			String content = null;

			System.out.println("1.등록 2.전체조회 0.종료");
			System.out.print("선택 > ");

			selectedNumber = scanner.nextLine();

			switch (selectedNumber) {
			case "0":
				stop = true;
				continue;
			case "1":// 게시글 등록
				System.out.print("제목:");
				title = scanner.nextLine();
				System.out.print("내용:");
				content = scanner.nextLine();

				Board board = new Board(title, content);
				write(board);//매개값
				// write(new Board(title,content));

				break;
			case "2":// 게시글 조회
				list();
				break;
			default:

			}

		} while (!stop);

		System.out.println("프로그램 종료!!");

	}

	// 게시글 등록               //매개변수
	public static void write(Board board) {

		for (int i = 0; i < boards.length; i++) {
			if (boards[i] == null) {
				boards[i] = board;
				break;
			}
		}
	}

//게시글 조회
	public static void list() {
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null) {
				System.out.printf("%s\t%s\n", boards[i].title, boards[i].content);
			}
		}
	}
}