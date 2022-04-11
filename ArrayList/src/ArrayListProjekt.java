import java.util.ArrayList;

public class ArrayListProjekt {

	public static void main(String[] args) {
		// Datentyp [] nameDesArrays = new Datentyp[Gr��e];
		
		// ArrayListen brauchen keine deste Gr��e
		
		// allg. Syntax
		// ArrayList<Datentyp> nameDerListe = new ArrayList<>();
		
		// Namen der Klassenkameraden (5) abspeichern
		
		ArrayList<String> namenListe = new ArrayList<>();
		
		// Liste f�llen
		// add() packt den Wert an die letzte Stelle der Liste
		namenListe.add("Assmus");
		namenListe.add("Bassmus");
		namenListe.add("Cassmus");
		
		// Packt einen Wert an den angegebenen Index
		namenListe.add(1, ":)");
		namenListe.add(":(");
		
		// Gr��e der Liste ausgeben
		System.out.println("Gr��e der Liste: " + namenListe.size());
		
		// Werte aus der Liste ausgeben
		System.out.println(namenListe.get(0));
		System.out.println(namenListe.get(3));
		System.out.println(namenListe.get(1));
		
		// L�schen eines Eintrags mit remove(Index)
		namenListe.remove(2);
		namenListe.remove(3);
		namenListe.remove(2);
		
		System.out.println("Gr��e der Liste: " + namenListe.size());
		
		// L�schen, wenn der Index nicht bekannt ist
		namenListe.remove("Assmus");
		
		System.out.println("Gr��e der Liste: " + namenListe.size());
		System.out.println(namenListe.get(0) + " | " + namenListe.get(0));
		
		// Erstellen Sie eine Liste mit den 5 Lieblingshobbys
		
		ArrayList<String> hobbysListe = new ArrayList<>();
		
		hobbysListe.add("Esk8");
		hobbysListe.add("Musik");
		hobbysListe.add("Programmieren");
		hobbysListe.add(1, "Spiele");
		hobbysListe.add(3, "Filme, Serien");
		
		System.out.println(hobbysListe.get(0));
		System.out.println(hobbysListe.toString());
		
		// Erstellen Sie eine Liste mit den 5 Lieblingsbr�chen
		ArrayList<Double> bruecheListe = new ArrayList<>();
		bruecheListe.add((double) 1/2);
		bruecheListe.add((double) 2/3);
		bruecheListe.add(0.75);
		bruecheListe.add(0.8);
		bruecheListe.add((double) 5/6);
		System.out.println(bruecheListe.toString());
		System.out.println(bruecheListe.get(1));
		
	}

}
