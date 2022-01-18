package test;

import java.util.Scanner;

public class Movie {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] seat = new String[6][10];

		//�¼� �迭
		int cnt = 0;
		for(int i=0; i<seat.length; i++) {
			for(int j=0; j<seat[i].length; j++) {
				seat[i][j] = "" + ++cnt;
			}
		}
		
		while(true) {
			
			//�¼� �����ֱ�
			for(int i=0; i<seat.length; i++) {
				for(int j=0; j<seat[i].length; j++) {
					System.out.printf("%3s", seat[i][j]);
				}
				System.out.println();
			}
			
			//�¼� ����
			System.out.print("��ȭ�� �¼��� �����ϼ���(1~60)>>");
			int mySeat = sc.nextInt();
			int myRow = (mySeat - 1) / 10;	// 0.0 1.0 2.0 �̷����� ���ü�����
			int myCol = (mySeat - 1) % 10;  // 0~9���ڰ������� 
//			int myRow = (mySeat % 10 == 0) ? (mySeat / 10) - 1 : (mySeat / 10);
//			int myCol = (mySeat % 10 == 0) ? 9 : (mySeat % 10) - 1;
			
			if(mySeat < 1 || mySeat >60) {
				System.out.println("�߸��� �¼� ��ȣ�Դϴ�. �ٽ� �����ϼ���.");
				continue;
			}

			if(seat[myRow][myCol].equals("X")) {
				System.out.println("�̹� ����� �¼��Դϴ�. �ٸ� �¼��� �����Ͻʽÿ�.");
			}
			else {
				seat[myRow][myCol] = "X";
				System.out.println("���Ű� �Ϸ�Ǿ����ϴ�.");
			}
		}

	}

}
