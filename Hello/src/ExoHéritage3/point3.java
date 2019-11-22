package ExoHéritage3;

public class point3 {
	
	public point3(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public void affiche() {
		System.out.println("Coordonnées : "+x+" "+y);
	}
	private int x,y;
}
