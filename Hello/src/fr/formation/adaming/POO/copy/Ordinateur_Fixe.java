package fr.formation.adaming.POO.copy;

public class Ordinateur_Fixe extends Ordinateur{
	protected String boitiertour;

	/**
	 * @return the boitiertour
	 */
	public String getBoitiertour() {
		return boitiertour;
	}

	/**
	 * @param boitiertour the boitiertour to set
	 */
	public void setBoitiertour(String boitiertour) {
		this.boitiertour = boitiertour;
	}

	@Override
	public String toString() {
		return "Ordinateur_Fixe [boitiertour=" + boitiertour + ", processeur=" + processeur + ", RAM=" + RAM
				+ ", Marque=" + Marque + ", numérodeserie=" + numerodeserie + "]";
	}
	
	

}
