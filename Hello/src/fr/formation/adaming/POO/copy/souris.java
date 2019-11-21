package fr.formation.adaming.POO.copy;

public class souris extends Animal {
	private int height;
	private String color;
	



	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	@Override
	public String toString() {
		return "souris [height=" + height + ", color=" + color + ", nom=" + nom + ", age=" + age + "]";
	}


}
