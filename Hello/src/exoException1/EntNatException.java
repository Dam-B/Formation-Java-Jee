package exoException1;

@SuppressWarnings("serial")
public class EntNatException extends Exception {

	public EntNatException(int l) {
		
		System.out.println("Vous avez rentré une valeur qui ne convient pas");
		System.out.println("Nombre rentré : " + l);
	}
}
