
public class OOP_Punkt_Kreis_Main {

	public static void main(String[] args) {
		
		Point z = new Point(6, 7);
		z.print();
		
		CirclePoint a = new CirclePoint(2, 3, 4);
		a.print();
		System.out.println("Flächeninhalt: " + a.getFlaecheninhalt());
	}

}
