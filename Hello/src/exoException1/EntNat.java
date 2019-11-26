package exoException1;
//R�aliser une classe EntNat permettant de manipuler des entiers naturels (positifs ou nuls). 
//Pour l�instant, cette classe disposera simplement : 

public class EntNat extends Exception{
	
	public int l;
	
//	1_ d�un constructeur � un argument de type int qui g�n�rera une exception de typeErrConst
//	(type classe � d�finir) lorsque la valeur re�ue ne conviendra pas,
	
	public EntNat(int l) throws EntNatException {
		if(l < 0) {
			throw new EntNatException(l);
		}	
	}

//	2_ d�une m�thode getN fournissant sous forme d�un int, la valeur encapsul�e dans un objet de type EntNat.


	@Override
	public String toString() {
		return "EntNat = " + getN();
	}

	public int getN() {
		return l;
		
	}
//	�crire un petit programme d�utilisation qui traite l�exception ErrConst en affichant un message et en interrompant l�ex�cution.
}
