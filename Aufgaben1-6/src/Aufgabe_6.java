import java.util.Scanner;

public class Aufgabe_6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bitte Strecke eingeben: ");
		double strecke = scanner.nextDouble();
		
		System.out.println("Bitte Zeit eingeben: ");
		double zeit = scanner.nextDouble();
		
		double ergebniss = strecke / zeit;
		
		System.out.println("Formel: " + "s / t = v =>"
				+ ""+ strecke + " m / " + zeit + " s = " + ergebniss + " m/s");
		//System.out.println("Formel: " + "s / t = v =>
		//"+ strecke + " m / " + zeit + " s = " + (strecke / zeit) + " m/s");
 
		scanner.close();
	}

}
