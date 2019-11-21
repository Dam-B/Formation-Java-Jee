package ExoHéritage;

public class AppPoint {
	public static void main(String[]args) {
		pointA p1= new pointA();
		p1.initialise(2, 3);
		p1.affiche();
		pointNom p2 = new pointNom(2, 3, 'A');
		p2.affCoordNom();
	}
}
