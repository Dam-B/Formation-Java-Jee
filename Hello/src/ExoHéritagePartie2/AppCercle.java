package ExoHéritagePartie2;

import ExoHéritage1.Point;

public class AppCercle {
	public static void main(String arg[]) {
		CerclePartie1 p1 = new CerclePartie1(1,2,5);
		p1.affiche();
		p1.changerayon(2);
		p1.affiche();
		p1.deplacecentre(2,2);
		p1.affiche();
		System.out.println(p1.getCentre());
		
		Point p2 = new Point(1,2);
		CerclePartie2 p3 = new CerclePartie2(p2,5);
		p3.affiche();
		
		
		
	}
}
