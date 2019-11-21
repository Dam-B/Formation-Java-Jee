package fr.formation.adaming.POO.copy;

public abstract class Ordinateur extends Machine {
	protected String processeur;
	protected String RAM;
	protected String Marque;
	
	/**
	 * @return the marque
	 */
	public String getMarque() {
		return Marque;
	}

	/**
	 * @param marque the marque to set
	 */
	public void setMarque(String marque) {
		Marque = marque;
	}

	/**
	 * @return the processeur
	 */
	public String getProcesseur() {
		return processeur;
	}

	/**
	 * @param processeur the processeur to set
	 */
	public void setProcesseur(String processeur) {
		this.processeur = processeur;
	}

	
	/**
	 * @return the rAM
	 */
	public String getRAM() {
		return RAM;
	}
	/**
	 * @param rAM the rAM to set
	 */
	public void setRAM(String rAM) {
		RAM = rAM;
	}
	
	
}
