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

			System.out.println("1.�α��� 2.�α׾ƿ� 0.����");
			System.out.print("����>");
			selecteNumber = scanner.nextLine();

			switch (selecteNumber) {

			case "0":// ����
				stop = true;

			case "1":// �α���

				if (logInOk) {
					System.out.println("�̷̹α��� �ϼ̽��ϴ�");
					continue;
				}
				System.out.print("id:");
				id = scanner.nextLine();
				System.out.print("pw:");
				pw = scanner.nextLine();
				logInOk = Test.login(id, pw);
				if (logInOk) {
					System.out.println("�α��ε�");
				} else if (count > 1) {
					stop = true;
				} else {
					System.out.println("Ʋ�� 3�� Ʋ���� ����");
					++count;
				}
				break;
			case "2":// �α׾ƿ�
				if (logInOk) {
					Test.logout(id);
					logInOk = false;
				} else {
					System.out.println("�α��� ���� ����");
				}
				break;
			default:
				continue;
			}

		}
	}
//3ȸ �̻� Ʋ���� ����
}
