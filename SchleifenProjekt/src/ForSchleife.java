
public class ForSchleife {

	public static void main(String[] args) {
//		Schleifen:
//		- Anweisung/en so oft wie man es m�chte wiederholt abarbeiten
//		- 2 Kategorien: kopf- und fu�gesteuerte Schleifen
		
//		kopfgest. Schleife: Abbruchbedingung steht oben
//		also zuerst Pr�fung, dann Code ausf�hren
//		fusgest. Schleife: Abbruchbedingung steht unten
//		also Code ausf�hren, dann Pr�fung
//		Code IMMER mindestens 1x ausgef�hrt
		
//		For-Schleife z�hlt zu den kopfgesteuerten Schleifen
//		wird auch Z�hlschleife genannt
		
//		for(Z�hlvariable; Abbruchbedingung; Inkrement/Dekrement) {
//		Anweisung/en
//		}
		
//		Inkrement: Wert um 1 erh�hen a++ oder a = a + 1;
//		a++ Postinkrement, aber ++a Preinkrement
//		Dekrement: Wert um 1 verringern a-- oder a = a - 1;
//		a-- Postdekrement, aber --a Predekrement
		for(int a = 0; a < 5; a++) {
			System.out.println(a);
		}

	}

}
