package solution5;

import java.util.Scanner;

public class BoardMain {

	static Board[] boards = new Board[10];

	public static void main(String[] args) {

		// Board board1 = new Board("����", "����1");
		boolean stop = false;
		Scanner scanner = new Scanner(System.in);
		String selectedNumber = null;

		do {
			String title = null;
			String content = null;

			System.out.println("1.��� 2.��ü��ȸ 0.����");
			System.out.print("���� > ");

			selectedNumber = scanner.nextLine();

			switch (selectedNumber) {
			case "0":
				stop = true;
				continue;
			case "1":// �Խñ� ���
				System.out.print("����:");
				title = scanner.nextLine();
				System.out.print("����:");
				content = scanner.nextLine();

				Board board = new Board(title, content);
				write(board);//�Ű���
				// write(new Board(title,content));

				break;
			case "2":// �Խñ� ��ȸ
				list();
				break;
			default:

			}

		} while (!stop);

		System.out.println("���α׷� ����!!");

	}

	// �Խñ� ���               //�Ű�����
	public static void write(Board board) {

		for (int i = 0; i < boards.length; i++) {
			if (boards[i] == null) {
				boards[i] = board;
				break;
			}
		}
	}

//�Խñ� ��ȸ
	public static void list() {
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null) {
				System.out.printf("%s\t%s\n", boards[i].title, boards[i].content);
			}
		}
	}
}