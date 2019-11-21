package fr.formation.adaming.ExoClasses;

public class App extends Point{
	public static void main(String[] args) {
		Point p1 = new Point('y') {
		};
		p1.setAbscisse(2.25);
		p1.Affiche();
		p1.Translate(2.25);
		p1.Affiche();
		
		
	}
}

