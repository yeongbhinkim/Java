package homework.copy2;

public class Login {

	private String ID;
	private String PW;

	public Login(String iD, String pW) {
		super();
		ID = iD;
		PW = pW;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getPW() {
		return PW;
	}

	public void setPW(String pW) {
		PW = pW;
	}

	@Override
	public String toString() {
		return "Login [ID=" + ID + ", PW=" + PW + "]";
	}

}
