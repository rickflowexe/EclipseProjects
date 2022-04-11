
public class Fussballer extends Mensch{

	private String verein;
	private int trikotNr;

	public Fussballer(String verein, int trikotNr,String haarFarbe, String name, int alter) {
		super(haarFarbe, name, alter);
			this.verein = verein;
			this.trikotNr = trikotNr;
	}

	public String getVerein() {
		return verein;
	}

	public void setVerein(String verein) {
		this.verein = verein;
	}

	public int getTrikotNr() {
		return trikotNr;
	}

	public void setTrikotNr(int trikotNr) {
		this.trikotNr = trikotNr;
	}
	

}
