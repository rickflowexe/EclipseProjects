import java.util.ArrayList;

public class Rennen {
	String nameRennen;
	int anzahlTeilnehmenderSchnecken;
	double laengeRennStrecke;
	ArrayList<Rennschnecke> schneckenRennenArrayList = new ArrayList<Rennschnecke>();

	public void addRennschnecke(Rennschnecke neueSchnecke) {
				schneckenRennenArrayList.add(neueSchnecke);
	}
	
	public void removeRennschnecke(String name) {
		for(int i = 0; i < schneckenRennenArrayList.size(); i++) {
			if(name.equals(schneckenRennenArrayList.get(i).getName())) {
				schneckenRennenArrayList.remove(i);
			}
		}
	}
	
	public String toString() {
		String datenAllerRennschneckenAlsString = new String("\nName des Rennens: " +
	nameRennen + ", Anzahl der Teilnehmenden Schnecken: " +
				anzahlTeilnehmenderSchnecken + ", Länge der Rennstrecke: " +
	laengeRennStrecke);
		for(int i = 0; i < schneckenRennenArrayList.size(); i++) {
			datenAllerRennschneckenAlsString += new String(
					"\nName: " + schneckenRennenArrayList.get(i).getName() + ", Rasse: " +
			schneckenRennenArrayList.get(i).getRasse() + ", Maximale Geschwindigkeit: "
							+ schneckenRennenArrayList.get(i).getMaximalGeschwindigkeit() +
							", Zurückgelegte Strecke: " +
							schneckenRennenArrayList.get(i).zurueckGelegteStreckeSchnecke);
		}
		return datenAllerRennschneckenAlsString;
	}
	
	public Rennschnecke ermittleGewinner() {
		Rennschnecke siegerSchnecke = null;
		for(int i = 0; i < schneckenRennenArrayList.size(); i++) {
			if(schneckenRennenArrayList.get(i).getZurueckGelegteStrecke() > laengeRennStrecke) {
				siegerSchnecke = schneckenRennenArrayList.get(i);
			}
		}
		return siegerSchnecke;
	}
	
	public void lasseSchneckenKriechen() {
		for(int i = 0; i < schneckenRennenArrayList.size(); i++) {
			schneckenRennenArrayList.get(i).krieche();
		}
	}
	
	public void durchfuehren() {
		while(ermittleGewinner()==null) {
			lasseSchneckenKriechen();
		}
	}
	
	public Rennen() {
	}

	public Rennen(String nameRennen, int anzahlTeilnehmenderSchneckenAmRennen, 
			double laengeRennStrecke) {
		this.nameRennen = nameRennen;
		this.anzahlTeilnehmenderSchnecken = 
				anzahlTeilnehmenderSchneckenAmRennen;
		this.laengeRennStrecke = laengeRennStrecke;
	}

	public String getNameRennen() {
		return nameRennen;
	}

	public void setNameRennen(String nameRennen) {
		this.nameRennen = nameRennen;
	}

	public int getAnzahlTeilnehmenderSchneckenAmRennen() {
		return anzahlTeilnehmenderSchnecken;
	}

	public void setAnzahlTeilnehmenderSchneckenAmRennen(int 
			anzahlTeilnehmenderSchneckenAmRennen) {
		this.anzahlTeilnehmenderSchnecken = 
				anzahlTeilnehmenderSchneckenAmRennen;
	}

	public double getLaengeRennen() {
		return laengeRennStrecke;
	}

	public void setLaengeRennen(double laengeRennen) {
		this.laengeRennStrecke = laengeRennen;
	}

	public ArrayList<Rennschnecke> getSchneckenRennen() {
		return schneckenRennenArrayList;
	}

	public void setSchneckenRennen(ArrayList<Rennschnecke> schneckenRennen) {
		this.schneckenRennenArrayList = schneckenRennen;
	}

}
