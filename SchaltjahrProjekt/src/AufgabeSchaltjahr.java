import java.util.Scanner;

public class AufgabeSchaltjahr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte Jahreszahl eingeben: ");
		int jahr = sc.nextInt();		
		
		if(testSchaltjahr(jahr)) {
			System.out.println(jahr + " ist ein Schaltjahr");
		}
		else {
			System.out.println(jahr + " ist kein Schaltjahr");
		}
		main(null);
		sc.close();
	}
	

	public static boolean testSchaltjahr(int jahr) {
		
		return (jahr % 4 == 0 && jahr % 100 != 0 || jahr % 400 == 0);
		
		
	}

}
