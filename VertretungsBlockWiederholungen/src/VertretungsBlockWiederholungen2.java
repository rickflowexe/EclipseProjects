
public class VertretungsBlockWiederholungen2 {

	public static void main(String[] args) {
		// Schleifen
		/* unterteilt in: kopf- und fußgesteuerte Schleifen
		 * kopgest: erst Abbruchbedingung prüft und dann den Code ausführt
		 * for-Schleife, for-each-Schleife, while-Schleife
		 * fußgesteuert: erst Code ausführt und dann Überprüfung der Abbruchbedingung
		 * somit: fußgesteuerte Schleife läuft min. 1 mal durch
		 * do-while-Schleife
		 * 
		 * Speichern Sie min. 5 Farbe in ein Array und geben Sie diese  mit der
		 * for-each-Schleife der Reihenfolge nach mit Ordnungszahl aus.
		 */
		
		String[] farbenArray = {"Rot","Gelb","Orange","Blau","Grün"};
		System.out.println("For-each-Schleife");
		int i = 1;
		for(String farbe : farbenArray) {
			System.out.println(i+". "+farbe);
			i++;
		}
		
		System.out.println("For-Schleife");
		for(i = 0; i < farbenArray.length; i++) {
			System.out.println(i+1+". "+farbenArray[i]);
		}
		
		System.out.println("While-Schleife");
		i = 0;
		while(i < farbenArray.length) {
			System.out.println(i+1+". "+farbenArray[i]);
			i++;
		}
		
		System.out.println("Do-while-Schleife");
		i =0;
		do {
			System.out.println(i+1+". "+farbenArray[i]);
			i++;
		}
		while(i < farbenArray.length);

	}

}
