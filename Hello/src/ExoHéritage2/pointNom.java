package ExoHéritage2;

public class pointNom extends point2 {
	
	protected char nomPoint;

	
	public pointNom(int x, int y, char nomPoint) {
		super(x,y);
		this.nomPoint = nomPoint;
		
	}
	public void affCoordNom() {
		affCoord();
		System.out.println("Nom "+ nomPoint);
	}

}
