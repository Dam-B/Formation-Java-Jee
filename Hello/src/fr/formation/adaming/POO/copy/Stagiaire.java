package fr.formation.adaming.POO.copy;

public class Stagiaire {
	
	public String  nom;
	
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	private String  prenom;
	private int age;
	private String adresse;
	
	public Stagiaire() {
	}
	
	public Stagiaire(String nom, String prenom,int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
		public void parler() {
			System.out.println("Bonjour , je suis " + nom +" " + prenom + " j'ai " + age +"ans.");
		}
		public void parler(int age) {
			
		}
	
	
}
