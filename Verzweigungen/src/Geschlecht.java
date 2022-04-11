import java.util.Scanner;

public class Geschlecht {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte Namen eingeben:");
		String name = sc.next();
		
		System.out.println("Men�");
		System.out.println("----");
		System.out.println("(M)�nnlich");
		System.out.println("(W)eiblich");
		System.out.println("(D)ivers");
		System.out.println("Bitte ausw�hlen...");
		
		String menu = sc.next();
		
		switch(menu.toUpperCase()) {
		case "M":
			System.out.println("Herr " + name);
			break;
		case "W":
			System.out.println("Frau " + name);
			break;
		case "D":
			System.out.println(name);
			break;
		default:
			System.out.println("Eingabenfehler.");			
		}
		sc.close();
	}

}
