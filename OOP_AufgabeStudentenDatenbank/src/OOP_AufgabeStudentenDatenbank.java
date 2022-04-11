
public class OOP_AufgabeStudentenDatenbank {

	static Student st = new Student();
	static Student st2 = new Student("Bose", "Bratan", "FAAN", 102, 26);
	static Student st3 = new Student("Sup", "Joe", "FAAN", 103, 28);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		st.setAlter(27);
		st.setId(101);
		st.setLehrgang("FAAN");
		st.setName("Filipow");
		st.setVorname("Patryk");

//		System.out.println("ID: " + st.getId() + ", Lehrgang: " + st.getLehrgang() + ", Vorname: " + st.getVorname()
//				+ ", Nachname: " + st.getName() + ", Alter: " + st.getAlter());
//
//		System.out.println("ID: " + st2.getId() + ", Lehrgang: " + st2.getLehrgang() + ", Vorname: " + st2.getVorname()
//				+ ", Nachname: " + st2.getName() + ", Alter: " + st2.getAlter() + "\n");

//		st.printMe();
//		st2.printMe();
//		st3.printMe();
//		System.out.println("\n");

		Student[] studentArray = new Student[20];
		studentArray[0] = new Student("Aoki","Steve","FAAN",104,29);
		studentArray[1] = new Student("Bartels","Michelle","FASY",105,30);
		studentArray[2] = new Student("Blach","Paul","FASY",106,35);
		studentArray[3] = new Student("Reukauf","Conrad","FAAN",107,23);
		studentArray[4] = new Student("Guenzel","Daniel","FAAN",108,24);
		studentArray[5] = new Student("Sternie","Daniel","FAAN",109,28);
		studentArray[6] = new Student("De Lucia","Sasha","ITSE",110,31);
		studentArray[7] = new Student("Schulz","Dennis","ITSE",111,21);
		studentArray[8] = new Student("Jacholke","Phillip","ITSE",112,32);
		studentArray[9] = new Student("Mohamed","Mahmoud","FAAN",113,35);
		
//		for (int i = 0; i < 10; i++) {
//			studentArray[i+10] = new Student("Name" + i, "Vorname" + i, "Lehrgang" + i, 114 + i, 35 + i);
//		}
//		
//			for (int i = 0; i < studentArray.length; i++) {
//			System.out.println("Position Array: " + i + ", ID: " + studentArray[i].getId() + ", Lehrgang: " + studentArray[i].getLehrgang()
//					+ ", Vorname: " + studentArray[i].getVorname() + ", Nachname: " + studentArray[i].getName()
//					+ ", Alter: " + studentArray[i].getAlter());
//		}
//			
//		for (int i = 0; i < studentArray.length; i++) {
//			studentArray[i].printMe1(i);
//		}
//			Neuanfang
		StudentDatabase studentDatabase = new StudentDatabase(10);
//		studentDatabase.printMe2();
		studentDatabase.addStudent(1, "Lehrgang1", "Vorname1", "Name1", 1);
		studentDatabase.addStudent(2, "Lehrgang2", "Vorname2", "Name2", 2);
		studentDatabase.addStudent(3, "Lehrgang3", "Vorname3", "Name3", 3);
		studentDatabase.addStudent(4, "Lehrgang4", "Vorname4", "Name4", 4);
		studentDatabase.printMe2();
		System.out.println("Es sind " + studentDatabase.numberOfStudents() + " Studenten.");
		
		studentDatabase.deleteStudent();
		studentDatabase.printMe2();
		
		System.out.println("Es sind " + studentDatabase.numberOfStudents() + " Studenten.");
		studentDatabase.averageAgeOfAllStudents();
		
		

	}
}
