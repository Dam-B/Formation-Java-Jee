package fr.formation.adaming;

import java.util.Scanner;

public class ExoAlphabet2 {
	public static void main(String[] args) 
		{
		
		char lettre;
		int tempo;
		int nombre;
		String stop;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Combien de fois voulez vous afficher l'aplhabet ?");
		nombre = sc.nextInt();
		
		System.out.println("Jusqu'à quel lettre voulez-vous afficher l'aphabet (en majuscule) ?");
		stop= sc.next();
		
		
		for (int w = 0; w <= nombre; w++) 
		{
			System.out.print(w + " : ");
			
			for (int i = 65; i < 90; i++) 
			{
				
				tempo = i ;
				lettre = (char)tempo;		
				System.out.print(lettre + " ");
		    }
			System.out.print("\n");
		}
		}
	
	
	
	
}
