
public class VertretungsBlockWiederholungen {
	private int alter;

	public static void main(String[] args) {
		// Die Klasse String
		String name;
		name = "		Filipow		";
		String name2 = "filipow";
		
		System.out.println("Name: "+name);
		System.out.println("Länge des Namens: "+ name.length());
		System.out.println(name.toUpperCase());
		
		if(name.equals(name2)) {
			System.out.println("gleich");
		}
		else {
			System.out.println("ungleich");
		}
		if(name.contains("a")) {
			
		}
		// Löscht am Anfang und am Ende alle Leerzeichen
		name = name.trim();
		System.out.println("Länge des Namens: "+ name.length());
		
		System.out.println(name.substring(2,4));
		
		String[] x = name.split("l");
		System.out.println(x[0]);
		System.out.println(x[1]);
		
		String ort = new String("Berlin");
		
		System.out.println(ort.length());
		
		// Strings niemals mit == sondern mit name.equals(name2)
		if(name == name2) {
			
		}
		
		// Methodenaufruf
		abc(name, ort);
		
		int alter1 = 28;
		int alter2 = 27;
		
		if(alter1>alter2) {
			System.out.println(alter1+" > "+alter2);
		}
		else if(alter1 == alter2) {
			System.out.println();
		}
		else {
			// usw
		}
		// von vorne nach hinten
		for(int i=0; i<name.length();i++) {
			System.out.print(name.charAt(i));
		}
		System.out.println("");
		// von hinten nach vorne
		for(int i= name.length()-1; i>=0; i--) {
			System.out.print(name.charAt(i));
		}
		
	}
	// Methode erstellen
	public static void abc(String name, String ort) {
		System.out.println("abc: "+name+" "+ort);
	}
}
