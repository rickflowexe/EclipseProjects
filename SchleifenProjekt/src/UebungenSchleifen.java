import java.util.ArrayList;

public class UebungenSchleifen {

	public static void main(String[] args) {
		
//		Erstellen Sie ein Array mit den 5 Lieblingsausbildern
//		Geben Sie dieses Array mit allen 4 Schleifen folgendermaßen
//		aus:
//		1. Ausbilder: "Name des Ausbilders"
//		2. Ausbilder: "Name des Ausbilders"
//		3. Ausbilder: "Name des Ausbilders"
//		usw

//		Zusatz: Lösen Sie diese Aufgabe noch mit einer ArrayList
		
		String[] ausbilderArray = {"Poguntke", "Deutsch", "Klaiber",
				"Taegener", "Assmus"};
//		############################################################
		
		System.out.println("### for-Schleife-Array ###");
		
		for(int i = 0; i < ausbilderArray.length; i++) {
			System.out.println(i+1 + ". Ausbilder: " + ausbilderArray[i]);
		}
//		############################################################

		System.out.println("\n### for-each-Schleife-Array ###");
		
		int j = 1;
		for(String ausbilder : ausbilderArray) {
			System.out.println(j + ". Ausbilder: " + ausbilder);
			j++;
		}
//		############################################################

		System.out.println("\n### while-Schleife-Array ###");
		
		int k = 0;
		while(k < ausbilderArray.length) {
			System.out.println(k+1 + ". Ausbilder: " + ausbilderArray[k]);
			k++;
		}
//		############################################################

		System.out.println("\n### do-while-Schleife-Array ###");
		
		int l = 0;
		do {
			System.out.println(l+1 + ". Ausbilder: " + ausbilderArray[l]);
			l++;
		}while(l < ausbilderArray.length);
//		############################################################

		ArrayList<String> ausbilderListe = new ArrayList<>();
		ausbilderListe.add("Poguntke");
		ausbilderListe.add("Deutsch");
		ausbilderListe.add("Klaiber");
		ausbilderListe.add("Taegener");
		ausbilderListe.add("Assmus");
//		############################################################

		System.out.println("\n### for-Schleife-Liste ###");
		
		for(int m = 0; m < ausbilderListe.size(); m++) {
			System.out.println(m+1 + ". Ausbilder: " + ausbilderListe.get(m));
		}
//		############################################################

		System.out.println("\n### for-each-Schleife-Liste ###");
		
		int n = 0;
		for(String ausbilder : ausbilderListe) {
			System.out.println(n+1 + ". Ausbilder: " + ausbilderListe.get(n));
			n++;
		}
//		############################################################

		System.out.println("\n### while-Schleife-Liste ###");
		
		int o = 0;
		while(o < ausbilderListe.size()) {
			System.out.println(o+1 + ". Ausbilder: " + ausbilderListe.get(o));
			o++;
		}
//		############################################################

		System.out.println("\n### do-while-Schleife-Liste ###");
		
		int p = 0;
		do {
			System.out.println(p+1 + ". Ausbilder: " + ausbilderListe.get(p));
			p++;
		}while(p < ausbilderListe.size());

	}

}
