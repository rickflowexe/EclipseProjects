
public class Student {

	private String name, vorname, lehrgang;
	private int id, alter;

	public void printMe() {
		System.out.println("ID: " + getId() + ", Lehrgang: " + getLehrgang() + ", Vorname: " + getVorname()
				+ ", Nachname: " + getName() + ", Alter: " + getAlter());
	}

	public void printMe1(int i) {
		System.out.println("Position Array: " + i + ", ID: " + getId() + ", Lehrgang: " + getLehrgang() + ", Vorname: "
				+ getVorname() + ", Nachname: " + getName() + ", Alter: " + getAlter());
	}

	public Student(String name, String vorname, String lehrgang, int id, int alter) {
		super();
		this.name = name;
		this.vorname = vorname;
		this.lehrgang = lehrgang;
		this.id = id;
		this.alter = alter;
	}

	public Student() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getLehrgang() {
		return lehrgang;
	}

	public void setLehrgang(String lehrgang) {
		this.lehrgang = lehrgang;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

}
