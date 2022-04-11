import java.util.Scanner;

public class Aufgabe_5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bitte 1. Zahl eingeben: ");
		double wert1 = scanner.nextDouble();
		
		System.out.println("Bitte 2. Zahl eingeben: ");
		double wert2 = scanner.nextDouble();
		
		System.out.println("Bitte 3. Zahl eingeben: ");
		double wert3 = scanner.nextDouble();
		
		
		double ergebnis = wert1 - wert2 - wert3;
		
		System.out.println
		(wert1 + " - " + wert2 + " - " + wert3 + " = " + ergebnis);
		//System.out.println(wert1 + " - " + wert2 + " - " + wert3 +
		//" = " + (wert1 - wert2 - wert3));

		scanner.close();
	}

}
