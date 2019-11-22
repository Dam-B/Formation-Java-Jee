package ExoHéritagePartie2;

public class CerclePartie1 extends Point2 {
	
	
	private double rayon;
	
	public CerclePartie1(double x, double y, double rayon) {
		super(x, y);
		this.rayon = rayon;
	}
	public Point2 getCentre() {
		return this ;
	}
	public void deplacecentre(double dx, double dy) {
		super.deplacecentre(dx, dy);
	}
	public void changerayon(double dr) {
		this.rayon = dr;
	}
	public void affiche() {
		System.out.println(this.toString() + " Rayon = "+ rayon);
	}
	@Override
	public String toString() {
		return "Cercle [x=" + x + ", y=" + y + "]";
	}
}
