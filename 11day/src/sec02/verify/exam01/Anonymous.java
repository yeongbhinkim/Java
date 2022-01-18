package sec02.verify.exam01;

public class Anonymous {
	//익명 객체 필드사용 필드에서 만들어서 사용
	Worker filed = new Worker()	{
		@Override
		public void start() {
			System.out.println("디자인을 합니다");
		}
	};
	//익명 객체 로컬변수사용 메소드 안에서 만들어서 사용
	void method1() {
		Worker localVar = new Worker() {
			@Override
			public void start() {
				System.out.println("개발을 합니다");
			}
		};
		localVar.start();
	}
	//익명객체 매개값사용 매개변수에 넣어서 만들어서 사용
	void method2(Worker worker) {
		worker.start();
	}
}