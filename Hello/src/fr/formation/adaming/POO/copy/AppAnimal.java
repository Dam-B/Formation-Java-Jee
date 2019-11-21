package fr.formation.adaming.POO.copy;

public class AppAnimal {
	public static void main(String[] args) {
	
		souris s1 = new souris();
		s1.setHeight(10);
		s1.setNom("Jerry");
		s1.setColor("Bleue");
		s1.setAge(2);
		
	
		System.out.println(s1);
		
		Chat c1 = new Chat();
		c1.setAge(10);
		c1.setNom("Mickey");
		c1.setColor("Rouge");
		c1.setHeight(15);
		
		System.out.println(c1);
	}

}

