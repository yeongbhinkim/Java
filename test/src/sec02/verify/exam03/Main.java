package sec02.verify.exam03;

public class Main {

	public static void main(String[] args) {
		CheckBox checkBox = new CheckBox();
	//�͸�ü �Ű������ �Ű������� �־ ���� ���	
	//CheckBox�� setListener�� �ҷ���
	//CheckBox�ȿ� �ִ� OnSelectListener�������̽�
	//�� �ְ� �������̵� ���
		checkBox.setListener(
				new CheckBox.OnSelectListener() {
						@Override
						public void onSelect() {
							System.out.println("����� �����մϴ�");
						}
					}
				);
		checkBox.select();
	}

}
