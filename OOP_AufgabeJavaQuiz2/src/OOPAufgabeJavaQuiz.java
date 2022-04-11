import java.util.ArrayList;
import java.util.Scanner;

public class OOPAufgabeJavaQuiz {
	

	public static void main(String[] args) {
		ArrayList<Question> questionList = erstelleFragen();
		int anzahlPunkte = 0;
		// Scanner
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < questionList.size(); i++) {
			Question q = questionList.get(i);
			System.out.println((i+1) + ". Frage: "+ q.getFrage());
			System.out.println("Antwort A: " + q.getAntwortA() + ", Antwort B: " + q.getAntwortB() + ", Antwort C: " + q.getAntwortC() + ", Antwort D: " + q.getAntwortD());
//			 Eingabe speichern
			String antwortVomUser = sc.next().toUpperCase();
//			 Eingabe  überprüfen
			if(q.getLoesung().contains(antwortVomUser)) {
				anzahlPunkte++;
				System.out.println("Richtige Antwort");
			}
			else {
				System.out.println("Falsche Antwort");
				System.out.println("Die richtige Antwort wäre " + q.getLoesung());
			}
//			 Auswertung ob Antwort richtig oder falsch ist
		}
//		Auswertung
		System.out.println("Sie haben " + anzahlPunkte + " /" + questionList.size() + " Fragen richtig beantwortet");
		System.out.println("und somit " + anzahlPunkte + " Punkte erreicht.");
		sc.close();
	}

	public static ArrayList<Question> erstelleFragen() {
		ArrayList<Question> tempList = new ArrayList<>();
		Question q1 = new Question("Was ist Java ebenfalls?", "Eine Insel", "Ein Fluss", "Ein Königreich", "Ein Betriebssystem", "A");
		Question q2 = new Question("Was ist 1 + 2 * 3", "5", "7", "9", "11", "B");
		Question q3 = new Question("Wann ist das nächste Schaltjahr?", "2022", "2023", "2024", "2026", "C");
		Question q4 = new Question("Welchen Wochentag mag Garfield der Kater am allerwenigsten?", "Freitag", "Samstag", "Sonntag", "Montag", "D");
		Question q5 = new Question("Hast du Spaß", "Ja", "Yes", "Jo", "Klar", "ABCD");
		tempList.add(q1);
		tempList.add(q2);
		tempList.add(q3);
		tempList.add(q4);
		tempList.add(q5);
		return tempList;
	}
	
}