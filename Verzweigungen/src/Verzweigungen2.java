import java.util.Scanner;

public class Verzweigungen2 {

	public static void main(String[] args) {
				
		// switch case
		
		/* switch(Vergleichswert) {
			 * case ?:
			 * Anweisung/en;
			 * break;
			 * case ?:
			 * Anweisung/en;
			 * break;
			 * case ?:
			 * Anweisung/en;
			 * break;
			 * default:
			 * Anweisung/en;
		 * } */
		
		/* Menu
		 * -----
		 * (S)piel starten
		 * (H)ighscores
		 * (B)eenden
		 * Bitte ausw�hlen... */
		
		System.out.println("Men�\n----\n(S)piel starten\n(H)ighscores\n"
				+ "(B)eenden\nBitte ausw�hlen...");		
		Scanner sc = new Scanner(System.in);
		String menu = sc.next();
		
		// toUpperCase() wandelt alles in Gro�buchstaben um
		// toLowerCase() in Kleinbuchstaben.
		
		switch(menu.toUpperCase()) {
		case "S":
		//case "s":
			System.out.println("Spiel starten ausgew�hlt.");
			break;
		case "H":
		//case "h":
			System.out.println("Highscores ausgew�hlt.");
			break;
		case "B":
		// case "b":
			System.out.println("Beenden ausgew�hlt.");
			break;
		default:
			System.out.println("Falsche Eingabe.");
		}
		
		sc.close();
	}

}
