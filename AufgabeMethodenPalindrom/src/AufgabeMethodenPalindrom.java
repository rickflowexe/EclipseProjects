import java.util.Scanner;

/**
 * Das ist ein Java-Doc Kommentar
 * @author PatrykFilipow
 *
 */

public class AufgabeMethodenPalindrom {
	
	
	public static Scanner sc = new Scanner(System.in);
	
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		
		umdrehen();		
	}
	private static void umdrehen() {
		String eingabe, rueck = "";
		
		System.out.println("Bitte gib ein Wort oder eine Zahl ein \num zu überprüfen ob"
				+" es sich um ein Palindrom handelt oder nicht");
		eingabe = sc.nextLine();
		
		int lenght = eingabe.length();
		
		for (int i = lenght - 1; i >= 0; i--) {
			rueck = rueck + eingabe.charAt(i);
		}
		System.out.println(eingabe+" / "+rueck);
		// ermittelte Werte werden übergeben
		palindrom(eingabe, rueck);
		
	}
	// Werte müssen mit Datentyp angegeben werden
	static void palindrom(String eingabe, String rueck) {
	
	if (eingabe.toLowerCase().equals(rueck.toLowerCase())) {				
			System.out.println("Deine Eingabe ist ein Palindrom "+eingabe+" / "+rueck);
		}
		else {
			System.out.println("Deine Eingabe ist kein Palindrom "+eingabe+" / "+rueck);
		}
	}

}
