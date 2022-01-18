package sec02.verify.exam01;

public class Anonymous {
	//�͸� ��ü �ʵ��� �ʵ忡�� ���� ���
	Worker filed = new Worker()	{
		@Override
		public void start() {
			System.out.println("�������� �մϴ�");
		}
	};
	//�͸� ��ü ���ú������ �޼ҵ� �ȿ��� ���� ���
	void method1() {
		Worker localVar = new Worker() {
			@Override
			public void start() {
				System.out.println("������ �մϴ�");
			}
		};
		localVar.start();
	}
	//�͸�ü �Ű������ �Ű������� �־ ���� ���
	void method2(Worker worker) {
		worker.start();
	}
}