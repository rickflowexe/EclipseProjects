package de.bfw.klassenundobjekte;

public class Monitor {

//	5 Attribute plus Setter und Getter
//	Java Doc Kommentare
	
	double durchmesser;
	int pixel;
	String hersteller;
	boolean hdr, lautsprecher;
	/**
	 * 
	 * @param durchmesser
	 */
	public void setDurchmesser(double durchmesser) {
		this.durchmesser = durchmesser;
	}
	/**
	 * 
	 * @return
	 */
	public double getDurchmesser() {
		return durchmesser;
	}
	/**
	 * 
	 * @param pixel
	 */
	public void setPixel(int pixel) {
		this.pixel = pixel;
	}
	/**
	 * 
	 * @return
	 */
	public int getPixel() {
		return pixel;
	}
	/**
	 * 
	 * @param hersteller
	 */
	public void setHersteller(String hersteller) {
		this.hersteller= hersteller;
	}
	public String getHersteller() {
		return hersteller;
	}
	public void setHdr(boolean hdr) {
		this.hdr = hdr;
	}
	public boolean isHdr() {
		return hdr;
	}
	public void setLautsprecher(boolean lautsprecher) {
		this.lautsprecher= lautsprecher;
	}
	public boolean getLautsprecher() {
		return lautsprecher;
	}
}
