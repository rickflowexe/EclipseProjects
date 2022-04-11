
/**
 * Unterklasse, Kindsklasse
 * @author lehrer
 *
 */
public class Boot extends Fzg{


	private boolean hatAnker;
	
	public Boot() {
		
	}
	
	public Boot(String farbe, String hersteller, String modell, String fin, int ps, int anzSitzplaetze,
			double verbrauch, boolean istAngemeldet, double preis, boolean hatAnker) {
		super(farbe, hersteller, modell, fin, ps, anzSitzplaetze, verbrauch, istAngemeldet, preis);
		this.hatAnker = hatAnker;
	}

	public boolean isHatAnker() {
		return hatAnker;
	}

	public void setHatAnker(boolean hatAnker) {
		this.hatAnker = hatAnker;
	}
}
