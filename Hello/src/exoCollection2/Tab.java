package exoCollection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;



public class Tab {
	public static void main(String []args) {
		ArrayList<Integer> tab = new ArrayList<Integer>();
		tab.add(5);
		tab.add(10);
		tab.add(8);
		tab.add(19);
		tab.add(-15);
		tab.add(-9);
		tab.add(7);
		tab.add(21);
		tab.add(-10);
		
// Affichage du tableau + tri dans l'ordre numérique inverse	
//		System.out.println(tab);
		Collections.sort(tab, Collections.reverseOrder());
		System.out.println(tab);
		
		
// Affichage des valeurs pairs
//		Iterator<Integer> it = tab.iterator();
//		while(it.hasNext()) {
//			if (it.next()%2 != 0) {
//				it.remove();
//				i--;
//			}
//		}
//		System.out.println(tab);
		
// Remise  à zéro des valeurs négative
		for (int i = 0 ; i < tab.size(); i++) {
				
			if (tab.get(i) < 0) {
			tab.set(i,0);
			}
		}
		System.out.println(tab);
		
		
		}
		
		
		
}
