import java.util.Scanner;

public class AufgabeQuersumme {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte Zahl eingeben: ");
		long zahl = sc.nextLong();
		
		System.out.println("Zahl: " + zahl);
		System.out.println("Quersumme: " + quersumme(zahl));	
		main(null);
		sc.close();
	}

	public static long quersumme(long zahl) {
		if (zahl <= 9) {
			return zahl;
		}
		return zahl%10 + quersumme(zahl/10);
	}
}
