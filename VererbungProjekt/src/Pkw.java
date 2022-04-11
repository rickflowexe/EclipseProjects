
/**
 * Unterklasse, Kindsklasse
 * 
 * @author lehrer
 *
 */
public class Pkw extends Fzg {


	public Pkw() {
		
	}
	
	public Pkw(String farbe, String hersteller, String modell, String fin, int ps, int anzSitzplaetze, double verbrauch,
			boolean istAngemeldet, double preis) {
		super(farbe, hersteller, modell, fin, ps, anzSitzplaetze, verbrauch, istAngemeldet, preis);
		// TODO Auto-generated constructor stub
	}

	private int anzAchsen;
	


	public int getAnzAchsen() {
		return anzAchsen;
	}

	public void setAnzAchsen(int anzAchsen) {
		this.anzAchsen = anzAchsen;
	}

}
