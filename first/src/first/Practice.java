package first;

public class Practice {

	public static void main(String[] args) {
		char grade = 'a';

		if (grade == 'B' || grade == 'b') {
			System.out.println("일반회원");
			if (grade == 'B') {
				System.out.println("대문자 B");
			} else {
				System.out.println("소문자 b");
			}

		}
		if (grade == 'A' || grade == 'a') {
			System.out.println("우수회원");
			if (grade == 'A') {
				System.out.println("대문자 A");
			} else {
				System.out.println("소문자 a");
			}
		}

		else {
			System.out.println("회원등급이 없습니다.");
		}
	}
}
