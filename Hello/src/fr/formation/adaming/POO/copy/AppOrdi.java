package fr.formation.adaming.POO.copy;

public class AppOrdi {
	public static void main(String[] args) {
		
		Ordinateur_portable p1 = new Ordinateur_portable();
		p1.setNumerodeserie("84612795");
		p1.setProcesseur("Processeur de ouf");
		p1.setRAM("Grosse RAM au moins 32 Go");
		p1.setTaille("50*50");
		p1.setMarque("HP");
		p1.setPoids(5);
		
		
		System.out.println(p1);
		
		Ordinateur_Fixe f1 = new Ordinateur_Fixe();
		f1.setBoitiertour("Good");
		f1.setNumerodeserie("15483279");
		f1.setProcesseur("Puissant");
		f1.setRAM("32 Go");
		f1.setMarque("Républic of Gamers");
		
		System.out.println(f1);
	}		
}