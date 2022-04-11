
public class ProfessorInnen extends Person{

	private double lohn;
	
	public ProfessorInnen(String name, String telefon, String eMail, Wohnadresse wa, double lohn) {
		super(name, telefon, eMail, wa);
		this.lohn = lohn;
	}

	public double getLohn() {
		return lohn;
	}

	public void setLohn(double lohn) {
		this.lohn = lohn;
	}

}
