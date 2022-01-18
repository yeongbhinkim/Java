package homework.kh;

import java.util.Scanner;

public class Menu {

	private Scanner scanner = new Scanner(System.in);

	// �޴�
	// �ʱ�޴�
	public void initMenu() {
		Members members = new Members();
		String id = null;
		String pw = null;
		String choiceNum = null;
		boolean stop = false;
		
		while (!stop) {
			System.out.println("1.�α��� 2.���� 3.ȸ��Ż�� 0.����");
			System.out.print("���� > ");
			choiceNum = scanner.nextLine();

			switch (choiceNum) {
			case "0":// ����
				System.exit(0);
				break;
			case "1":// �α���
				System.out.print("ID : ");
				id = scanner.nextLine();
				System.out.print("PW : ");
				pw = scanner.nextLine();

				members.isMember(id, pw);
				
				break;
			case "2":// ����
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
			case "3": // ȸ��Ż��
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

	// �����ڿ�޴�
	public void adminMenu() {
		String id = null;
		String pw = null;
		String choiceNum = null;
		boolean isMember = false;
		admin admin = new admin();
		String word = null;
		String Meaning = null;
		
		while (!isMember) {
			System.out.println("1.��� 2.���� 3.�˻� 4.���� 5.�ܾ��� 6.��ü��� 7.��ü���� 0.�α׾ƿ�");
			System.out.print("���� > ");
			choiceNum = scanner.nextLine();
			
			switch (choiceNum) {
			case "0":// �α׾ƿ�
				isMember = true;
				break;
			case "1":// ���
				System.out.println("���");
				System.out.print("�ܾ� : ");
				word = scanner.nextLine();
				System.out.print("�� : ");
				Meaning = scanner.nextLine();
				admin.put(word, Meaning);
				
				
				break;
			case "2":// ����
				System.out.println("����");
				System.out.print("�ܾ� : ");
				word = scanner.nextLine();
				System.out.print("�� : ");
				Meaning = scanner.nextLine();
				admin.update(word, Meaning);
				break;
			case "3": // �˻�
				System.out.print("�˻� :");
				word = scanner.nextLine();
				admin.find(word);
				break;
			case "4": // ����
				System.out.print("���� :");
				word = scanner.nextLine();
				admin.remove(word);
				break;
			case "5": // �ܾ���
				System.out.println("�ܾ���");
				admin.listWords();
				break;
			case "6": // ��ü���
				System.out.println("��ü���");
				admin.listAll();
				break;
			case "7": // ��ü����
				System.out.println("��ü����");
				admin.removeAll();
				break;
			default:
				break;
			}
		}
	}

	// ����ڸ޴�
	public void customerMenu() {
		String id = null;
		String pw = null;
		String choiceNum = null;
		boolean isMember = false;
		user user = new user();
		String word = null;
		String Meaning = null;
		
		while (!isMember) {
			System.out.println("1.�˻� 2.�ܾ��� 0.�α׾ƿ�");
			System.out.print("���� > ");
			choiceNum = scanner.nextLine();

			switch (choiceNum) {
			case "0":// �α׾ƿ�
				isMember = true;
				break;
			case "1":// �˻�
				System.out.print("�˻� :");
				word = scanner.nextLine();
				user.find(word);
				break;
			case "2":// �ܾ���
				System.out.println("�ܾ���");
				user.listWords();
				break;
		
			default:
				break;
			}
		}
	}
}
