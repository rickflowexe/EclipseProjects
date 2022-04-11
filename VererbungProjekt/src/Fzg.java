
/**
 * Basisklasse, Oberklasse, Hauptklasse
 * 
 * @author lehrer
 *
 */
public class Fzg {
	
	private String farbe, hersteller, modell, fin;
	private int ps, anzSitzplaetze;
	private double verbrauch;
	private boolean istAngemeldet;
	private double preis;
	
	public Fzg() {
		
	}

	public Fzg(String farbe, String hersteller, String modell, String fin, int ps, int anzSitzplaetze, double verbrauch,
			boolean istAngemeldet, double preis) {
		// Aufruf des Konstuktors der Oberklasse, hier Klasse Object
		super();
		this.farbe = farbe;
		this.hersteller = hersteller;
		this.modell = modell;
		this.fin = fin;
		this.ps = ps;
		this.anzSitzplaetze = anzSitzplaetze;
		this.verbrauch = verbrauch;
		this.istAngemeldet = istAngemeldet;
		this.preis = preis;
	}
	
	public String getFarbe() {
		return farbe;
	}
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	public String getHersteller() {
		return hersteller;
	}
	public void setHersteller(String hersteller) {
		this.hersteller = hersteller;
	}
	public String getModell() {
		return modell;
	}
	public void setModell(String modell) {
		this.modell = modell;
	}
	public String getFin() {
		return fin;
	}
	public void setFin(String fin) {
		this.fin = fin;
	}
	public int getPs() {
		return ps;
	}
	public void setPs(int ps) {
		this.ps = ps;
	}
	public int getAnzSitzplaetze() {
		return anzSitzplaetze;
	}
	public void setAnzSitzplaetze(int anzSitzplaetze) {
		this.anzSitzplaetze = anzSitzplaetze;
	}
	public double getVerbrauch() {
		return verbrauch;
	}
	public void setVerbrauch(double verbrauch) {
		this.verbrauch = verbrauch;
	}
	
	public boolean isIstAngemeldet() {
		return istAngemeldet;
	}
	public void setIstAngemeldet(boolean istAngemeldet) {
		this.istAngemeldet = istAngemeldet;
	}
	public double getPreis() {
		return preis;
	}
	public void setPreis(double preis) {
		this.preis = preis;
	}
}
