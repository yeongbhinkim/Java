package solution7.problem5;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
	}
	/*
	 * 1. 생략된 기본 생성자 체크
	 * 2. 생략된 부모생성자 호출 체크
	 * 3. 생성자 내에서 자신의 다른 생성자 호출과
	 *    부모생성자 호출을 동시에 사용불가
	 * 4. 생성자내에서 생성자 호출은 항상 첫출에 위치
	 * 5. 생성자내에 부모생성자 호출은 
	 *    암묵적이든 명시적이든 항상존재한다
	 */
}
