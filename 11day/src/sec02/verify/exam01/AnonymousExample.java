package sec02.verify.exam01;

public class AnonymousExample {

	public static void main(String[] args) {

		Anonymous anony = new Anonymous();
	//익명 객체 필드사용
		anony.filed.start();
	//익명 객체 로컬변수사용
		anony.method1();
	//익명객체 매개값사용
		anony.method2(new Worker() {
			@Override
			public void start() {
				System.out.println("테스트를 합니다");
			}
		});
	}
}