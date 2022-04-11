import java.util.ArrayList;

public class OOP_AufgabeSchneckenRennen {

	public static void main(String[] args) {
		
		Rennschnecke rennSchnecke1 = new Rennschnecke("Porsche", "Schwarz", 12, 0);
		Rennschnecke rennSchnecke2 = new Rennschnecke("Lambo", "Gelb", 13, 0);
		Rennschnecke rennSchnecke3 = new Rennschnecke("Ferrarri", "Rot", 14, 0);
		Rennschnecke rennSchnecke4 = new Rennschnecke("McLaren", "Blau", 15, 0);
		
//		rennSchnecke1.krieche();
//		rennSchnecke2.krieche();
//		rennSchnecke3.krieche();
//		rennSchnecke4.krieche();
		
		
//		System.out.println(rennSchnecke1.toString());
//		System.out.println();
		
		
		Rennen rennenEins = new Rennen("Wetten", 4, 11);
		rennenEins.addRennschnecke(rennSchnecke1);
		rennenEins.addRennschnecke(rennSchnecke2);
		rennenEins.addRennschnecke(rennSchnecke3);
		rennenEins.addRennschnecke(rennSchnecke4);
//		rennenEins.lasseSchneckenKriechen();
//		System.out.println(rennenEins.toString());
//		rennenEins.removeRennschnecke("Porsche");
		rennenEins.durchfuehren();
		System.out.println(rennenEins.toString());
		
		if(rennenEins.ermittleGewinner()!=null) {
			System.out.println("\nGewinner: "+ rennenEins.ermittleGewinner().toString());
		}
		
		Wettbuero rennenZwei = new Wettbuero(2.5, rennenEins);
		rennenZwei.wetteAnnehmen("Porsche", 100, "Dick");
		rennenZwei.wetteAnnehmen("Lambo", 150, "Doof");
		rennenZwei.wetteAnnehmen("Ferrarri", 200, "Tick");
		rennenZwei.wetteAnnehmen("McLaren", 250, "Tack");
		
		rennenZwei.rennenDurchfuehren("RennenZwei", 4, 11.5);
		System.out.println(rennenZwei.toString());
		
		
		
		
	}

}
