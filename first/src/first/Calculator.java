package first;

public class Calculator {

	public static void main(String[] args) {
		int result = sum(10, 20);
		System.out.println(result);
		//System.out.println("==========");
		line(5);
		result = minus(10,20);
		System.out.println(result);
		//System.out.println("========");
		line(10);
		result = muliti(10, 20);
		System.out.println(result);	
		//System.out.println("======");
		line(15);
		double result2 = devide(10,60);
		System.out.println(result2);
		line();
	}//end of main
	
	//���м�
	public static void line() {
		System.out.println("=================");
	}
	
	public static void line(int count) {
		for(int i=1; i<=count; i++) {
			System.out.print("=");
		}                //ln�� �ٹٲ�
		System.out.println();
	}
	
	//1 ���� : �޸� Ư���ﰣ�� �ٿ��� �̸�
	//2 ���� ���� : Ÿ�� + ������ 
	//3 ������ �����ֱ�(��ȣ����):�������� ��ȿ������ ���´�.
	//���� 
	public static int sum(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	//����
	public static int minus(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}
	
	//����
	public static int muliti(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}
	
	//������
	public static double devide(int num1, int num2) {
		double result = num1 / (double)num2;
		return result;
	}
}//end of class
