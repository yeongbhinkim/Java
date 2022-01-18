package homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordNoteMain {
	public static void main(String[] args) {

		LoginService loginService = new LoginService();
		Map<String, String> map = new HashMap<String, String>();

		Scanner scanner = new Scanner(System.in);
		boolean stop = false; // �ʱ�ȭ��
		boolean stop2 = false; // ������ȭ��
		boolean stop3 = false; // �Ϲ�ȭ��
		String selecteNumber = null; // �޴�����
		boolean loginOk = false; // �α���üũ
		int result = 0; // �α���üũ
		int chk = 0; // �ߺ�üũ
		String id;
		String pw;
		String Word = null; // �ܾ�
		String Meaning = null; // ��

		while (!stop) {

			System.out.println("1.�α��� 2.���� 0.����");
			System.out.print("����>");
			stop2 = false;
			stop3 = false;
			selecteNumber = scanner.nextLine();
			switch (selecteNumber) {
			case "0":// ����
				stop = true;
				continue;
			case "1":// �α���
				if (loginOk) {
					System.out.println("�̷̹α��� �ϼ̽��ϴ�.");
					continue;
				}
				System.out.print("id:");
				id = scanner.nextLine();
				System.out.print("pw:");
				pw = scanner.nextLine();
				result = loginService.login(id, pw);

				if (result == 1) {// ����
					if (id.equals("admin")) { // ������ �α���
						loginOk = true;
						System.out.println("������ �α��� �Ǿ����ϴ�.");
						while (!stop2) {
							System.out.println("1.��� 2.���� 3.�˻� 4.���� 5.�ܾ��� 6.��ü��� 0.�α׾ƿ�");
							System.out.print("����>");
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
								System.out.print("�ܾ���: ");
								Word = scanner.nextLine();
								if (map.containsKey(Word)) {
									System.out.println("�ߺ��� �ܾ��Դϴ�.");
								} else {
									System.out.print("�� ���: ");
									Meaning = scanner.nextLine();
									map.put(Word, Meaning);
								System.out.println(String.format("�ܾ� : %s, �� : %s ��ϵǾ����ϴ�", Word, Meaning));
								}
								break;
							case "2":
								System.out.print("������ �ܾ�: ");
								Word = scanner.nextLine();
								if (!map.containsKey(Word)) {
									System.out.println("���� �ܾ��Դϴ�");
								} else {
									System.out.print("�� ����: ");
									Meaning = scanner.nextLine();
									map.replace(Word, Meaning);
									System.out.println(String.format("�ܾ� : %s, �� : %s �����Ǿ����ϴ�", Word, Meaning));
								}
								break;
							case "3":
								System.out.print("�˻��ܾ� : ");
								Word = scanner.nextLine();
								if (!map.containsKey(Word)) {
									System.out.println("���� �ܾ��Դϴ�");
								} else {
									System.out.println(String.format("�ܾ� : %s,�� : %s �Դϴ�", Word, map.get(Word)));
								}
								break;
							case "4":
								System.out.print("������ �ܾ� : ");
								if (!map.containsKey(Word)) {
									System.out.println("���� �ܾ��Դϴ�");
								} else {
									map.remove(scanner.nextLine());
									System.out.println(String.format(Word + " �����Ǿ����ϴ�"));
								}
								break;
							case "5":
								System.out.println("�ܾ���");
								for (String key : map.keySet()) {
									System.out.println(String.format("�ܾ� : %s", key));
								}
								break;
							case "6":
								System.out.println("��ü���");
								for (String key : map.keySet()) {
									System.out.println(String.format("�ܾ� : %s, �� : %s", key, map.get(key)));
								}
								break;

							default:
								break;
							}

						}
					} else { // �Ϲݷα���
						loginOk = true;
						System.out.println("�α��� �Ǿ����ϴ�.");
						while (!stop3) {
							System.out.println("1.�ܾ�˻� 2.�ܾ��� 0.�α׾ƿ�");
							System.out.print("����>");
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
								System.out.print("�˻��ܾ� : ");
								Word = scanner.nextLine();
								if (!map.containsKey(Word)) {
									System.out.println("���� �ܾ��Դϴ�");
								} else {
									System.out.println(String.format("�ܾ� : %s,�� : %s �Դϴ�", Word, map.get(Word)));
								}
								break;
							case "2":
								System.out.println("�ܾ���");
								for (String key : map.keySet()) {
									System.out.println(String.format("�ܾ� : %s", key));
								}
								break;

							default:
								break;
							}
						}
					}
				} else if (result == 0) {// ����
					loginOk = false;
					System.out.println("id �Ǵ� passwrod�� �ùٸ��� �ʽ��ϴ� 3�� ���н� ����");
				} else if (result == -1) {// 3������
					loginOk = false;
					stop = true;
					System.out.println("�α��� 3�� ���� �߽��ϴ�!");
				}
				break;

			case "2": // ���� �ߺ�üũ
				System.out.print("id:");
				id = scanner.nextLine();
				System.out.print("pw:");
				pw = scanner.nextLine();

				chk = loginService.IdChk(id, pw);

				if (chk == 1) {
					System.out.println("�ߺ��� ID�Դϴ�.");
				} else {
					loginService.map2.put(id, pw);
					System.out.println(id + "�� ������ ���ϵ帳�ϴ�.");
				}
				break;
			default:
				continue;
			}
		}
		System.out.println("���α׷�����!");
	}
}