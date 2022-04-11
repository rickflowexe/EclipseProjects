
public class Stuermer extends Fussballer {

	private int anzahlTorschuetzenKoenig;

	public Stuermer(String verein, int trikotNr, String haarFarbe, String name, int alter,
			int anzahlTorschuetzenKoenig) {
		super(verein, trikotNr, haarFarbe, name, alter);
		this.anzahlTorschuetzenKoenig = anzahlTorschuetzenKoenig;
	}

	public int getAnzahlTorschuetzenKoenig() {
		return anzahlTorschuetzenKoenig;
	}

	public void setAnzahlTorschuetzenKoenig(int anzahlTorschuetzenKoenig) {
		this.anzahlTorschuetzenKoenig = anzahlTorschuetzenKoenig;
	}

}
