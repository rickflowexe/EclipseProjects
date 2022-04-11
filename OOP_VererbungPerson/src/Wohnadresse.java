
public class Wohnadresse {

	private String strasse, stadt, plz, land;
	private boolean istBewohnt;

	public Wohnadresse(String strasse, String stadt, String plz, String land, boolean istBewohnt) {
		this.strasse = strasse;
		this.stadt = stadt;
		this.plz = plz;
		this.land = land;
		this.istBewohnt = istBewohnt;
	}
	
//	public void waBestaetigen() {
//		this.istBewohnt = true();
//	}
	
	public void waDrucken() {
		System.out.println("Strasse: "+strasse+"\nStadt: "+stadt
				+"\nPlz: "+plz+"\nLand: "+land+"\nIstBewohnt: "
				+istBewohnt);
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getStadt() {
		return stadt;
	}

	public void setStadt(String stadt) {
		this.stadt = stadt;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}

	public String getLand() {
		return land;
	}

	public void setLand(String land) {
		this.land = land;
	}
	
	public boolean getIstBewohnt() {
		return istBewohnt;
	}
	
	public void istBewohnt(boolean istBewohnt) {
		this.istBewohnt = istBewohnt;
	}

}
