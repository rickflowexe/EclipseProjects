package de.bfw.klassenundobjekte;
/**
 * Modelklasse für Autos
 * 
 * erstellt am 01.07.2021
 * 
 * @author PatrykFilipow
 *
 */
public class Auto {
	
//	5 Attribute, die das Auto beschreiben
	private int tempoMax, hubraum;
	private String hersteller, modell;
	private double kmStand;
	private boolean istCabrio;
	
//	Setter und Getter
	/**
	 * Setzt die Variable tempoMax
	 * @param tempoMax Maximale Geschwindigkeit des Autos
	 */
	public void setTempoMax(int tempoMax/*int tempoMaxx*/) {
		/*ohne this.*/this.tempoMax = tempoMax/*tempoMaxx*/;
	}
	/**
	 * Gibt das Maximale Tempo des Autos zurück
	 * @return maximales Tempo des Autos
	 */
	public int getTempoMax() {
		return tempoMax;
	}
	/**
	 * Setzt die Variable hubraum
	 * @param hubraum wird in kubikcm angegeben
	 */
	public void setHubraum(int hubraum) {
		this.hubraum = hubraum;
	}
	/**
	 * Gibt den Hubraum des Autos zurück
	 * @return Hubraum des Autos
	 */
	public int getHubraum() {
		return hubraum;
	}
	/**
	 * Setzt die Variable hersteller
	 * @param hersteller gibt die Marke / den Produzenten an
	 */
	public void setHersteller(String hersteller) {
		this.hersteller = hersteller;
	}
	/**
	 * Gibt den Hersteller des Autos zurück
	 * @return Hersteller des Autos
	 */
	public String getHersteller() {
		return hersteller;
	}
	/**
	 * Setzt die Variable modell
	 * @param modell ist die Serie des Autos
	 */
	public void setModell(String modell) {
		this.modell = modell;
	}
	/**
	 * Gibt das Modell des Autos zurück
	 * @return Modell des Autos
	 */
	public String getModell() {
		return modell;
	}
	/**
	 * Setzt die Variable kmStand
	 * @param kmStand ist die bereits gefahrene Strecke in Kilometern
	 */
	public void setKmStand(double kmStand) {
		this.kmStand = kmStand;
	}
	/**
	 * Gibt den kmStand des Autos zurück
	 * @return KmStand des Autos
	 */
	public double getKmStand() {
		return kmStand;
	}
	/**
	 * Setzt die Variable istCabrio
	 * @param istCabrio sagt ob das Auto mit oder ohne Dach ist
	 */
	public void setIstCabrio(boolean istCabrio) {
		this.istCabrio = istCabrio;
	}
	/**
	 * Bei Boolean nimmt man beim getter: is
	 * Gibt zurück ob es sich um ein Cabrio handelt oder nicht
	 * @return istCabrio
	 */
	public boolean isIstCabrio() {
		return istCabrio;
	}
}
