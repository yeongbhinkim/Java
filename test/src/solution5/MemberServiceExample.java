package solution5;

import java.util.Scanner;

public class MemberServiceExample {

	public static void main(String[] args) {

		// �ܼ� �� ���̵� �н����� �ޱ�

		               // ���� ���          //�޾ƿ���
		MemberService memberService = new MemberService();
		Scanner scanner = new Scanner(System.in);
		boolean stop = false;

		String selecteNumber = null;
		String id = null;
		String pw = null;
		boolean loginOk = false;
		int result = 0;
		while (!stop) {
			System.out.println("1.�α��� 2.�α׾ƿ� 0.����");
			System.out.print("����>");
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
				
				result = memberService.login(id, pw);
				
				if (result==1) {//����
					loginOk = true;
					System.out.println("�α��� �Ǿ����ϴ�.");
				} else if(result == 0) {//����
					loginOk = false;
					System.out.println("id �Ǵ� passwrod�� �ùٸ��� �ʽ��ϴ�");					
				}else if(result == -1) {//3������
					loginOk = false;
					stop = true;
					System.out.println("�α��� 3�� ���� �߽��ϴ�!");
				}
				break;
			case "2":// �α׾ƿ�
				if (loginOk) {
					memberService.logout(id);
					loginOk = false;
				} else {
					System.out.println("�α������� ���� �����Դϴ�!");
				}
				break;

			default:
				continue;
			}
		}
		System.out.println("���α׷�����!");
//		// ���� �־��ְ�
//		boolean result = memberService.login("hong", "12345");
//		if (result) {
//			System.out.println("�α����� �Ǿ����ϴ�");
//			memberService.logout("hong");
//
//		} else {
//			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
//		}
	}
}
