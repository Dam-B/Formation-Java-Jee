package fr.formation.adaming.POO.copy;

public class Ordinateur_portable extends Ordinateur {
	protected String taille;
	protected int poids;

	/**
	 * @return the tailleecran
	 */
	public String getTaille() {
		return taille;
	}

	/**
	 * @param tailleecran the tailleecran to set
	 */
	public void setTaille(String taille) {
		this.taille = taille;
	}

	/**
	 * @return the poids
	 */
	public int getPoids() {
		return poids;
	}

	/**
	 * @param poids the poids to set
	 */
	public void setPoids(int poids) {
		this.poids = poids;
	}

	@Override
	public String toString() {
		return "Ordinateur portable [taille=" + taille + ", poids=" + poids + "kg, processeur=" + processeur + ", RAM="
				+ RAM + ", Marque=" + Marque + ", numérodeserie=" + numerodeserie + "]";
	}
	
	
}
