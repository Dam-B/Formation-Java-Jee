package ExoHéritage4;

public class A {
	public A(int nn) {
		System.out.println("Entree Constr A - n= "+n+" p = "+p);
		n=nn;
		System.out.println("Sortie Constr A - n= "+n+ " p = "+p);
	}
	public int n;
	public int p=10;
}
