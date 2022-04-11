package de.bfw.klassenundobjekte;

public class Haus {
	
	private String Strasse;
	private double flaeche;
	private int anzFenster;
	private boolean isAbgeschlossen, isWithGarden;
//	TODO hier gehts weiter mit Kommentaren
//	inkl JAVA-Doc
	public Haus() {
		
	}
	public Haus(double flaeche, String strasse) {
		this.flaeche = flaeche;
		this.Strasse = strasse;
	}
	
	public String getStrasse() {
		return Strasse;
	}
	public void setStrasse(String strasse) {
		Strasse = strasse;
	}
	public double getFlaeche() {
		return flaeche;
	}
	public void setFlaeche(double flaeche) {
		this.flaeche = flaeche;
	}
	public int getAnzFenster() {
		return anzFenster;
	}
	public void setAnzFenster(int anzFenster) {
		this.anzFenster = anzFenster;
	}
	public boolean isAbgeschlossen() {
		return isAbgeschlossen;
	}
	public void setAbgeschlossen(boolean isAbgeschlossen) {
		this.isAbgeschlossen = isAbgeschlossen;
	}
	public boolean isWithGarden() {
		return isWithGarden;
	}
	public void setWithGarden(boolean isWithGarden) {
		this.isWithGarden = isWithGarden;
	}
	
	
}
