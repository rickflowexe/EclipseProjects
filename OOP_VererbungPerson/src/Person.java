
public class Person {

	protected String name, telefon, eMail;
	protected Wohnadresse wa;
	
	

	public Person(String name, String telefon, String eMail, Wohnadresse wa) {
		this.name = name;
		this.telefon = telefon;
		this.eMail = eMail;
		this.wa = wa;
	}

	public Person(String name, String telefon, String eMail) {
		this.name = name;
		this.telefon = telefon;
		this.eMail = eMail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public Wohnadresse getWa() {
		return wa;
	}

	public void setWa(Wohnadresse wa) {
		this.wa = wa;
	}
	
	

}
