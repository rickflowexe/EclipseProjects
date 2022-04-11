package de.bfw.klassenundobjekte;

public class Baum {
	boolean isLaubBaum;
	double hoehe, durchmesser;
	int gepflanztImJahre;
	String name = "???";

	public Baum() {

	}

//	eigener Konstruktor mit allen Parametern
	public Baum(boolean isLaubBaum, double hoehe, double durchmesser, int gepflanztImJahre, String name) {
		this.isLaubBaum = isLaubBaum;
		this.hoehe = hoehe;
		this.durchmesser = durchmesser;
		this.gepflanztImJahre = gepflanztImJahre;
		this.name = name;
	}

//	eigener Konstruktor mit 2 Parametern
	public Baum(double hoehe, String name) {
		this.hoehe = hoehe;
		this.name = name;
	}

	public Baum(String name, double hoehe) {
		this.hoehe = hoehe;
		this.name = name;
	}

	public Baum(double hoehe) {
		this.hoehe = hoehe;
	}

	public Baum(String name) {
		this.name = name;
	}

	public boolean isLaubbaum() {
		return isLaubBaum;
	}

	public void setLaubbaum(boolean isLaubBaum) {
		this.isLaubBaum = isLaubBaum;
	}

	public double getHoehe() {
		return hoehe;
	}

	public void setHoehe(double hoehe) {
		this.hoehe = hoehe;
	}

	public double getDurchmesser() {
		return durchmesser;
	}

	public void setDurchmesser(double durchmesser) {
		this.durchmesser = durchmesser;
	}

	public int getGepflanztImJahre() {
		return gepflanztImJahre;
	}

	public void setGepflanztImJahre(int gepflanztImJahre) {
		this.gepflanztImJahre = gepflanztImJahre;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() > 0) {
			this.name = name;
		} else {
			this.name = "???";
		}
	}

}
