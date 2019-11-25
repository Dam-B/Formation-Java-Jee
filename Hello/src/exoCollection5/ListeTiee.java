package exoCollection5;
import java.util.TreeSet;
//Réaliser une classe nommée ListeTiee permettant de manipuler une liste de chaine de caractères, 
//en s'arrangeant pour qu'elle soit triée en permanence. 
//Outre le constructeur, on la dotera des méthodes : 


public class ListeTiee {
	
public ListeTiee(TreeSet<String> tab) {
	ListeTiee.tableau=tab;
}

//1_ ajoute qui ajoute un nouvel élément à la bonne place.
public static void ajoute(String mot) {
	tableau.add(mot);

	
}
//2_ affiche qui affiche les éléments de la liste.
public void affiche(){
	System.out.println(tableau);
}

public String getMot() {
	return mot;
}


private static TreeSet<String> tableau;
private String mot;
}
