package exoCollection3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class AppCercle {
	public static void main(String []args) {
		ArrayList<Cercle> tab = new ArrayList<Cercle>();
		
		Cercle c1 = new Cercle(1,2,5.3);
		Cercle c2 = new Cercle(2,2,5.2);
		Cercle c3 = new Cercle(3,2,15);
		Cercle c4 = new Cercle(4,2,2);
		Cercle c5 = new Cercle(5,2,4);
		Cercle c6 = new Cercle(6,2,3);
		Cercle c7 = new Cercle(7,2,9);
		
		tab.add(c1);
		tab.add(c2);
		tab.add(c3);
		tab.add(c4);
		tab.add(c5);
		tab.add(c6);
		tab.add(c7);
		
		
		Collections.sort(tab, new ComparatorRayon());
		for(Cercle c:tab)
			c.affiche();
		
		
		
		Collections.sort(tab,  Cercle.ComparatorCercle);
		System.out.println("Liste des cercles rangés par rayon croissant");
		for (Cercle c:tab)
			c.affiche();
		System.out.println();
		Collections.sort(tab, Cercle.ComparatorCercle2);
		System.out.println("Liste des cercles rangés par abscisse croissant");
		for(Cercle c:tab)
			c.affiche();
		
		
//		Collections.sort(tab, getRayon());


	
	}
	}


