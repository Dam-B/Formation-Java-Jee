package exoCollection5;
import java.util.TreeSet;
//R�aliser une classe nomm�e ListeTiee permettant de manipuler une liste de chaine de caract�res, 
//en s'arrangeant pour qu'elle soit tri�e en permanence. 
//Outre le constructeur, on la dotera des m�thodes : 


public class ListeTiee {
	
public ListeTiee(TreeSet<String> tab) {
	ListeTiee.tableau=tab;
}

//1_ ajoute qui ajoute un nouvel �l�ment � la bonne place.
public static void ajoute(String mot) {
	tableau.add(mot);

	
}
//2_ affiche qui affiche les �l�ments de la liste.
public void affiche(){
	System.out.println(tableau);
}

public String getMot() {
	return mot;
}


private static TreeSet<String> tableau;
private String mot;
}
