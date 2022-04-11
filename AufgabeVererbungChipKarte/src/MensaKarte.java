
public class MensaKarte extends ChipKarte {

	protected int anzahlEssen, mensaStandort;


	public void aufladen(int anzahlEssen) {
		this.anzahlEssen = this.anzahlEssen + anzahlEssen;
	}

	public int getMensaStandort() {
		return mensaStandort;
	}

	public void setMensaStandort(int standort) {
		mensaStandort = standort;
	}

}
