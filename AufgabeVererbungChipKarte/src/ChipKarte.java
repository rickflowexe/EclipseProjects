
public class ChipKarte {

	protected int eigentuemerNummer, status;

	public int getEigentuemerNummer() {
		return eigentuemerNummer;
	}

	public void setEigentuemerNummer(int nummer) {
		eigentuemerNummer = nummer;
	}

	public void statusAnzeigen() {
		System.out.println("Status: " + status);
	}
}
