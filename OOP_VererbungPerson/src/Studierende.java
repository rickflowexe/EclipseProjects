
public class Studierende extends Person {

	private String modul;
	private int matrikelNr;
	private double dNote;
	
	public Studierende(String name, String telefon, String eMail, Wohnadresse wa, String modul, int matrikelNr, double dNote) {
		super(name, telefon, eMail, wa);
		this.modul = modul;
		this.matrikelNr = matrikelNr;
		this.dNote = dNote;
	}

	public String getModul() {
		return modul;
	}

	public void setModul(String modul) {
		this.modul = modul;
	}

	public int getMatrikelNr() {
		return matrikelNr;
	}

	public void setMatrikelNr(int matrikelNr) {
		this.matrikelNr = matrikelNr;
	}

	public double getdNote() {
		return dNote;
	}

	public void setdNote(double dNote) {
		this.dNote = dNote;
	}

}
