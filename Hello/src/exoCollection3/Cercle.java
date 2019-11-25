package exoCollection3;

import java.util.Comparator;

public class Cercle {
	public Cercle(int x, int y , double rayon) {
		this.x=x;
		this.y = y;
		this.rayon= rayon;
		
	}
	public void affiche() {
		System.out.println("Coordonnées : "+x+ ", "+y+" ; rayon : "+rayon);
	}
	public double getRayon() {
		return rayon;
	}
	public int getX() {
		return x;
	}
	public static Comparator<Cercle> ComparatorCercle = new Comparator<Cercle>() {
		public int compare(Cercle c1, Cercle c2) {
			return (int) (c1.getRayon()-c2.getRayon());
		}
	};
	
	public static Comparator<Cercle> ComparatorCercle2 = new Comparator<Cercle>() {
		public int compare(Cercle c1, Cercle c2 ) {
			return (int) (c1.getX()-c2.getX());
		}
	};
	
	private int x,y;
	double rayon;
}
