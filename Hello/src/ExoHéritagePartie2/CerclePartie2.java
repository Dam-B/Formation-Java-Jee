package ExoHéritagePartie2;

public class CerclePartie2 extends Point2 {

		private Point2 point;
		private double rayon;
		
		public CerclePartie2(double x, double y, double rayon) {
			super(point);
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
}
