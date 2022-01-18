package Inheritance;

public class Student extends Person {

	int hakbun;
	
	public Student(){
 //	super();
 }

	public Student(String name, int age) {
		super(name, age);
	}
	
	public void study() {
		System.out.println("공부하다");
	}
	 //@Override 부모기능 중에 재정립 
	 
  @Override
	public void eat() {
//  	super.eat(); //있고 없고 차이가 부모객체가 재정립 되고 안되고
		System.out.println("또 먹는다");
	}
}
