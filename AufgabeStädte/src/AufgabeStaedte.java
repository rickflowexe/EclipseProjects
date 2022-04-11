import java.util.Scanner;

public class AufgabeStaedte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nameStadt; 
		boolean istHauptstadt; 
		int anzahlEinwohner; 
		double steuernProEinwohner;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte Namen der Stadt eingeben: ");
		nameStadt = sc.next();
		System.out.println(nameStadt);		
	
		System.out.println("Bitte Einwohner Anzahl eingeben: ");
		anzahlEinwohner = sc.nextInt();
		System.out.println(anzahlEinwohner);
		
		System.out.println("Ist die Stadt eine Hauptstadt? true oder false");
		istHauptstadt = sc.nextBoolean();
		System.out.println(istHauptstadt);
		
		System.out.println("Bitte Steuern pro Einwohner pro Jahr eingeben: ");
		steuernProEinwohner = sc.nextDouble();
		System.out.println(steuernProEinwohner);
		
		
		if(istHauptstadt/* == true */&& anzahlEinwohner > 100000 ||
				anzahlEinwohner > 200000 && anzahlEinwohner*steuernProEinwohner > 1000000000) {
			System.out.println("Name der Stadt: " + nameStadt + "\n" +
					"Einwohner: " + anzahlEinwohner + "\n" +
					"Hauptstadt: " + "Ja\n" +
					"Steuern pro Einwohner im Jahr: " + steuernProEinwohner + "\n" +
					nameStadt + " ist eine Metropole");
		}
		else {
			System.out.println("Name der Stadt: " + nameStadt + "\n" +
					"Einwohner: " + anzahlEinwohner + "\n" +
					"Hauptstadt: " + "Nein\n" +
					"Steuern pro Einwohner im Jahr: " + steuernProEinwohner + "\n" +
					nameStadt + " ist keine Metropole");
		}
		sc.close();
	}

}
