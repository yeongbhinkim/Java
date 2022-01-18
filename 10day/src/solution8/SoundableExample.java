package solution8;

public class SoundableExample {
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
//		soundable.sound();
	}
	
	public static void main(String[] args) {

		printSound(new Cat());
		printSound(new Dog());
		
	}

}
