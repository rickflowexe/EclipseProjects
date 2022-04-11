import java.util.Scanner;

public class Kassenbon {

	public static void main(String[] args) {
		
		double wurst = 4.20;
		double kaese = 2.30;
		double brot = 2.10;
		double dvd = 12.00;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unser Angebot:\nWurst = 4.20 �\n"
				+ "K�se = 2.30 �\nBrot = 2.10 �\nDVD = 12.00 �");
		System.out.println("Wie viel Wurst m�chten Sie haben?");
			int anzahlWurst = sc.nextInt();
			System.out.println("Wie viel K�se m�chten Sie haben?");
			int anzahlKaese = sc.nextInt();
			System.out.println("Wie viel Brot m�chten Sie haben?");
			int anzahlBrot = sc.nextInt();
			System.out.println("Wie viele DVD's m�chten Sie haben?");
			int anzahlDvd = sc.nextInt();
			
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
			System.out.println("Wurst\t\t"+anzahlWurst+" x "
					+wurst+" EUR = "+preisWurst+" EUR");
			System.out.println("K�se\t\t"+anzahlKaese+" x "
					+kaese+" EUR = "+preisKaese+" EUR");
			System.out.println("Brot\t\t"+anzahlBrot+" x "
					+brot+" EUR = "+preisBrot+" EUR");
			System.out.println("DVD\t\t"+anzahlDvd+" x "
					+dvd+" EUR = "+preisDvd+" EUR");
			System.out.println("------------------------------------------");
			System.out.println("Gesamt\t\t\t\t"+gesamtPreis+" EUR");
			System.out.println("Gegeben\t\t\t\t"+geld+" EUR");
			System.out.println("Zur�ck\t\t\t\t"+zurueck+" EUR");
		}
		else {
			System.out.println("Es fehlen: "+zuwenig+" EUR.");
		}

		sc.close();
	}

}
