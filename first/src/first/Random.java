package first;

public class Random {

	public static void main(String[] args) {
		//System.out.println((int)(Math.random()*6)+1); 
		//random 0.0~1
		int random = (int)(Math.random()*100)+1;
		System.out.println("(1~100)정수값 = " + random);
		//3의배수 체크
		
//		System.out.println((11 % 2) == 0);
		if(random % 3 == 0) {
			System.out.println("3의 배수입니다.");
		}else {
			System.out.println("3의 배수가 아닙니다.");
		}
		
		//2의 배수이면서 3의 배수인지 체크 and
		if(random % 2==0 && random % 3 ==0) {
			System.out.println("2의배수 이면서 3의 배수");
		}else {
			System.out.println("2의배수 이면서 3의배수가 아닌값");
		}
		
		//2의배수 이거나 3의 배수인지 체크 or
		if(random % 2==0 || random % 3 ==0) {
			System.out.println("2의배수 이거나 3의 배수");
		}else {
			System.out.println("2의배수 이거나 3의배수가 아닌값");
		}
		//2의 배수가 아닌경우 맞다== 아니다!= 
		if(!(random % 2 ==0)) {
			System.out.println("2배수가 아니다.");
		}else {
			System.out.println("2배수다");
		}
		//2의 배수가 아닌경우 맞다== 아니다!=
		if( random % 2 !=0) {
			System.out.println("2배수가 아니다.");
		}else {
			System.out.println("2배수다");
		}
	}
}
//산술연산자: +, -, *, /, %
//대입연산자: =
//비교연산자: ==, !=, >, <, >=, <=		결과값은 boolean(true,false)
//논리연산자: &&(and), ||(or), !(not)	결과값은 boolean(true,false)