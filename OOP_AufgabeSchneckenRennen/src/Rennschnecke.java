
public class Rennschnecke {
	String nameSchnecke, rasseSchnecke;
	double maximalGeschwindigkeitSchnecke, zurueckGelegteStreckeSchnecke;

	public void krieche() {
		zurueckGelegteStreckeSchnecke = maximalGeschwindigkeitSchnecke * Math.random();
	}

	public String toString() {
		String datenRennschneckeAlsString = new String(
				"Name: " + nameSchnecke + ", Rasse: " + rasseSchnecke
				+ ", Maximale Geschwindigkeit: " + maximalGeschwindigkeitSchnecke 
				+ ", Zurückgelegte Strecke: " + zurueckGelegteStreckeSchnecke);
		return datenRennschneckeAlsString;
	}

	public Rennschnecke() {
	}

	public Rennschnecke(String name, String rasse, int maximalGeschwindigkeit, 
			int zurueckGelegteStrecke) {
		this.nameSchnecke = name;
		this.rasseSchnecke = rasse;
		this.maximalGeschwindigkeitSchnecke = maximalGeschwindigkeit;
		this.zurueckGelegteStreckeSchnecke = zurueckGelegteStrecke;
	}

	public String getName() {
		return nameSchnecke;
	}

	public void setName(String name) {
		this.nameSchnecke = name;
	}

	public String getRasse() {
		return rasseSchnecke;
	}

	public void setRasse(String rasse) {
		this.rasseSchnecke = rasse;
	}

	public double getMaximalGeschwindigkeit() {
		return maximalGeschwindigkeitSchnecke;
	}

	public void setMaximalGeschwindigkeit(int maximalGeschwindigkeit) {
		this.maximalGeschwindigkeitSchnecke = maximalGeschwindigkeit;
	}

	public double getZurueckGelegteStrecke() {
		return zurueckGelegteStreckeSchnecke;
	}

	public void setZurueckGelegteStrecke(int zurueckGelegteStrecke) {
		this.zurueckGelegteStreckeSchnecke = zurueckGelegteStrecke;
	}

}
