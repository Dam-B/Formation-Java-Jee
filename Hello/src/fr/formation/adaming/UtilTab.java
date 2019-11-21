package fr.formation.adaming;

import java.util.Scanner;

public class UtilTab 
{
	public static void main(String [] args) {
		int t1 [] = {1,2,3,4,5};
		int t2 [] = {1,2,3,4,5};
		

	somme2(t1 , t2);	
//		final int N = 9;
//		int tab1 [][] = new int [N][N];
//		int somme = 0;
//		for (int i = 0 ; i < N+1 ; i++) {	
//			for (int j = 0  ; j < N+1 ; j++) {
//			somme = i+j;
//			tab1[i][j]=tab1[somme][0];
//			
//			System.out.print(tab1[i][j]);
//		}
		}

		
		
//		int n = 0;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Veuillez entrer le nombre de valeurs impairs désirées");
//		n = sc.nextInt();
//		
//		somme2(n);
//		
		
//	}
	public static double somme(double []Tab) {
		double S= 0;
		for (int i = 0 ; i < Tab.length ; i ++) {
			S= S + Tab[i];
		}
		return S;
		//System.out.print("La somme des valeurs du tableau est : " + S);
	}
	public static double incre(double testincre , double []tab) {
		for (int i = 0 ; i < tab.length; i++) {
			tab[i] = tab[i] + testincre;
			return tab[i];
			//System.out.print(tab[i] +" | ");
		}
		return testincre;
		
	}
	public static void testIncrementation(String args[]) {
		double testincre =0;
		double tab [] = {1 , 2, 3, 4, 5};
		Scanner sc = new Scanner(System.in);
		System.out.print("Veuillez entrer la valeur à incrementer au tableau");
		testincre = sc.nextDouble();
		incre(testincre , tab);
	}
	public static void testSomme (int args[]) {
		double t[] = {1,2,3,4,5,6};
		somme(t);	
											}
	public static int[]  genere(int n) {
		int tab1[] = new int [n*2];
//			System.out.print("Les " +n+ " premiers nombres impairs sont : ");
		for (int i =1; i < tab1.length; i  += 2) {
			tab1[i]= tab1[i] + i ;
			System.out.print(tab1 [i]+ " ");	
		}
		System.out.print(tab1);
		return tab1;
	}
	
	public static void affiche(double [] t) {
		for (int i=0; i<t.length ; i++) {
			System.out.print(t[i]+" ");
			System.out.println();
		}
	}
	public static void affiche2(int[] t) {
		for (int v : t) {
			System.out.println(v + " | ");
		}
	}
		
	public static int[] somme2(int t1[] , int t2 []) {
		int n = t1.length;
		int res [] = new int [n] ;
		for (int i = 0 ; i<n ; i++) 
		{
			res[i]= t1[i] + t2[i];
		}
		return res;
		}
}

