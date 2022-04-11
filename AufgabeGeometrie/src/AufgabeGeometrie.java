import java.util.Scanner;

public class AufgabeGeometrie {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Menu\n#####\n"
				+ "(1) Volumen und Oberfläche eines Zylinders berechnen\n"
				+ "(2) Volumen und Oberfläche einer Kugel berechnen\n"
				+ "(3) Volumen, Oberfläche, Länge Raumdiagonalen und "
				+ "Gesamtkantenlänge eines Quaders berechnen\n"
				+ "Bitte auswählen");
		switch(sc.nextInt()) {
		case 1:
			System.out.println("Bitte Höhe des Zylinders eingeben:");
			double zHoehe = sc.nextDouble();
			
			System.out.println("Bitte den Radius des Zylinders eingeben:");
			double zRadius = sc.nextDouble();
			
			double zGrundFlaeche = Math.PI * Math.pow(zRadius, 2);
			double zUmfangGrundFlaeche = 2 * Math.PI * zRadius;
			double zMantelFlaeche = zUmfangGrundFlaeche * zHoehe;
			
			double zVolumen = zGrundFlaeche  * zHoehe;
			double zOberFlaeche = (2 * zGrundFlaeche) + zMantelFlaeche;
			
			System.out.println("Das Volumen des Zylinders beträgt: " + zVolumen
					+ " cm^3\nund die Oberfläche: " +  zOberFlaeche + " cm^2.");
			main(null);
		case 2:
			System.out.println("Bitte den Radius einer Kugel eingeben:");
			double kRadius = sc.nextDouble();
			
			double kUmfang = 2 * Math.PI * kRadius;
			double kVolumen =(4/3) * Math.PI * Math.pow(kRadius, 3) ;
			double kOberFlaeche = 4 * Math.PI * Math.pow(kRadius, 2);
			
			System.out.println("Der Umfang der Kugel beträgt: " + kUmfang
					+ " cm,\ndas Volumen: " + kVolumen + " cm^3\nund die Oberfläche: "
					+ kOberFlaeche + " cm^2.");
			
			main(null);
		case 3:
			System.out.println("Bitte erste Seitenlänge eines Quaders eingeben:");
			double qA = sc.nextDouble();
			System.out.println("Bitte zweite Seitenlänge eines Quaders eingeben:");
			double qB = sc.nextDouble();
			System.out.println("Bitte dritte Seitenlänge eines Quaders eingeben:");
			double qC = sc.nextDouble();
			
			double qVolumen = qA * qB * qC;
			double qOberFlaeche = (2*qA*qB)+(2*qA*qC)+(2*qB*qC);
			double qLaengeDiagonale = Math.sqrt(Math.pow(qA, 2)+Math.pow(qB, 2)
			+Math.pow(qC, 2));
			double qGesamtKantenLaenge = (4*qA) + (4*qB) + (4*qC);
			
			System.out.println("Das Volumen des Quaders beträgt: " + qVolumen
					+ " cm^3,\ndie Oberfläche: " + qOberFlaeche + " cm^2,\n"
					+"die Länge der Raumdiagonalen: " + qLaengeDiagonale + " cm\n"
					+"und die Gesamtkantenlänge: " + qGesamtKantenLaenge + " cm.");
			
			main(null);
		}
				
		sc.close();
		
		
		

	}

}
