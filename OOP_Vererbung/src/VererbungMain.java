
public class VererbungMain {

	public static void main(String[] args) {

		Pkw auto1 = new Pkw();
		
		auto1.setGeschwindigkeit(300);
		auto1.setAnzahlSitze(2);
		System.out.println(auto1.getGeschwindigkeit());
		System.out.println(auto1.getAnzahlSitze());
	}

}
