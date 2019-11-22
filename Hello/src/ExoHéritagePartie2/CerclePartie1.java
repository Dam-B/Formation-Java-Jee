package ExoHéritagePartie2;

public class CerclePartie1 extends Point2 {
	
	
	private double rayon;
	
	public CerclePartie1(double x, double y, double rayon) {
		super(x, y);
		this.rayon = rayon;
	}
	public void changerayon(double dr) {
		rayon += dr;
	}
	public void affiche() {
		super.affiche();
		System.out.println("Il a pour rayon " + rayon);
	}
}
