package fr.formation.adaming.ExoClasses;


public class AppObjet {
	public static void main(String []args) {
		Objet.identZero();
	
		Objet o1 = new Objet();
		Objet o2 = new Objet();
		System.out.println(o1.getIdent());
		System.out.println(Objet.getIdentMax());
		Objet o3 = new Objet();
		System.out.println(o2.getIdent());
		System.out.println(o3.getIdent());
		
	}
}
