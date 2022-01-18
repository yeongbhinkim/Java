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
	
	//구분선
	public static void line() {
		System.out.println("=================");
	}
	
	public static void line(int count) {
		for(int i=1; i<=count; i++) {
			System.out.print("=");
		}                //ln은 줄바꿈
		System.out.println();
	}
	
	//1 변수 : 메모리 특정곤간에 붙여진 이름
	//2 변수 선언 : 타입 + 변수명 
	//3 변수의 생명주기(유호범위):블럭내에서 유효범위를 갖는다.
	//덧셈 
	public static int sum(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	//뺄셈
	public static int minus(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}
	
	//곱셈
	public static int muliti(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}
	
	//나눗셈
	public static double devide(int num1, int num2) {
		double result = num1 / (double)num2;
		return result;
	}
}//end of class
