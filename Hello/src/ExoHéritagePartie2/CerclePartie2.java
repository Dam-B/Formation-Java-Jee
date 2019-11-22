package ExoHéritagePartie2;

public class CerclePartie2 {

		private static Point2 Point;
		private double rayon;
		
		public CerclePartie2(Point2 Point, double rayon) {
			super(Point);
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
