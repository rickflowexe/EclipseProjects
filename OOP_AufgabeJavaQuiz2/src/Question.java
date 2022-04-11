/**
 * 
 * @author PatrykFilipow
 *
 */
public class Question {
	private String frage, antwortA, antwortB, antwortC, antwortD, loesung;

	/**
	 * 
	 * @param frage    die frage
	 * @param antwortA Antwort A
	 * @param antwortB Antwort B
	 * @param antwortC Antwort C
	 * @param antwortD Antwort D
	 * @param loesung  Die richtige Antwort
	 */

	public Question(String frage, String antwortA, String antwortB, String antwortC, String antwortD, String loesung) {
		this.frage = frage;
		this.antwortA = antwortA;
		this.antwortB = antwortB;
		this.antwortC = antwortC;
		this.antwortD = antwortD;
		this.loesung = loesung;
		
	}

	public String getFrage() {
		return frage;
	}

	public void setFrage(String frage) {
		this.frage = frage;
	}

	public String getAntwortA() {
		return antwortA;
	}

	public void setAntwortA(String antwortA) {
		this.antwortA = antwortA;
	}

	public String getAntwortB() {
		return antwortB;
	}

	public void setAntwortB(String antwortB) {
		this.antwortB = antwortB;
	}

	public String getAntwortC() {
		return antwortC;
	}

	public void setAntwortC(String antwortC) {
		this.antwortC = antwortC;
	}

	public String getAntwortD() {
		return antwortD;
	}

	public void setAntwortD(String antwortD) {
		this.antwortD = antwortD;
	}

	public String getLoesung() {
		return loesung;
	}

	public void setLoesung(String loesung) {
		this.loesung = loesung;
	}

}
