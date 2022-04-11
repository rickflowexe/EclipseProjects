import java.util.Scanner;

public class Aufgabe_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte Name eingeben");
		String name = sc.next();
		System.out.println("Bitte Vorname eingeben");
		String vorname = sc.next();
		System.out.println("Bitte Wohnort eingeben");
		String wohnort = sc.next();
		System.out.println("Bitte Alter eingeben");
		int alter = sc.nextInt();
		System.out.println("Bitte Kontostand eingeben");
		double kontostand = sc.nextDouble();
		System.out.println("Bitte Geburtsdatum eingeben");
		String geburtsdatum = sc.next();
		sc.close();
		
		System.out.println("Name:		" + name);
		System.out.println("Vorname:	" + vorname);
		System.out.println("Wohnort:	" + wohnort);
		System.out.println("Alter:		" + alter);
		System.out.println("Kontostand:	" + kontostand);
		System.out.println("Geburtsdatum:	" + geburtsdatum);
		
	}

}
