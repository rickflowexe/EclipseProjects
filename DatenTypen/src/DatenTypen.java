
public class DatenTypen {
	/*	globale und lokale Variable
		globale Variable gilt in der ganzen Klasse
		lokale Variable gilt nur in einem lokalen Bereich
	*/
	//	globale Variable
	int globaleVariable = 999;
	
	
	public static void main(String[] args) {
		
			int lokaleVariable = 111; // nur in der Methode main (Zeile 12) verfügbar
		/*	Zahlen
			ganze Zahlen und gebrochene Zahlen (Gleitkommazahlen/Fließkommazahlen
		
			ganze Zahlen => int (Integer)
			gebr Zahlen => float oder double (double hat einen größeren Wertebereich
		
			Text / Zeichenketten (Zahlen, Buchstaben und Sonderzeichen ASCII- Tabelle
			=> String
			
			ein einziges Zeichen/Character
			=> char
			
			Wahrheitswerte wahr oder falsch
			=> boolean kann nur true oder false
			
			Variablen: Container/Behälter in dem man Werte speichern und bearbeiten kann
			
			allg. Syntax: Datentyp Variablenname;
			
			Deklaration => Bekanntgeben/Anlegen der Variable ohne einen Wert zuzuweisen
		*/	
		//	primitiver Datentyp
			int alter;
			double gehalt;
			float km;
			char c;
			boolean isMonday;
			
		//	KEIN primitiver Datentyp
			String name;
			
		//	Initialisierung => der Variable einen Wert zuweisen. Diese Zuweisung erfolgt
		//	mit dem Zuweisungsoperator = und IMMER von RECHTS nach LINKS;
			alter = 27;
			gehalt = 98765.43;
			km = 25.5f;		
			c = 'x';
			name = "Patryk Filipow";
			
		//	Konstanten: Schlüssel final und Name der Konstante KOMPLETT groß
			final double PI = 3.14159;
			final int ANZAHL_DER_WOCHENTAGE = 7;
			
			System.out.println("Filipow");
			System.out.println(name);
			System.out.println(gehalt);			
	}
}
