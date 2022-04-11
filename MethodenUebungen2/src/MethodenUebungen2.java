import java.util.Scanner;

public class MethodenUebungen2 {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Aufgabe Ohmsches Gesetz
		// Erstellen Sie ein Menü mit folgenden Menüpunkten:
		// 1. Widerstand berechnen
		// 2. Spannung berechnen 
		// 3. Strom berechnen
		// 0. Beenden
		
		// 1. Lagern Sie das Menü in die Methode showMenu() aus.
		// 2. Erstellen Sie für jeden Menüpunkt eine Methode, die den
		//    entsprechenen Wert berechnet und die Komplette Formel
		//    mit dem Ergebnis ausgibt.
		// 3. Erstellen Sie die Methode beenden(), die das Programm 
		//    beendet (google hilft)
				
		showMenu();		
		
	}
	static void showMenu() {
		System.out.println("-Menu-\n1. Widerstand berechnen\n2. Spannung berechnen\n"
				+ "3. Strom berechnen\n0. Beenden");
			
		switch(sc.next()) {
		case "1":
			System.out.println("Widerstand berechnen ausgewählt");
			widerstandBerechnen();
			System.out.println("Zum Menu? Drücke y");
			String menu = sc.next();
			if (menu == "y") {
				showMenu();
			}
			else {
				break;
			}			
		case "2":
			System.out.println("Spannung berechnen ausgewählt");
			spannungBerechnen();
			System.out.println("Zum Menu? Drücke y");
			menu = sc.next();
			if (menu == "y") {
				showMenu();
			}
			else {
				break;
			}
		case "3":
			System.out.println("Strom berechnen ausgewählt");
			stromstaerkeBerechnen();
			System.out.println("Zum Menu? Drücke y");
			menu = sc.next();
			if (menu == "y") {
				showMenu();
			}
			else {
				break;
			}
		case "0":
			System.out.println("Beenden ausgewählt");
			System.exit(0);
			break;
		default:
			System.out.println("Falsche Eingabe");
		}		
	}
	static void widerstandBerechnen() {
		System.out.println("Widerstand = Spannung / Stromstärke oder R = U / I");
		System.out.println("Bitte Spannung U eingeben");
		double u = sc.nextDouble();
		System.out.println("Bitte Stromstärke I eingeben");
		double i = sc.nextDouble();
		System.out.println("U: "+u+" + Stromstärke: "+i
				+" = Widerstand: " +u/i);
	}
	static void spannungBerechnen() {
		System.out.println("Spannung = Widerstand * Stromstärke oder U = R * I");
		System.out.println("Bitte Widerstand R eingeben");
		double r = sc.nextDouble();
		System.out.println("Bitte Stromstärke I eingeben");
		double i = sc.nextDouble();
		System.out.println("Widerstand: "+r+" + Stromstärke: "+i
				+" = Spannung: " +r/i);
	}
	static void stromstaerkeBerechnen() {
		System.out.println("Stromstärke = Spannung / Widerstand oder I = U / R");
		System.out.println("Bitte Spannung eingeben");
		double u = sc.nextDouble();
		System.out.println("Bitte Widerstand eingeben");
		double r = sc.nextDouble();
		System.out.println("Spannung: "+u+" + Widerstand "+r
				+" = Stromstärke: "+ u/r);
	}

}
