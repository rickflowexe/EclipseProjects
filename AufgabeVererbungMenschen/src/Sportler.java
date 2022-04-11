
public class Sportler extends Mensch{


	private String diziplin;
	private int weltrangeListenPos;
	private boolean isGedopt;

	public Sportler(String disziplin, int weltrangListenPos, boolean isGedopt, String haarFarbe, String name, int alter) {
		super(haarFarbe, name, alter);
		this.diziplin = disziplin;
		this.weltrangeListenPos = weltrangListenPos;
		this.isGedopt = isGedopt;
	}

	
	public String getDiziplin() {
		return diziplin;
	}

	public void setDiziplin(String diziplin) {
		this.diziplin = diziplin;
	}

	public int getWeltrangeListenPos() {
		return weltrangeListenPos;
	}

	public void setWeltrangeListenPos(int weltrangeListenPos) {
		this.weltrangeListenPos = weltrangeListenPos;
	}

	public boolean isGedopt() {
		return isGedopt;
	}

	public void setGedopt(boolean isGedopt) {
		this.isGedopt = isGedopt;
	}

}
