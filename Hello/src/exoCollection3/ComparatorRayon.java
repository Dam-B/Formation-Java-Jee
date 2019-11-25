package exoCollection3;

import java.util.Comparator;

public abstract class ComparatorRayon implements Comparator<Cercle> {
	
	public static Comparator<Cercle> CompareRayon = new Comparator<Cercle>() {
	public int compare(Cercle c1, Cercle c2) {
		return (int) (c1.getRayon() - c2.getRayon());
	}
	};
}
