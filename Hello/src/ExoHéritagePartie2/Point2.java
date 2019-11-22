package ExoHéritagePartie2;

public class Point2 {
	protected double x,y;
	protected Point2 Point;
	
public Point2(double x, double y) {
	this.x=x;
	this.y=y;
	}

public Point2 getCentre() {
	this.x = x;
	this.y = y;
	return Point = new Point2(x,y) ;
}

public void deplacecentre(double dx, double dy) {
	this.x += dx;
	this.y += dy;
}

public void affiche() {
	System.out.println("Le cercle a pour centre " + x +" "+ y);
}

}

