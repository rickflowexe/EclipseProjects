import java.util.Scanner;

public class MethodenUebungen {

	public static void main(String[] args) {
//		1. Name eingeben und abspeichern
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte Nachname eingeben:");
		String nachname = sc.next();
//		2. Vorname eingeben und abspeichern
		System.out.println("Bitte Vornamen eingeben");
		String vorname = sc.next();
//		3. Methode mit dem Namen "ausgabeVornameNachname" erstellen,
//		der Name und Vorname �bergeben werden
//		und in der Methode als Vorname und Nachname ausgegeben werden

		ausgabeVornameNachname(nachname, vorname);
		sc.close();
	}

	static void ausgabeVornameNachname(String nachName, String vorName) {
		System.out.println(vorName + " " + nachName);
	}

}
