package solution6;

import java.util.Scanner;

public class testMain {

	public static void main(String[] args) {
	//�ܼ� �� ���̵� �н����� �ޱ�
	//�α��� �α׾ƿ� ���� 3�� Ʋ���� ����
		//sc.close();
		
		// ������ ��ǰ��
		test test = new test();
		Scanner sc = new Scanner(System.in);
		String Number=null;
		String id = null;
		String pw = null;
		boolean stop = false;
		boolean loginOk = false;
		LoginChk result = null;
		
		// �۵���ų ���α׷�
		while(!stop) {
			
			System.out.println("1.�α��� 2.�α׾ƿ� 0.����");
			System.out.print("���� >>");
			Number = sc.nextLine();
			
			switch (Number) {
			case "0":
				stop = true;
				continue;
			case "1":
				if(loginOk) {
					System.out.println("�α�������");
					continue;
				}else {
				
				System.out.print("ID :");
				id = sc.nextLine();
				System.out.print("PW :");
				pw = sc.nextLine();
				}
				result = test.login(id,pw);
				if(result == LoginChk.Ok) {
					loginOk = true;
					System.out.println("�α��εǾ����ϴ�.");
				}else if(result == LoginChk.NOK){
					loginOk = false;
					System.out.println("Ʋ��");
				}else if(result == LoginChk.FAIL){
					loginOk = false;
					stop = true;
					System.out.println("�α��� 3������");
				}
				break;
			case "2":
				if(loginOk) {
					test.logout(id);
					loginOk=false;
				}else {
					System.out.println("�α���X");
				}
				break;
						
			default:
				continue;
			}
		}
System.out.println("����");

	}
}