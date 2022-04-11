import java.util.Scanner;

public class AufgabeMenue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println("Menu\n----\n(S)tart Game\n(H)ighscores\n"
				+"(M)ultiplayer\n(E)instellungen\n(�)ber das Game\nBitte ausw�hlen...");		
		Scanner sc = new Scanner(System.in);
		
		switch(sc.next().toLowerCase()) {
		case "s":
		// case "S":
			System.out.println("Start Game ausgew�hlt.");
			break;
		case "h":
			System.out.println("Highscores ausgew�hlt.");
			break;
		case "m":
			System.out.println("Multiplayer ausgew�hlt.");
			break;
		case "e":
			System.out.println("Einstellungen ausgew�hlt.");
			break;
		case "�":
			System.out.println("�ber das Game ausgew�hlt.");
			break;
		default:
			System.out.println("Falsche Eingabe.");
			
			sc.close();
		}
	}

}
