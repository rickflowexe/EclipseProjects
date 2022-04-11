import java.util.Arrays;

public class ArrayProject {

	public static void main(String[] args) {
		// Array (Feld)
		
		/* Ist ein Kontainer/Beh�ter/Datenstruktur in dem man
		 * mehrere Werte des gleichen Datentyps abspeichern kann. */
		
		// allg. Syntax
		// Datentyp[] nameDesArrays = new Datentyp[groesseDesArrays];
		
		// Alter aller Teilnehmer der Klasse
		
		int[] alterItmo2101 = new int[16];
		
		// Wert in den 1. Index schreiben
		// F�llen eines Arrays
		alterItmo2101[0] = 21;
		alterItmo2101[1] = 34;
		alterItmo2101[2] = 28;
		alterItmo2101[3] = 33;
		alterItmo2101[4] = 31;
		alterItmo2101[5] = 29;
		alterItmo2101[6] = 25;
		alterItmo2101[7] = 20;
		alterItmo2101[8] = 21;
		alterItmo2101[9] = 34;
		alterItmo2101[10] = 43;
		alterItmo2101[11] = 46;
		alterItmo2101[12] = 40;
		alterItmo2101[13] = 29;
		alterItmo2101[14] = 26;
		alterItmo2101[15] = 23;
		// Ausserhalb des Indexbereichs => ArrayIndexOutofBoundsException
		// alterItmo2101[16] = 19;
		
		// Wert aus dem Array lesen
		
		System.out.println(alterItmo2101[0]);
		System.out.println(alterItmo2101[1]);
		System.out.println(alterItmo2101[2]);
		
		// Alle Werte nacheinander auslesen
		System.out.println(Arrays.toString(alterItmo2101));
		
		/* �bung!!!
		 * Legen Sie sich ein Array an,
		 * wo alle Geh�lter der 5 Mitarbeiter abgespeichert werden
		 * F�llen Sie das Array mit beliebigen Werten und geben 
		 * es anschliessend aus.
		 * 
		 * String Array f�r die Namen der Klassenkameraden (10)
		 * Ebenfalls mit Werten f�llen und ausgeben */
		
		double[] gehaelterMitarbeiter = new double[5];
		
		gehaelterMitarbeiter[0] = 96543.21;
		gehaelterMitarbeiter[1] = 45454.54;
		gehaelterMitarbeiter[2] = 42211.21;
		gehaelterMitarbeiter[3] = 50000.01;
		gehaelterMitarbeiter[4] = 99999.99;
		
		System.out.println(gehaelterMitarbeiter[0]);
		System.out.println(gehaelterMitarbeiter[1]);
		System.out.println(gehaelterMitarbeiter[2]);
		System.out.println(gehaelterMitarbeiter[3]);
		System.out.println(gehaelterMitarbeiter[4]);
		
		String[] namenItmo2101 = new String[10];
		
		namenItmo2101[0] = "Daniel Sternhagen";
		namenItmo2101[1] = "Michelle Bartels";
		namenItmo2101[2] = "Conrad Reukauf";
		namenItmo2101[3] = "Christian Vogt";
		namenItmo2101[4] = "Michael Friedrich";
		namenItmo2101[5] = "Daniel Guenzel";
		namenItmo2101[6] = "Hermann Krenkel";
		namenItmo2101[7] = "Kolja Zwierzynski";
		namenItmo2101[8] = "Dennis Schulz";
		namenItmo2101[9] = "Patryk Filipow";
		
		System.out.println(namenItmo2101[0]);
		System.out.println(namenItmo2101[1]);
		System.out.println(namenItmo2101[2]);
		System.out.println(namenItmo2101[3]);
		System.out.println(namenItmo2101[4]);
		System.out.println(namenItmo2101[5]);
		System.out.println(namenItmo2101[6]);
		System.out.println(namenItmo2101[7]);
		System.out.println(namenItmo2101[8]);
		System.out.println(namenItmo2101[9]);
		
		// Die km speichern, die Sie jeden Tag gelaufen sind (7 Tage)
		// Werte speichern und anschlie�end ausgeben
		
		
		float[] kmWoche = new float[7];
		
		System.out.println("Gr��e des Arrays: " + kmWoche.length);
		
		kmWoche[0] = 14.3f;
		kmWoche[1] = 11.4f;
		kmWoche[2] = 12.5f;
		kmWoche[3] = 16.6f;
		kmWoche[4] = 19.7f;
		kmWoche[5] = 22.8f;
		kmWoche[6] = 18.9f;
		
		System.out.println(kmWoche[0]);		
		System.out.println(Arrays.toString(kmWoche));
		
		// Wochentage speichern und anschlie�end ausgeben
		
		String[] wochentage = new String[7];
		
		wochentage[0] = "Montag";
		wochentage[1] = "Dienstag";
		wochentage[2] = "Mittwoch";
		wochentage[3] = "Donnerstag";
		wochentage[4] = "Freitag";
		wochentage[5] = "Samstag";
		wochentage[6] = "Sonntag";
		
		System.out.println(wochentage[3]);
		System.out.println(Arrays.toString(wochentage));
	}

}
