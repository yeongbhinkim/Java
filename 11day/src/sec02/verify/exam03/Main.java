package sec02.verify.exam03;

public class Main {

	public static void main(String[] args) {
		CheckBox checkBox = new CheckBox();
		checkBox.setListener(
					new CheckBox.OnSelectListener() {
						
						@Override
						public void onSelect() {
							System.out.println("����� �����մϴ�");
						}
					}
				);
		checkBox.select();
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
