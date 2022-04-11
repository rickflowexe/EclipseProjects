
/**
 * Unterklasse, Kindsklasse
 * @author lehrer
 *
 */
public class Lkw extends Fzg {
	
	private int anzAchsen;
	private String kabinenForm;
	
	public Lkw() {
		
	}
	
	public Lkw(String farbe, String hersteller, String modell, String fin, int ps, int anzSitzplaetze, double verbrauch,
			boolean istAngemeldet, double preis, int anzAchsen, String kabinenForm) {
		super(farbe, hersteller, modell, fin, ps, anzSitzplaetze, verbrauch, istAngemeldet, preis);
		this.anzAchsen = anzAchsen;
		this.kabinenForm = kabinenForm;
	}
	
	public int getAnzAchsen() {
		return anzAchsen;
	}

	public void setAnzAchsen(int anzAchsen) {
		this.anzAchsen = anzAchsen;
	}

	public String getKabinenForm() {
		return kabinenForm;
	}

	public void setKabinenForm(String kabinenForm) {
		this.kabinenForm = kabinenForm;
	}
	
	
}
