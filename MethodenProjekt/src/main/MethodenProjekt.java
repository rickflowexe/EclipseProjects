package main;

import tests.MethodenTests;

public class MethodenProjekt {

//	Wozu:
//	- Vermeiden von redundanten Code
//	- Klasse/Code wird �bersichtlicher/strukturierter
	

//	Ist die Einstiegsnethode in das Programm
	public static void main(String[] args) {
//		Methode aufrufen
//		allg Methodenname(Parameterliste);
		ausgabe();
		
	}

//	allg. Syntax bei der Methodendefinition (anlegen)
//	Zugriffsmodifizierer Datentyp NameDerMethode(Parameterliste) {
//	Anweisung(en)
//	}
	
//	Zugriffsmodifizierer: public, private, package
//	public: nach ausen sichtbar/aufrufbar, von �berall
//	private: nur innerhalb der Klasse sichbar/aufrufbar
//	package: nur innerhalb eines Packages(Verzeichnis)
	
//	Datentyp:
//	entweder void oder den Datentyp, den man braucht
//	wenn der Datentyp void ist, hat die Methode keinen R�ckgabewert
//	Bei allen anderen Datentypen MUSS die Methode am Ende den Datentyp
//	zur�ckgeben(mit einem return)
	
//	Name der Methode:
//	sinnvolle Namen vergeben
//	am Anfang IMMER klein
//	zusammengesetzte W�rter caseSensitiv
//	Bsp. getName()
	
//	Parameterliste der Methode steht in den runden Klammern
//	Parameterliste kann auch leer sein	
	
//	{ } wird auch Methodenbody genannt und in ihm steht der 
//	eigentliche Code der Methode
	
	static void ausgabe() {
		System.out.println("Huhu");
		aufrufMethodenTest();
	}
	String ausgabeZurueckGeben( ) {
		return "6";
	}
	
	static void aufrufMethodenTest ( ) {
		MethodenTests mt = new MethodenTests();
		mt.methodenTest();
		
	}
}
