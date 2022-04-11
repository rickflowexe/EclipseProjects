
public class Mensch {

	private String haarFarbe, name;
	private int alter;

	public Mensch(String haarFarbe, String name, int alter) {
		this.haarFarbe = haarFarbe;
		this.name = name;
		this.alter = alter;
	}

	public String getHaarFarbe() {
		return haarFarbe;
	}

	public void setHaarFarbe(String haarFarbe) {
		this.haarFarbe = haarFarbe;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

}
