package sec02.verify.exam03;

public class Main {

	public static void main(String[] args) {
		CheckBox checkBox = new CheckBox();
	//익명객체 매개값사용 매개변수에 넣어서 만들어서 사용	
	//CheckBox에 setListener를 불러서
	//CheckBox안에 있는 OnSelectListener인터페이스
	//를 넣고 오버라이드 출력
		checkBox.setListener(
				new CheckBox.OnSelectListener() {
						@Override
						public void onSelect() {
							System.out.println("배경을 변경합니다");
						}
					}
				);
		checkBox.select();
	}

}
