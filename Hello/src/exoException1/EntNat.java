package exoException1;
//Réaliser une classe EntNat permettant de manipuler des entiers naturels (positifs ou nuls). 
//Pour l’instant, cette classe disposera simplement : 

public class EntNat extends Exception{
	
	public int l;
	
//	1_ d’un constructeur à un argument de type int qui générera une exception de typeErrConst
//	(type classe à définir) lorsque la valeur reçue ne conviendra pas,
	
	public EntNat(int l) throws EntNatException {
		if(l < 0) {
			throw new EntNatException(l);
		}	
	}

//	2_ d’une méthode getN fournissant sous forme d’un int, la valeur encapsulée dans un objet de type EntNat.


	@Override
	public String toString() {
		return "EntNat = " + getN();
	}

	public int getN() {
		return l;
		
	}
//	Écrire un petit programme d’utilisation qui traite l’exception ErrConst en affichant un message et en interrompant l’exécution.
}
