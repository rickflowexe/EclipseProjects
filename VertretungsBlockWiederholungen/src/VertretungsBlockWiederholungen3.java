
public class VertretungsBlockWiederholungen3 {

	public static void main(String[] args) {
		// Methoden
		// Warum? :
		// Code wird dadurch übersichtlicher
		// Code auslagern, somit nur einmal schreiben und da,
		// wo es gebraucht wird, einfach aufrufen
		// Bsp: Menü anzeigen
		
		// Methodenaufruf: Name der Methode inkl Parameterliste
		showMenu("Patryk Filipow");
		double ergebnisSumme = summe(3, 3.777);
		summe2(ergebnisSumme, 4.9, 5.8, 6, 5);
		System.out.println("Das Ergebnis ist " + ergebnisSumme);

	}

	
	private static double summe2(double ergebnisSumme, double i, double j, int k, int l) {
		// TODO Auto-generated method stub
		return ergebnisSumme + i + j + k + l;
		
	}


	// 1. Methodendefinition
	//  Zugriffsmodifizierer (public, private)
	// Datentyp der Methode (void = kein Rückgabewert, ansonsten
	// MUSS der Datenty zurückgegeben werden (mit return am Ende)
	// Namen der Methode
	// Parameterliste (befindet sich in den runden Klammern)
	
	private static void showMenu(String name) {
		System.out.println("Hauptmenu" + name);
		System.out.println("#########");
		System.out.println("Teilnehmer hinzufügen");
		System.out.println("Teilnehmer bearbeiten");
		System.out.println("Teilnehmer löschen");
		System.out.println("Beenden");
	}
	
	private static double summe(double a, double b) {
		return a + b;
	}
}
