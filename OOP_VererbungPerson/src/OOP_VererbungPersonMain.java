
public class OOP_VererbungPersonMain {

	public static void main(String[] args) {

		String strasse = "Helbig";
		String stadt = "Berlin";
		String plz = "01234";
		String land = "DE";
		boolean istBewohnt = true;

		Wohnadresse w1 = new Wohnadresse(strasse, stadt, plz, land, istBewohnt);

		Person p1 = new Person("Filipow", "0123", "Fili@pow", w1);
		System.out.println(p1.name + "\n" + p1.telefon + "\n" + p1.eMail + "\n" + p1.wa.getStrasse());
		p1.wa.waDrucken();

		Wohnadresse w2 = new Wohnadresse("Boulevard", "Warschau", "43210", "PL", true);

		Studierende s1 = new Studierende("Patryk", "012345", "mail.po", w2, "schnell", 100, 9000.00);
		System.out.println(s1.name + "\n" + s1.telefon + "\n" + s1.eMail + "\n" + s1.wa.getStrasse() + "\n"
				+ s1.getModul() + "\n" + s1.getMatrikelNr() + "\n" + s1.getdNote());
		s1.wa.waDrucken();

	}

}
