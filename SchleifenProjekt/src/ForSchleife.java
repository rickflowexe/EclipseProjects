
public class ForSchleife {

	public static void main(String[] args) {
//		Schleifen:
//		- Anweisung/en so oft wie man es möchte wiederholt abarbeiten
//		- 2 Kategorien: kopf- und fußgesteuerte Schleifen
		
//		kopfgest. Schleife: Abbruchbedingung steht oben
//		also zuerst Prüfung, dann Code ausführen
//		fusgest. Schleife: Abbruchbedingung steht unten
//		also Code ausführen, dann Prüfung
//		Code IMMER mindestens 1x ausgeführt
		
//		For-Schleife zählt zu den kopfgesteuerten Schleifen
//		wird auch Zählschleife genannt
		
//		for(Zählvariable; Abbruchbedingung; Inkrement/Dekrement) {
//		Anweisung/en
//		}
		
//		Inkrement: Wert um 1 erhöhen a++ oder a = a + 1;
//		a++ Postinkrement, aber ++a Preinkrement
//		Dekrement: Wert um 1 verringern a-- oder a = a - 1;
//		a-- Postdekrement, aber --a Predekrement
		for(int a = 0; a < 5; a++) {
			System.out.println(a);
		}

	}

}
