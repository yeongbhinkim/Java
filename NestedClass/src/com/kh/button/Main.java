package com.kh.button;

public class Main {

	public static void main(String[] args) {
		
		Button btn = new Button();
		btn.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("Å¬¸¯µÊ!!");
			}
		});
		btn.click();		
		
	}

}
