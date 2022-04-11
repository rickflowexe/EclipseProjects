import java.util.ArrayList;

public class Wettbuero {
double wettEinsatzMultiplikator;
Rennen rennName;
ArrayList<Wette> wettEinsaetzeArrayList = new ArrayList<Wette>();
Rennen rennen;

public Wette wetteAnnehmen(String schneckenName, int wettEinsatz, String spieler) {
	Wette wetten = new Wette(schneckenName, spieler, wettEinsatz);
	return wetten;
}
public void rennenDurchfuehren(String nameRennen, int anzahlTeilnehmenderSchnecken,
		double laengeRennStrecke) {
	rennen = new Rennen(nameRennen, anzahlTeilnehmenderSchnecken,
			laengeRennStrecke);
	rennen.durchfuehren();
}
public String toString() {
	String datenAllesToString = new String("Multiplikator: " + wettEinsatzMultiplikator
			+ ", Rennenname: " + rennName + ", Wetten: " + wettEinsaetzeArrayList + ", Rennen: "
			+ rennen.toString());
	return datenAllesToString;
}

public Wettbuero() {
}
public Wettbuero(double wettEinsatzMultiplikator, Rennen rennName) {
	this.wettEinsatzMultiplikator = wettEinsatzMultiplikator;
	this.rennName = rennName;
}
public double getWettEinsatzMultiplikator() {
	return wettEinsatzMultiplikator;
}
public void setWettEinsatzMultiplikator(double wettEinsatzMultiplikator) {
	this.wettEinsatzMultiplikator = wettEinsatzMultiplikator;
}
public Rennen getRennName() {
	return rennName;
}
public void setRennName(Rennen rennName) {
	this.rennName = rennName;
}
public ArrayList<Wette> getWettEinsaetzeArrayList() {
	return wettEinsaetzeArrayList;
}
public void setWettEinsaetzeArrayList(ArrayList<Wette> wettEinsaetzeArrayList) {
	this.wettEinsaetzeArrayList = wettEinsaetzeArrayList;
}

}
