package exoCollection5;

import java.util.TreeSet;

public class AppListeTiee {
	public static void main(String []args) {
		ListeTiee tab1 = new ListeTiee(tab);
		
		String c1 = new String("Ajoute");
		String c2 = new String("Des");
		String c3 = new String ("Mots");
		String c4 = new String("OKLMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
		String c5 = new String ("Allo");
		
		ListeTiee.ajoute(c1);
		ListeTiee.ajoute(c2);
		ListeTiee.ajoute(c3);
		ListeTiee.ajoute(c4);
		ListeTiee.ajoute(c5);
		
		tab1.affiche();	
	}
}
