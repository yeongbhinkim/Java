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
			
//			for (LoginService i : loginService.list) { // for���� ���� ��ü���============================
//				System.out.println(i);
//			}
			System.out.println("1.�α��� 2.���� 0.����");
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
				result = loginService.login(id, pw);

				if (result == 1) {// ����
					if (id.equals("admin")) {
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
								System.out.println("�ܾ���");
								System.out.print("�ܾ� : ");
								Word = scanner.nextLine();
								System.out.print("�� : ");
								Meaning = scanner.nextLine();
								map.put(Word, Meaning);
								break;
							case "2":
								System.out.println("����");
								System.out.print("�ܾ� : ");
								Word = scanner.nextLine();
								System.out.print("�� : ");
								Meaning = scanner.nextLine();
								map.replace(Word, Meaning);
								for (String key : map.keySet()) {
									System.out.println(String.format("�ܾ� : %s, �� : %s", key, map.get(key)));
								}
								break;
							case "3":
								System.out.println("�˻��ܾ� : ");
								Word = scanner.nextLine();
								System.out.println(String.format("�ܾ� : %s,�� : %s", Word, map.get(Word)));

								break;
							case "4":
								System.out.print("������ �ܾ� : ");
								map.remove(scanner.nextLine());
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
					} else {
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
								System.out.println("�˻��ܾ� : ");
								Word = scanner.nextLine();
								System.out.println(String.format("�ܾ� : %s,�� : %s", Word, map.get(Word)));
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

//				list.add(new LoginService("admin", "1234"));
				if (chk == 1) {
					System.out.println("�ߺ��� ID�Դϴ�.");
				} else {
					loginService.map2.put(id, pw);
					System.out.println(id + "�� ������ ���ϵ帳�ϴ�.");
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
		//�ߺ�
		}
		System.out.println("���α׷�����!");
	}

}
