import java.util.Scanner;

public class AufgabeMethodenOhmscheGesetz {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Aufgabe Ohmsches Gesetz
		// Erstellen Sie ein Men� mit folgenden Men�punkten:
		// 1. Widerstand berechnen
		// 2. Spannung berechnen
		// 3. Strom berechnen
		// 0. Beenden

		// 1. Lagern Sie das Men� in die Methode showMenu() aus.
		// 2. Erstellen Sie f�r jeden Men�punkt eine Methode, die den
		// entsprechenen Wert berechnet und die Komplette Formel
		// mit dem Ergebnis ausgibt.
		// 3. Erstellen Sie die Methode beenden(), die das Programm
		// beendet (google hilft)
		
		showMenu();
	}

	// Methodendefinition
	private static void showMenu() {
		System.out.println("Programm Ohmsches Gesetz");
		System.out.println("------------------------");
		System.out.println("1. Widerstand berechnen");
		System.out.println("2. Spannung berechnen");
		System.out.println("3. Strom berechnen");
		System.out.println("0. Beenden");
		System.out.println("Bitte w�hlen Sie aus.");
		
		String eingabe = sc.next();

		switch (eingabe) {
		case "1":
			berechneWiderstand();
			showMenu();
			break;
		case "2":
			berechneSpannung();
			showMenu();
			break;
		case "3":
			berechneStrom();
			showMenu();
			break;
		case "0":
			System.exit(0);
			break;
		default:
			System.out.println("falsche Eingabe");
			showMenu();
			
		}
	}

	private static void berechneStrom() {
		System.out.println("Strom berechnen");
		System.out.println("--------------------");
		System.out.println("Geben Sie die Widerstand in \u2126 ein:");
		double r = sc.nextDouble();
		System.out.println("Geben Sie die Spannung in V ein:");
		double u = sc.nextDouble();
		
		System.out.println(u + " V / " + r + " \u2126 = " + (u/r) + " A");
	}

	private static void berechneSpannung() {
		System.out.println("Spannung berechnen");
		System.out.println("--------------------");
		System.out.println("Geben Sie die Widerstand in \u2126 ein:");
		double r = sc.nextDouble();
		System.out.println("Geben Sie den Strom in A ein:");
		double i = sc.nextDouble();
		
		System.out.println(r + " \u03A9 * " + i + " A = " + (r*i) + " V");
		
		
	}

	private static void berechneWiderstand() {
		System.out.println("Widerstand berechnen");
		System.out.println("--------------------");
		System.out.println("Geben Sie die Spannung in V ein:");
		double u = sc.nextDouble();
		System.out.println("Geben Sie den Strom in A ein:");
		double i = sc.nextDouble();
		
		System.out.println(u + " V / " + i + " A = " + (u/i) + " \u2126;");
		
	}
}
