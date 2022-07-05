package usermanagement.model;

public class User {
	private int nr;
	private String nume;
	private String email;
	private String localitate;
	
	public User(int nr, String nume, String email, String localitate) {
		super();
		this.id = nr;
		this.name = nume;
		this.email = email;
		this.country = localitate;
	}
	
	public User(String nume, String email, String localitate) {
		super();
		this.name = nume;
		this.email = email;
		this.country = localitate;
	}

	public int getNr() {
		return nr;
	}
	public void setNr(int nr) {
		this.nr = nr;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLocalitate() {
		return localitate;
	}
	public void setLocalitate(String localitate) {
		this.localitate = localitate;
	}
	
}
