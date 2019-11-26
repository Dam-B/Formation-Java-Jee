package exoCollection3;

import java.util.Comparator;

public class ComparatorRayon implements Comparator<Cercle> {
	
	
	public int compare(Cercle c1, Cercle c2) {
		return Double.compare(c1.getRayon(), c2.getRayon());
	}

}
