
public class Motorrad extends Fzg {

	private boolean hatSattelTasche, hatScheibenSchloss;
	
	public Motorrad() {
		
	}

	public Motorrad(String farbe, String hersteller, String modell, String fin, int ps, int anzSitzplaetze,
			double verbrauch, boolean istAngemeldet, double preis, boolean hatSattelTasche, boolean hatScheibenSchloss) {
		super(farbe, hersteller, modell, fin, ps, anzSitzplaetze, verbrauch, istAngemeldet, preis);
		this.hatSattelTasche = hatSattelTasche;
		this.hatScheibenSchloss = hatScheibenSchloss;
	}

	public boolean isHatSattelTasche() {
		return hatSattelTasche;
	}

	public void setHatSattelTasche(boolean hatSattelTasche) {
		this.hatSattelTasche = hatSattelTasche;
	}

	public boolean isHatScheibenSchloss() {
		return hatScheibenSchloss;
	}

	public void setHatScheibenSchloss(boolean hatScheibenSchloss) {
		this.hatScheibenSchloss = hatScheibenSchloss;
	}
	
	
}
