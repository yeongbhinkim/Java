package first;

public class Practice {

	public static void main(String[] args) {
		char grade = 'a';

		if (grade == 'B' || grade == 'b') {
			System.out.println("�Ϲ�ȸ��");
			if (grade == 'B') {
				System.out.println("�빮�� B");
			} else {
				System.out.println("�ҹ��� b");
			}

		}
		if (grade == 'A' || grade == 'a') {
			System.out.println("���ȸ��");
			if (grade == 'A') {
				System.out.println("�빮�� A");
			} else {
				System.out.println("�ҹ��� a");
			}
		}

		else {
			System.out.println("ȸ������� �����ϴ�.");
		}
	}
}