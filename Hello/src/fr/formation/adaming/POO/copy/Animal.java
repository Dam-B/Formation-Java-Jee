package fr.formation.adaming.POO.copy;

public abstract class Animal {

		protected String nom;
		protected int age;
		
		public String getNom() {
			return nom;
	}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}

}

