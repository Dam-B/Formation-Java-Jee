package fr.formation.adaming.POO.copy;

public class Chat extends Animal {
	private int height;
	private String color;
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Un Chat qui mesure " + height + " cm , qui est " + color + ", il s'apelle " + nom + " et il a " + age + " ans" ;
	}
	
	
	
}
