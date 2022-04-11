
public class Bueroangestellter extends Mensch {

	private String arbeitsBereich;
	private int tastenAnschlaegeProMin;

	public Bueroangestellter(int tastenAnschlaegeProMin, String arbeitsBereich, String haarFarbe, String name, int alter) {
		super(haarFarbe, name, alter);
		this.tastenAnschlaegeProMin = tastenAnschlaegeProMin;
		this.arbeitsBereich = arbeitsBereich;
	}

	public String getArbeitsBereich() {
		return arbeitsBereich;
	}

	public void setArbeitsBereich(String arbeitsBereich) {
		this.arbeitsBereich = arbeitsBereich;
	}

	public int getTastenAnschlaegeProMin() {
		return tastenAnschlaegeProMin;
	}

	public void setTastenAnschlaegeProMin(int tastenAnschlaegeProMin) {
		this.tastenAnschlaegeProMin = tastenAnschlaegeProMin;
	}




}
