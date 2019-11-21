package fr.formation.adaming;

import java.util.Arrays;
import java.util.Scanner;

public class Carac {
	public static void main(String [] args) {
	}
	public static char unsurdeux(char []args) {
		String a;
		char b = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez entrer un mot");
		a = sc.nextLine();
		int t = a.length();
		
		for (int i= 0 ; i < t ; i = i+2) {
			b = a.charAt(i);
			System.out.print(b +" ");
		}
		return b;
	}
	public static void premierdernier(char []args) {
		String a;
		char b = 0;
		char c = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuiller entrer un mot");
		a = sc.next();
		b = a.charAt(0);
		c = a.charAt(a.length() - 1);
		
		System.out.print("Le premier caractère est : "+ b +" et les dernier caractère est : "+c);
	}
	public static void premierdernierdeux(String [] args) {
		String chaine = "totoA"; // chaine recoit toto
        int taille = chaine.length(); // taille recoit le nombre de lettre de chaine
        System.out.println("nombre de lettre du mot " + chaine + " est : " + taille);
        // affichage de chaine et de la taille de chaine
         
        String chaineDeb = chaine.substring(0,1);
        String chaineFin = chaine.substring(chaine.length()-1);
        System.out.println("la premiere lettre du mot " + chaine + " est " + chaineDeb + "et la derniere lettre est : " + chaineFin);
	}
	public static void lectureverticale(char[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Donnez un nombre entier :");
		int a = sc.nextInt();
		String b = String.valueOf(a);
		char c = 0;
		for(int i=0; i< b.length() ;i++) {
			c = b.charAt(i);
			System.out.println(c);
		}
	}
	public static void voyelle(char[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Donnez un mot");
		String a = sc.next();
		char o = 0;
		
		int nba= 0;
		int nbe = 0;
		int nbi = 0;
		int nbo = 0;
		int nbu = 0;
		int nby = 0;
		
		for (int i=0 ; i < a.length(); i++) {
			o = a.charAt(i);
			if (o == ('a') | o ==('A') ) {
				nba = nba +1;
			}
			else if (o == ('e') | o ==('E') ) {
				nbe = nbe +1;
			}
			else if (o == ('i') | o ==('I') ) {	
				nbi = nbi +1;
			}
			else if (o == ('o') | o ==('O') ) {
				nbo = nbo +1;
			}
			else if (o == ('u') | o ==('U') ) {
				nbu = nbu +1;
			}
			else if (o == ('y') | o ==('Y') ) {
				nby = nby +1;
			}
		}
		System.out.println("Le mot comporte "+ "\n"+ nba + " la lettre a" +"\n"+ nbe + " la lettre e "+ "\n"+nbi+" la lettre i"+"\n"+nbo+" la lettre o"+"\n"+ nbu+ " la lettre u"+"\n"+nby+" la lettre y");
		
	}
	public static void verbe(char[]args) {
		while(true) {		
			Scanner sc = new Scanner(System.in);
			System.out.println("Veuillez entrer un verbe du premier groupe à l'infinitif ");
			String verbe = sc.next();
			String terminaison = verbe.substring(verbe.length()-2,verbe.length());
			String debutverbe= verbe.substring(0,verbe.length()-2);

			if (terminaison.equalsIgnoreCase("er")){
				System.out.println("je "+ debutverbe + "e"+"\n"+ "tu " + debutverbe + "es" + "\n" + "il/elle "+ debutverbe + "e" + "\n" + "nous " + debutverbe + "ons" + "\n" + "vous " + debutverbe + "ez" +"\n" + "ils/elles " + debutverbe + "ent");
				break;
			}
			else {
				System.out.println("Ce n'est pas un verbe du 1er groupe. Recommencer");
			}
	}
	}
	public static void ordrealphabétique(char[]args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Combien de mots vouslez-vous écrire ?");
		n = sc.nextInt();
		String t[] = new String [n];
		for (int i=0 ; i < t.length ; i++) {
			System.out.println("Veuillez entrer le "+ (i+1) +" mot");
			t[i]=sc.next();	
		}
		for(String s : t) {
			System.out.println(s);
		}
		Arrays.sort(t);
		System.out.println("Liste par ordre alphabétique :");
		for (int i = 0 ; i < t.length ; i++) {
			System.out.println(t[i]+" ");
		}
		
	}
}

