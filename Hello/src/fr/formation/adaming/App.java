package fr.formation.adaming;

import java.util.Scanner;

import fr.formation.adaming.POO.copy.Stagiaire;

public class App {
	public static void main(String[]args) {
		
		//cr�ation simple d'objet avec g�n�rateur
		Scanner sc = new Scanner(System.in);
		Stagiaire stg1 = new Stagiaire();
		System.out.println("Entrez le nom :");
		stg1.prenom =sc.nextLine();
		System.out.println("Entrez le prenom :");
		stg1.nom =sc.nextLine();
		System.out.println("Entrez l'�ge :");
		stg1.age =sc.nextInt();
		
		stg1.parler();
		// 2�me exemple de construction d'objet
		Stagiaire stg2 = new Stagiaire("BERTINARIA", "Damien",26);
		stg2.parler();	
	}
}
