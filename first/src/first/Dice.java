package first;

public class Dice {

	public static void main(String[] args) {
		//System.out.println((int)(Math.random()*6)+1); 
		//random 0.0~1
		int random = (int)(Math.random()*6)+1;
		System.out.println("던진 주사위수 = " + random);
		
		if(random == 1) {
			System.out.println("주사위값은 : 1");
		}else if(random == 2) {
			System.out.println("주사위값은 : 2");
		}else if(random == 3) {
			System.out.println("주사위값은 : 3");
		}else if(random == 4) {
			System.out.println("주사위값은 : 4");
		}else if(random == 5) {
			System.out.println("주사위값은 : 5");
		}else {
			System.out.println("주사위값은 : 6");
		}
	}
}
