package fr.formation.adaming;

import java.util.Scanner;

public class TableauExo {
	
	
}
// //Exercice affichage nombre carré
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = 0;
//		System.out.println("Ecrire un nombre");
//		n = sc.nextInt();
//		int tab [] = new int [n*2];
//		for (int i = 1; i < (n*2) ; i= i + 2) {
//		tab [i] = i *i;
//		System.out.println(i +" a pour carré " + tab[i]);
//	}
//	}
	
	
//	// Exercice affichage tableau avec entrée de valeur
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		// On déclare les variables du tableau + le tableau
//		float n1, n2, n3, n4, n5 = 0;
//		float tab[] = new float[5];
//
//		// On fait la saisie des 5 valeurs
//		System.out.println("Ecrire un nombre");
//		n1 = sc.nextFloat();
//		System.out.println("Ecrire un nombre");
//		n2 = sc.nextFloat();
//		System.out.println("Ecrire un nombre");
//		n3 = sc.nextFloat();
//		System.out.println("Ecrire un nombre");
//		n4 = sc.nextFloat();
//		System.out.println("Ecrire un nombre");
//		n5 = sc.nextFloat();
//
//		// On remplace les cases dans le tableau par les valeurs
//		tab[0] = n1;
//		tab[1] = n2;
//		tab[2] = n3;
//		tab[3] = n4;
//		tab[4] = n5;
//
////		 // On print le tableau
////		 for (int i = 0; i<4; i++) {
////		 System.out.print(tab[i]+ " | ");
////		 }
//
//		// Partie 2 : on fait la recherche des valeurs avant de print le tableau
//		// Ajout des variables pour la partie 2
//		float moy = 0, min, max = 0, somme = 0;
//		min = tab[0];
//		for (int i = 0; i < tab.length; i++) {
//			if (tab[i] < min) {
//				min = tab[i];
//			}
//			if (tab[i] > max) {
//				max = tab[i];
//			}
//			somme += tab[i];
//		}
//		moy = somme / tab.length;
//		System.out.println("La moyenne des valeurs est : " + moy + ", La valeur minimale est : " + min
//				+ ", La valeur maximale est : " + max + ".");
//	}
//}
