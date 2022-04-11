import java.util.Scanner;

public class ScannerProject {

	public static void main(String[] args) {
		// Werte aus der Konsole einlesen und speichern
		
		// 1. Scanner
		Scanner scanner = new Scanner(System.in);
		
		// Bei Eingabe mehrerer W�rter nextLine() statt next()
		System.out.println("Bitte Name eingeben: ");
		String name = scanner.nextLine();
		
		System.out.println("Bitte das Alter eingeben: ");
		int alter = scanner.nextInt();
		
		System.out.println("Test: " + name);
		System.out.println("Test: " + alter);
		scanner.close();
	}

}
