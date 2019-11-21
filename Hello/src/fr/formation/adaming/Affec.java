package fr.formation.adaming;

public class Affec {
public static void main (String args[]) {
	final int N = 4;
	int t1 [] = new int [N];
	int t2 [] = new int [N];
	for (int i=0;i<N;i++) {
		t1[i] = i+1;
		t2[i] = 2*i+1;	}
		// affichage des valeurs de t1 et t2
		System.out.print("t1 = ");
		for (int j= 0 ;j<N;j++)
		System.out.print(t1[j] + " ");
		System.out.println();
		System.out.print("t2 = ");
		for (int a = 0 ; a<N ; a++)
		System.out.print(t2[a] + " ");
		
	t1 = t2 ;
	t1[0] = 10 ; t2 [1] = 20 ; t1 [2] = 30 ; t2 [3] = 40;
		
		// affichage des valeurs de t1 et de t2
		System.out.println();
		affichage(t1);
		System.out.println();
		affichage(t2);
}


public static void affichage (int tableau []) {
	System.out.print("Table = ");
	for (int j = 0 ; j<tableau.length ; j++) {
		System.out.print(tableau[j] + " ");
	}	
}


}


