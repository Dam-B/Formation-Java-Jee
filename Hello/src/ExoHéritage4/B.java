package ExoH�ritage4;

public class B extends A {
	public B(int n, int pp) {
		super(n);
		System.out.println("Entr�e Constr B - n= "+n+" p = "+p+ " q = "+q);
		p=pp;
		q=2*n;
		System.out.println(("Sortie Constr B - n = "+n+ " p = "+p+" q = "+q));
	}
	public int q=25;
}
