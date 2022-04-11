import java.util.Scanner;

public class Kassenbonswitch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double wurst = 4.20;
		double kaese = 2.30;
		double brot = 2.10;
		double dvd = 12.00;
		int anzahlWurst = 0;
		int anzahlKaese = 0;
		int anzahlBrot = 0;
		int anzahlDvd = 0;
		
				
		System.out.println("Unser Angebot:\n(W)urst = 4.20 �\n"
				+ "(K)�se = 2.30 �\n(B)rot = 2.10 �\n(D)VD = 12.00 �");
		String einkauf = sc.next();
		switch(einkauf.toUpperCase()) {
		case"W":
		System.out.println("Wie viel Wurst m�chten Sie haben?");
			anzahlWurst = sc.nextInt();
			break;
		case"K":
			System.out.println("Wie viel K�se m�chten Sie haben?");
			anzahlKaese = sc.nextInt();
			break;
		case"B":
			System.out.println("Wie viel Brot m�chten Sie haben?");
			anzahlBrot = sc.nextInt();
			break;
		case"D":
			System.out.println("Wie viele DVD's m�chten Sie haben?");
			anzahlDvd = sc.nextInt();
			break;
		default:
			System.out.println("Fehler. Bitte neu laden.");
		}
		double preisWurst = wurst*anzahlWurst;
		double preisKaese = kaese*anzahlKaese;
		double preisBrot = brot*anzahlBrot;
		double preisDvd = dvd*anzahlDvd;
		double gesamtPreis = preisWurst+preisKaese+preisBrot+preisDvd;
		

		

		System.out.println("Ihr Einkauf kostet: " + gesamtPreis + " �");
		System.out.println("Wie viel Geld haben Sie?");
		double geld = sc.nextDouble();
		double zurueck = geld-gesamtPreis;
		double zuwenig = gesamtPreis-geld;
		
		if(geld > gesamtPreis) {
			System.out.println("Wurst\t"+anzahlWurst+"\tx\t"
					+wurst+" EUR = "+preisWurst+" EUR");
			System.out.println("K�se\t"+anzahlKaese+"\tx\t"
					+kaese+" EUR = "+preisKaese+" EUR");
			System.out.println("Brot\t"+anzahlBrot+"\tx\t"
					+brot+" EUR = "+preisBrot+" EUR");
			System.out.println("DVD\t"+anzahlDvd+"\tx\t"
					+dvd+" EUR = "+preisDvd+" EUR");
			System.out.println("------------------------------------------");
			System.out.println("Gesamt\t\t"+gesamtPreis+" EUR");
			System.out.println("Gegeben\t\t"+geld+" EUR");
			System.out.println("Zur�ck\t\t"+zurueck+" EUR");
		}
		else {
			System.out.println("Es fehlen: "+zuwenig+" EUR.");
		}

		sc.close();
	}

}
