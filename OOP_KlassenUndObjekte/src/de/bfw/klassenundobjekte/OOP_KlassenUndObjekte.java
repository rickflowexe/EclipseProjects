package de.bfw.klassenundobjekte;

public class OOP_KlassenUndObjekte {

	public static void main(String[] args) {
//		Objekt Haus erstellen
//		Datentyp Objektname = new Datentyp();
//		Haus() ist der Default/Standard Konstruktor
		Auto auto = new Auto();
		Monitor monitor = new Monitor();
		User user = new User();
		Haus bungalow = new Haus();
		bungalow.setAnzFenster(8);

		user.setPremium(true);

//		Aufruf des erweiterten Konstruktors
		Haus haus = new Haus(123, "Seestr");
		haus.setAbgeschlossen(true);

		monitor.setHdr(true);
		auto.setTempoMax(123);
		auto.setTempoMax(111);
		bungalow.setAnzFenster(10);
		System.out.println(auto.getTempoMax());

		Baum baum = new Baum();
		baum.setName("Birke");
		System.out.println(baum.getName());

		Baum buche = new Baum(true, 30, 5, 2010, "Buche");
		System.out.println(buche.getName());
		System.out.println(buche.getGepflanztImJahre());
		
//		Aufgabe: Erstellen Sie eine Klasse Teilnehmer mit 3 Eigenschaften Setter und Getter

	}

}
