package fr.formation.adaming.ExoClasses;

public abstract class Point {
	protected char nom;
	protected double abscisse;
	protected double translate;
	
	public Point() {
		// TODO Auto-generated constructor stub
	}

	public Point(char nom) {
		super();
		this.nom = nom;
	}
	public void Affiche() {
		System.out.println(nom + " " + abscisse);
	}
	public void Translate(double translate) {
		this.abscisse += translate;
	}


	public double getAbscisse() {
		return abscisse;
	}


	public void setAbscisse(double abscisse) {
		this.abscisse = abscisse;
	}


}
