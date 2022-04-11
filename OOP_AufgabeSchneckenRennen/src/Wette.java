
public class Wette {
	String schneckenName, spieler;
	int wettEinsatz;

	public Wette() {
	}

	public Wette(String schneckenName, String spieler, int wettEinsatz) {
		this.schneckenName = schneckenName;
		this.spieler = spieler;
		this.wettEinsatz = wettEinsatz;
	}

	public String getSchneckenName() {
		return schneckenName;
	}

	public void setSchneckenName(String schneckenName) {
		this.schneckenName = schneckenName;
	}

	public String getSpieler() {
		return spieler;
	}

	public void setSpieler(String spieler) {
		this.spieler = spieler;
	}

	public int getWettEinsatz() {
		return wettEinsatz;
	}

	public void setWettEinsatz(int wettEinsatz) {
		this.wettEinsatz = wettEinsatz;
	}

}
