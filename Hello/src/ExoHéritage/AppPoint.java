package ExoHéritage;

import ExoHéritage1.pointA;
import ExoHéritage2.pointNom;
import ExoHéritage3.pointNom2;

public class AppPoint {
	public static void main(String[]args) {
		pointA p1= new pointA();
		p1.initialise(2, 3);
		p1.affiche();
		pointNom p2 = new pointNom(2, 3, 'A');
		p2.affCoordNom();
		pointNom2 p3 = new pointNom2(2 ,4, 'B');
		p3.affiche();
	
	}
}
