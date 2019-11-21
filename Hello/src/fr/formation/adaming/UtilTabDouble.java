package fr.formation.adaming;

public class UtilTabDouble {
	public static void main(String [] args) {
		double t[][]= {{1,2,3,4,5}, {1,2,3,4,5}, {1,2,3,4,5}};
		double t1[][]= {{1,2,3,4,5}, {1,2,3,4,5}, {1,2,3,4,5}};
		double[][] tab = somme(t,t1);
		affiche(tab);
		System.out.println(tab);
	}
	public static int[] affiche(double t[][]) {
// double boucles pour l'affichage des tableaux n dimensions
	for (int i = 0; i < t.length; i++) {
		for (int j = 0; j < t[i].length; j++) {
			System.out.print(t[i][j] + " ");
		}
		System.out.println();
	}
	return null;
	
}
	public static boolean regulierboolean(double t2 [][]) {
		boolean b = true;
		for (int i = 0; i< t2.length -1; i++)
		{
			for (int j=0 ; j< t2[i].length ; j++) {
				
			if (t2[1].length != t2[i].length) {
				b= false;	
			}
		}
		}	
//		System.out.println(b);
		return b;
	}
	public static double [] sommeLignes(double t [][]) {
		double[] td = new double[t.length];
		
		for (int i = 0 ; i < t.length ; i++) {
			for(int j = 0 ; j < t[i].length ; j++) {
				td[i] += t[i][j];
			}
		}
		return td;
		
		
	}
	public static double [][] somme(double [][] t1, double [][] t2) {
		double [][] t3 = new double [t1.length][t1[1].length];
		if (regulierboolean(t1) == true && regulierboolean(t2) == true) {
			if (t1.length == t2.length) {
				for (int i = 1 ; i < t1.length; i++) {
					for(int j = 1 ; j < t1[i].length ; j++) {
						if (t1[i].length == t2[i].length) {
							t3[i][j] = t1[i][j] + t2 [i][j];
						}
					}
				}
			}
		}
		return t3;
	}

}
