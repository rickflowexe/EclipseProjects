package main;

import tests.MethodenTests;

public class MethodenProjekt {

	// Wozu: 
	// - Vermeiden von redundanten Code
	// - Klasse/Code wird dadurch übersichtlicher/strukturierter
		
	// Ist die Einstiegsmethode in das Programm
	public static void main(String[] args) {
		// Methode aufrufen
		// allg Methodenname(Paramerliste);
		// Methodenaufruf in Form des Methodennahmen und der
		// Parameterliste
		ausgabe();
	}

	// allg Syntax bei der Methodendefinition (anlegen)
	// Zugriffsmodifizierer Datentyp NameDerMethode(Parameterliste) {
		// Anweisung(en)
	// }
	
	// Zugriffsmodifizierer: public, private, package
	// public: nach aussen sichtbar/aufrufbar, von überall
	// private: nur innerhalb der Klasse sichtbar/aufrufbar
	// package: nur innerhalb eines Packages(Verzeichnis)
	
	// Datentyp:
	// entweder void oder den Datentyp, den man braucht
	// wenn der Datentyp void ist, hat die Methode keinen Rückgabewert
	// Bei allen anderen Datentypen MUSS die Methode am Ende den Datentyp
	// zurückgeben(mit einem return)
	
	// Name der Methode:
	// sinnvolle Namen vergeben
	// am Anfang IMMER klein
	// zusammengesetzte Wörter caseSensitiv
	// Bsp getName()
	
	// Parameterliste der Methode steht in den runden Klammern
	// Parameterliste kann auch leer sein
	
	// { } wird auch Methodenbody genannt und in ihm steht der 
	// eigentliche Code der Methode
	
	// Methodendefinition
	// Anlegen der Methode und festlegen, was die Methode machen soll
	static void ausgabe() {
		System.out.println("Huhu");
		aufrufMethodenTest();
	}
	
	String ausgabeZurueckGeben() {
		return "7";
	}
	
	static void aufrufMethodenTest( ) {
		MethodenTests mt = new MethodenTests();
		mt.methodenTest();
		
	}
}
