import java.util.Random;
import java.util.Scanner;

public class AufgabeJavaQuiz {

	static Scanner sc = new Scanner(System.in);
	static Random random = new Random();
	static int[] rF = new int[6];
	static int i = 0;
	
	public static void main(String[] args) {
		
		
		
		int punkte = 0;
//		int rnumber = 1;
		
		
		
		System.out.println("Hauptmenü\n########\n(S) Start\n(Q) Quiz beenden");
		
		switch(sc.next().toUpperCase()) {
		case "S":
			System.out.println("Starten ausgewählt.");
			rfrage(punkte);
		case "Q":
			System.out.println("Quiz beenden ausgewählt.");
			break;
			default:
				System.out.println("Probiere es nochmal");
				main(null);
		}
	}
	
	public static void rfrage(int punkte) {
		
		if(rF[0] == 0) {
		do {
			rF[0] = random.nextInt(5) + 1;
			rF[1] = random.nextInt(5) + 1;
			rF[2] = random.nextInt(5) + 1;
			rF[3] = random.nextInt(5) + 1;
			rF[4] = random.nextInt(5) + 1;
		}
		while(rF[0]==rF[1] || rF[0]==rF[2] || rF[0]==rF[3] || rF[0]==rF[4] || rF[1]==rF[2]
				 || rF[1]==rF[3] || rF[1]==rF[4] || rF[2]==rF[3] || rF[2]==rF[4] || rF[3]==rF[4]);
		}
//		System.out.println(rF[0] + " " + rF[1] + " " + rF[2] + " " + rF[3] + " " + rF[4]);
		
			switch(rF[i]) {
			case 1:
				i++;
				frage1(punkte);
			case 2:
				i++;
				frage2(punkte);
			case 3:
				i++;
				frage3(punkte);
			case 4:
				i++;
				frage4(punkte);
			case 5:
				i++;
				frage5(punkte);
				default:
					main(null);
			}
	}
	
	
	public static int frage1(int punkte) {
		System.out.println("Was ist Java ebenfalls?\nA) Eine Insel B) Ein Fluss "
				+ "C) Ein Königreich D) Ein Betriebssystem");
		switch(sc.next().toUpperCase()) {
		case "A":
			punkte++;
			System.out.println("Das ist die richtige Antwort. Du hast " + punkte + " Punkte");
			rfrage(punkte);
		case "B":
			System.out.println("Leider die Falsche Antwort. Du hast " + punkte + " Punkte");
			main(null);
		case "C":
			System.out.println("Leider die Falsche Antwort. Du hast " + punkte + " Punkte");
			main(null);
		case "D":
			System.out.println("Leider die Falsche Antwort. Du hast " + punkte + " Punkte");
			main(null);
			default:
				System.out.println("Falsche Eingabe, probiere die Frage noch einmal");
				frage1(punkte);
				
		}
		return punkte;
	}
	
	public static int frage2(int punkte) {
		System.out.println("Was ist 1 + 2 * 3?\nA) 5 B) 7 C) 9 D) 11");
		switch(sc.next().toUpperCase()) {
		case "A":
			System.out.println("Leider die Falsche Antwort. Du hast " + punkte + " Punkte");
			main(null);
		case "B":
			punkte++;
			System.out.println("Das ist die richtige Antwort. Du hast " + punkte + " Punkte");
			rfrage(punkte);
		case "C":
			System.out.println("Leider die Falsche Antwort. Du hast " + punkte + " Punkte");
			main(null);
		case "D":
			System.out.println("Leider die Falsche Antwort. Du hast " + punkte + " Punkte");
			main(null);
		default:
			System.out.println("Falsche Eingabe, probiere die Frage noch einmal");
			frage2(punkte);
		}
		return punkte;
	}
	
	public static int frage3(int punkte) {
		System.out.println("Wann ist das nächste Schaltjahr?\nA) 2022 B) 2023 "
				+ "C) 2024 D) 2026");
		switch(sc.next().toUpperCase()) {
		case "A":
			System.out.println("Leider die Falsche Antwort. Du hast " + punkte + " Punkte");
			main(null);
		case "B":
			System.out.println("Leider die Falsche Antwort. Du hast " + punkte + " Punkte");
			main(null);
		case "C":
			punkte++;
			System.out.println("Das ist die richtige Antwort. Du hast " + punkte + " Punkte");
			rfrage(punkte);
		case "D":
			System.out.println("Leider die Falsche Antwort. Du hast " + punkte + " Punkte");
			main(null);
		default:
			System.out.println("Falsche Eingabe, probiere die Frage noch einmal");
			frage3(punkte);
		}
		return punkte;
	}
	
	public static int frage4(int punkte) {
		System.out.println("Welchen Wochentag mag Garfield der Kater am allerwenigsten?"
				+ "\nA) Freitag B) Samstag C) Sonntag D) Montag");
		switch(sc.next().toUpperCase()) {
		case "A":
			System.out.println("Leider die Falsche Antwort. Du hast " + punkte + " Punkte");
			main(null);
		case "B":
			System.out.println("Leider die Falsche Antwort. Du hast " + punkte + " Punkte");
			main(null);
		case "C":
			System.out.println("Leider die Falsche Antwort. Du hast " + punkte + " Punkte");
			main(null);
		case "D":
			punkte++;
			System.out.println("Das ist die richtige Antwort. Du hast " + punkte + " Punkte");
			rfrage(punkte);
		default:
			System.out.println("Falsche Eingabe, probiere die Frage noch einmal");
			frage4(punkte);
		}
		return punkte;
	}
	
	public static int frage5(int punkte) {
		System.out.println("Hast du Spaß?\nA) Ja B) Yes C) Jo D) Klar");
		switch(sc.next().toUpperCase()) {
		case "A":
			punkte++;
			System.out.println("Das ist die richtige Antwort. Du hast " + punkte + " Punkte");
			rfrage(punkte);
		case "B":
			punkte++;
			System.out.println("Das ist die richtige Antwort. Du hast " + punkte + " Punkte");
			rfrage(punkte);
		case "C":
			punkte++;
			System.out.println("Das ist die richtige Antwort. Du hast " + punkte + " Punkte");
			rfrage(punkte);
		case "D":
			punkte++;
			System.out.println("Das ist die richtige Antwort. Du hast " + punkte + " Punkte");
			rfrage(punkte);
		default:
			System.out.println("Falsche Eingabe, probiere die Frage noch einmal");
			frage5(punkte);
		}
		return punkte;
	}

}
