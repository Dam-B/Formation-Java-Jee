package ExoHéritagePartie2;

import ExoHéritage1.Point;

public class CerclePartie2 {

	private Point centre;
	private double rayon;
	
	public CerclePartie2(Point centre, double rayon) {
		this.rayon = rayon;
		this.centre = centre;
	}
	public Point getCentre() {
		return centre ;
	}
	public void deplacecentre(double dx, double dy) {
		centre.deplace(dx, dy);
	}
	public void changerayon(double dr) {
		this.rayon = dr;
	}
	public void affiche() {
		System.out.println("centre" + centre + " Rayon = "+ rayon);
	}
	}
