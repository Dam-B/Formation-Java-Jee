package ExoHéritage1;

public class Point {
	public void initialise(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public void deplace(double dx, double dy) {
		x += dx;
		y+= dy;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	private double x,y;
}
