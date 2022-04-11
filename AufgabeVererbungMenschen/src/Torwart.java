
public class Torwart extends Fussballer{

	private int gehalteneBaelle;

	public Torwart(String verein, int trikotNr, String haarFarbe, String name, int alter, int gehalteneBaelle) {
		super(verein, trikotNr, haarFarbe, name, alter);
		this.gehalteneBaelle = gehalteneBaelle;
	}

	public int getGehalteneBaelle() {
		return gehalteneBaelle;
	}

	public void setGehalteneBaelle(int gehalteneBaelle) {
		this.gehalteneBaelle = gehalteneBaelle;
	}



	

}
