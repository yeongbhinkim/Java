package first;

public class Random {

	public static void main(String[] args) {
		//System.out.println((int)(Math.random()*6)+1); 
		//random 0.0~1
		int random = (int)(Math.random()*100)+1;
		System.out.println("(1~100)������ = " + random);
		//3�ǹ�� üũ
		
//		System.out.println((11 % 2) == 0);
		if(random % 3 == 0) {
			System.out.println("3�� ����Դϴ�.");
		}else {
			System.out.println("3�� ����� �ƴմϴ�.");
		}
		
		//2�� ����̸鼭 3�� ������� üũ and
		if(random % 2==0 && random % 3 ==0) {
			System.out.println("2�ǹ�� �̸鼭 3�� ���");
		}else {
			System.out.println("2�ǹ�� �̸鼭 3�ǹ���� �ƴѰ�");
		}
		
		//2�ǹ�� �̰ų� 3�� ������� üũ or
		if(random % 2==0 || random % 3 ==0) {
			System.out.println("2�ǹ�� �̰ų� 3�� ���");
		}else {
			System.out.println("2�ǹ�� �̰ų� 3�ǹ���� �ƴѰ�");
		}
		//2�� ����� �ƴѰ�� �´�== �ƴϴ�!= 
		if(!(random % 2 ==0)) {
			System.out.println("2����� �ƴϴ�.");
		}else {
			System.out.println("2�����");
		}
		//2�� ����� �ƴѰ�� �´�== �ƴϴ�!=
		if( random % 2 !=0) {
			System.out.println("2����� �ƴϴ�.");
		}else {
			System.out.println("2�����");
		}
	}
}
//���������: +, -, *, /, %
//���Կ�����: =
//�񱳿�����: ==, !=, >, <, >=, <=		������� boolean(true,false)
//����������: &&(and), ||(or), !(not)	������� boolean(true,false)