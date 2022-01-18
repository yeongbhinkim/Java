package solution6;

public class Member {
	
	String name;
	String id;
	String password;
	int age;
	
	public Member() {
		super();
		
	}
	
	public Member(String name, String id) {
		this.name =name;
		this.id = id;
	}
	
	public void smile() {
		System.out.println(name+"°¡ ¿ô´Ù");
	}
}
