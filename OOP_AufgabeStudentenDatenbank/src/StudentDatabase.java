import java.util.Scanner;

public class StudentDatabase {
	private Student[] studentArray2;

	StudentDatabase(int groesseArray) {
		studentArray2 = new Student[groesseArray];
		for (int i = 0; i < studentArray2.length; i++) {
			studentArray2[i] = new Student("leer", "leer", "leer", 0, 0);
		}
	}

	public void printMe2() {
		boolean schalter = false;
		for (int i = 0; i < studentArray2.length; i++) {
			if (studentArray2[i].getId() != 0) {
				schalter = true;
				studentArray2[i].printMe1(i);
			}
		}
		if (!schalter) {
			System.out.println("Keinen Studenten gefunden");
		}
	}

	public void addStudent0(int id, String lehrgang, String vorname, String name, int alter) {
		Student st = new Student(name, vorname, lehrgang, id, alter);
		int i = 0;
		while (studentArray2[i].getId() != 0) {
			i++;
		}
		studentArray2[i] = st;

	}

	public void addStudent(int id, String lehrgang, String vorname, String name, int alter) {
		Student st = new Student(name, vorname, lehrgang, id, alter);

		for (int i = 0; i < studentArray2.length; i++) {
			if (studentArray2[i].getId() == 0) {
				studentArray2[i] = st;
				break;
			}
		}
	}

	public void deleteStudent() {
		System.out.println("Bitte die ID eingeben die du löschen möchtest.");
		Scanner scanner = new Scanner(System.in);
		int eingabeID = scanner.nextInt();
		scanner.close();
		for (int i = 0; i < studentArray2.length; i++) {
			if (studentArray2[i].getId() == eingabeID) {
				studentArray2[i] = new Student("leer", "leer", "leer", 0, 0);
				break;
			}
		}
	}

	public int numberOfStudents() {
		int anzahlStudenten = 0;
		for (int i = 0; i < studentArray2.length; i++) {
			if (studentArray2[i].getId() != 0) {
				anzahlStudenten++;
			}
		}
		return anzahlStudenten;
//		System.out.println("Es sind " + anzahlStudenten + " Studenten.");
	}
	
	public void averageAgeOfAllStudents() {
		int anzahlStudenten = 0;
		double alterAllerStudenten = 0;
		for (int i = 0; i < studentArray2.length; i++) {
			if (studentArray2[i].getId() != 0) {
				anzahlStudenten++;
			}
		}
		for (int i = 0; i < studentArray2.length; i++) {
			if (studentArray2[i].getId() != 0) {
				alterAllerStudenten = alterAllerStudenten + studentArray2[i].getAlter();
			}
		}
		System.out.println("Es sind " + anzahlStudenten + " Studenten mit einem Durschnittsalter von " + alterAllerStudenten/anzahlStudenten + " Jahren.");
	}

}
