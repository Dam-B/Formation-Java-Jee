package ExoHéritage3;

public class pointNom2 extends point3 {
	private char nomPoint;
	public pointNom2(int x, int y, char nomPoint) {
		super(x,y);
		this.nomPoint = nomPoint;
		
	}
	public void affiche() {
		super.affiche();
		System.out.println("Nom "+ nomPoint);
	}

}
