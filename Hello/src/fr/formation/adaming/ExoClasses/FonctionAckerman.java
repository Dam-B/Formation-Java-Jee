package fr.formation.adaming.ExoClasses;

public abstract class FonctionAckerman {

	
	public static void getFonctionAckerman(int m , int n) {
		if (m>0 | n>0) {
			if (m == 0) {
				System.out.println(" A ("+n+") = "+ (++n) + ".");
			}
			else {
				System.out.println(" A ("+m+") = A(" + (--m) + ".");
			}
		}
		else if ( m > 0 && n > 0) {
			System.out.println("A ("+m+", "+n+") = A("+(--m)+", A("+m+", "+(--n)+")");
		}
	}
}
