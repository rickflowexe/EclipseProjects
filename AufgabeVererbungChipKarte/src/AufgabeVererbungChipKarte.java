
public class AufgabeVererbungChipKarte {

	public static void main(String[] args) {

		MensaKarte mkk = new MensaKarte();
		MensaKarte mk = new MensaKarte();
		
	
		mk.aufladen(5);
		mk.setMensaStandort(3);
		mk.statusAnzeigen();
		mk.setEigentuemerNummer(1);
		
		BibliotheksKarte bk = new BibliotheksKarte();
		bk.setEigentuemerNummer(11);
		bk.setAnzahlEntlieheneBuecher(3);
		bk.statusAnzeigen();
		
		System.out.println(mk.getEigentuemerNummer());
		System.out.println(mk.getMensaStandort());
		
		System.out.println(bk.getAnzahlEntlieheneBuecher());
		
	}

}
