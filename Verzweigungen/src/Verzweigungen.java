import java.util.Scanner;

public class Verzweigungen {

	public static void main(String[] args) {
		
		// Name und Passwort aus der Datenbank simuliert
		String nameDB = "Phillip";
		String pwDB = "12345Phillip";
		int pinDB = 1221;
		
		// Datentyp der Bedingung/en = boolean
		// if(Bedingung/en) {
		// Anweisung/en;
		// }
		// else {
		// Anweisung/en;
		// }
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte Name eingeben: ");
		String name = sc.next();
		System.out.println("Bitte Passwort eingeben: ");
		String pw = sc.next();
		System.out.println("Bitte PIN eingeben: ");
		int pin = sc.nextInt();
		
		if(name.equals(nameDB) && pw.equals(pwDB) && pin == pinDB) {
			System.out.println("Login erfolgreich.");
		}
		else {
			System.out.println("Login fehlgeschlagen.");
		}
		
		// ###### google check #####		
		System.out.println("Bitte Name eingeben: ");
		String name1 =sc.next();
		if(name1.equals(nameDB)) {
			System.out.println("Bitte Passwort eingeben: ");
			String pw1 = sc.next();
			if(pw1.equals(pwDB)) {
				System.out.println("Bitte PIN eingeben: ");
				int pin1 = sc.nextInt();
				if(pin1 == pinDB) {
					System.out.println("Login erfolgreich.");
				}
				else {
					System.out.println("PIN falsch.");
				}
			}
			else {
				System.out.println("Passwort falsch.");
			}			
		}
		else {
			System.out.println("Benutzer falsch.");
		}
		
		// if (Bedingung/en) {
		// Anweisung/en;
		// }
		// else if (Bedingung/en){
		// Anweisung/en;
		// }
		// else if (Bedingung/en){
		// Anweisung/en;
		// }
		// else {
		// Anweisung/en;
		// }
		
		// Alter eingeben
		System.out.println("Bitte Alter eingeben: ");
		int alter = sc.nextInt();
		if(alter >= 0) {
			if(alter > 0 && alter <= 2) {
				System.out.println("Baby");
			}
			else if(alter > 2 && alter <= 6) {
				System.out.println("Kleinkind");
			}
			else if(alter > 6 && alter <= 12) {
				System.out.println("Orientierungsstufe");
			}
			else if(alter > 12 && alter <=18) {
				System.out.println("Teenager");
			}
			else if(alter > 18 && alter < 67) {
				System.out.println("Erwachsener");
			}
			else {
				System.out.println("Rentner");
			}
		}
		else {
			System.out.println("Negative Zahlen sind nicht erlaubt!");
		}
		sc.close();
	}

}
