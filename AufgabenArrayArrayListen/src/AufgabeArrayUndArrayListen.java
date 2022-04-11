import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public class AufgabeArrayUndArrayListen {

	public static void main(String[] args) {
		
		// ##### Aufgabe 1 #####
		// Erstellen des Arrays
		String[] progSprArray = new String[10];
		// Füllen des Arrays
		progSprArray[0] = "Batch";
		progSprArray[1] = "C";
		progSprArray[2] = "C++";
		progSprArray[3] = "C#";
		progSprArray[4] = "Java";
		progSprArray[5] = "JavaScript";
		progSprArray[6] = "Joy";
		progSprArray[7] = "Python";
		progSprArray[8] = "UnrealScript";
		progSprArray[9] = "Web";
		// Ausgabe aller Werte des Arrays in einer Zeile +
		// Ausgabe der Länge des Arrays
		System.out.println(Arrays.toString(progSprArray));
		System.out.println("Größe des Arrays: " + progSprArray.length);
		
		// Erstellen der Liste
		ArrayList<String> progSprListe = new ArrayList<>();
		// Füllen der Liste
		progSprListe.add("Batch");
		progSprListe.add("C");
		progSprListe.add("C++");
		progSprListe.add("C#");
		progSprListe.add("Java");
		progSprListe.add("JavaScript");
		progSprListe.add("Joy");
		progSprListe.add("Python");
		progSprListe.add("UnrealScript");
		progSprListe.add("Web");
		// Ausgabe aller Werte der Liste in einer Zeile +
		// Ausgabe der Größe der Liste
		System.out.println(progSprListe.toString());
		System.out.println("Größe der Liste: " + progSprListe.size());
		// Leeren der gesamten Liste
		progSprListe.clear();
		/* ODER progSprListe.removeAll(progSprListe); ODER
		progSprListe.remove(0);
		progSprListe.remove(0); usw. */
		
		
		// ##### Aufgabe 2 #####
		// Erstellen des Arrays
		String[] ausbilder = new String[5];
		// Füllen des Arrays
		ausbilder[0] = "Assmus-Programmiertechnik-Java";
		ausbilder[1] = "Poguntke-Programmiertechnik-JavaScript";
		ausbilder[2] = "Klukkert-Web-Gestaltung";
		ausbilder[3] = "Deutsch-Datenbanken";
		ausbilder[4] = "Müller-Betriebsysteme";
		// Ausgabe der Werte 1 und 5 + Größe des Arrays
		System.out.println(ausbilder[0]);
		System.out.println(ausbilder[4]);
		System.out.println("Größe des Arrays: " + ausbilder.length);
		
		// Erstellen der Liste
		ArrayList<String> ausbilderListe = new ArrayList<>();
		// Füllen der Liste
		ausbilderListe.add("Assmus-Programmiertechnik-Java");
		ausbilderListe.add("Poguntke-Programmiertechnik-JavaScript");
		ausbilderListe.add("Klukkert-Web-Gestaltung");
		ausbilderListe.add("Deutsch-Datenbanken");
		ausbilderListe.add("Müller-Betriebsysteme");
		// Ausgabe der Werte 1 und 5 + Größe der Liste
		System.out.println(ausbilderListe.get(0));
		System.out.println(ausbilderListe.get(4));
		System.out.println("Größe der Liste: " + ausbilderListe.size());
		
		// ##### Aufgabe 3 #####
		// Erstellen des Arrays
		String[] stadt = new String[15];
		// Füllen des Arrays
		stadt[0] = "Berlin";
		stadt[1] = "Deutschland";
		stadt[2] = "Ja";
		stadt[3] = "3,7 Millionen";
		stadt[4] = "892.000.000 qm";
		
		stadt[5] = "Warschau";
		stadt[6] = "Polen";
		stadt[7] = "Ja";
		stadt[8] = "1,7 Millionen";
		stadt[9] = "517.240.000 qm";
		
		stadt[10] = "Tokio";
		stadt[11] = "Japan";
		stadt[12] = "ja";
		stadt[13] = "9,6 Millionen";
		stadt[14] = "628.000.000 qm";
		// Ausgabe der Liste
		System.out.println("Name der Stadt: " + stadt[0]);
		System.out.println("Land: " + stadt[1]);
		System.out.println("Hauptstadt: " + stadt[2]);
		System.out.println("Einwohnerzahl: " + stadt[3]);
		System.out.println("Fläche: " + stadt[4]);
		System.out.println("Name der Stadt: " + stadt[5]);
		System.out.println("Land: " + stadt[6]);
		System.out.println("Hauptstadt: " + stadt[7]);
		System.out.println("Einwohnerzahl: " + stadt[8]);
		System.out.println("Fläche: " + stadt[9]);
		System.out.println("Name der Stadt: " + stadt[10]);
		System.out.println("Land: " + stadt[11]);
		System.out.println("Hauptstadt: " + stadt[12]);
		System.out.println("Einwohnerzahl: " + stadt[13]);
		System.out.println("Fläche: " + stadt[14]);
		
		// ##### Aufgabe 4 #####
		// Erstellen Zufälliger Zahlen
		int rand1 = ThreadLocalRandom.current().nextInt(1, 49);
		int rand2 = ThreadLocalRandom.current().nextInt(1, 49);
		int rand3 = ThreadLocalRandom.current().nextInt(1, 49);
		int rand4 = ThreadLocalRandom.current().nextInt(1, 49);
		int rand5 = ThreadLocalRandom.current().nextInt(1, 49);
		int rand6 = ThreadLocalRandom.current().nextInt(1, 49);
		int rands = ThreadLocalRandom.current().nextInt(0, 9);
		
		// Erstellen des Arrays
		int[] lottozahlen = new int[6];
		int[] superzahl = new int[1];
		// Füllen des Arrays
		lottozahlen[0] = rand1;
		lottozahlen[1] = rand2;
		lottozahlen[2] = rand3;
		lottozahlen[3] = rand4;
		lottozahlen[4] = rand5;
		lottozahlen[5] = rand6;
		superzahl[0] = rands;
		// Sortieren des Arrays
		Arrays.sort(lottozahlen);
		// Ausgabe des Arrays
		System.out.println("Lottozahlen: " + Arrays.toString(lottozahlen));
		System.out.println("Superzahl: " + superzahl[0]);
		
		// Erstellen der Liste
		ArrayList<Integer> lottozahlen2 = new ArrayList<>();
		ArrayList<Integer> superzahl2 = new ArrayList<>();
		// Füllen der Liste
		lottozahlen2.add(rand1);
		lottozahlen2.add(rand2);
		lottozahlen2.add(rand3);
		lottozahlen2.add(rand4);
		lottozahlen2.add(rand5);
		lottozahlen2.add(rand6);
		superzahl2.add(rands);
		// Sortieren der Liste
		Collections.sort(lottozahlen2);
		// Ausgabe der Liste
		System.out.println("Lottozahlen: " + lottozahlen2.toString());
		System.out.println("Superzahl: " + superzahl2.get(0));

	}

}
