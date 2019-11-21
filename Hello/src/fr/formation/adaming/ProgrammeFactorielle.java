package fr.formation.adaming;

import java.util.Scanner;

public class ProgrammeFactorielle 
{
	public static void main(String[] args) 
	{
		int intermediaire;
		int nombre;
		int factoriel;
		String reponse;
		
		do  
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduire la valeur à calculer");
			nombre = sc.nextInt();
				if (nombre >= 0)
				{
					factoriel = 1;
						for (intermediaire = 1; intermediaire < nombre; intermediaire++)
						{
							factoriel = factoriel * intermediaire;
						}
					System.out.println("Le factorielle de "+nombre+ " est " + factoriel );	
				}
				else
				{
					System.out.println("Le nombre introduit n'est pas correct");
				}		
		System.out.println("Voulez-vous continuer (Appuyer sur Q pour quitter)");
		reponse= sc.next();
		}
		while ((!reponse.equals("Q")) && (!reponse.equals("q")));

		}
		

	public static void main(int nbLigne, char var) 
	{
		for(int j = 0; j< nbLigne; j++) {
			System.out.print(j+ " :");
			for ( char c = 'A'; c<= var; c++) {
				System.out.print(" "+c);
			}
		}
	}
}
			
	



