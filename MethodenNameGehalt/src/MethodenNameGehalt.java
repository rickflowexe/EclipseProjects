
public class MethodenNameGehalt {

	public static void main(String[] args) {
		
		// Erstellen Sie jeweils eine Methode für den Namen des Mitarbeiters und das Gehalt
		// des Mitarbeiters die zurückgegeben werden.
		// Anschließend erstellen Sie eine Methode, die 
		// diese 2 Werte übergeben bekommt und ausgibt
		
		name();
		gehalt();
		ausgabe(name(), gehalt());
	}

	private static void ausgabe(String name, double gehalt) {
		System.out.println(name + ", Gehalt: " + gehalt + " Euro");
		
	}

	private static double gehalt() {
		return 2500.00;
		
	}

	private static String name() {
		return "Patryk Filipow";
		
	}

}
