package exoException1;

@SuppressWarnings("serial")
public class EntNatException extends Exception {

	public EntNatException(int l) {
		
		System.out.println("Vous avez rentr� une valeur qui ne convient pas");
		System.out.println("Nombre rentr� : " + l);
	}
}
