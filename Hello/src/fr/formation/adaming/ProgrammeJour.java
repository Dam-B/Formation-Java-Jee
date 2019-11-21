package fr.formation.adaming;

import java.util.Scanner;

public class ProgrammeJour {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Scanner scc= new Scanner(System.in);
		int jour;
		int heure;
		System.out.println("Introduire le jour de la semaine (De 1 à 7)");
		jour = sc.nextInt();
		System.out.println("Introduire l'heure pile du jour");
		heure = scc.nextInt();

		switch (jour) 
		{
		
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			if (0< heure && heure<24)
			{
				if ((8 <= heure && 12 <= heure) || (14 <= heure && 18 >= heure)) 
				{
					System.out.println("Bon travail");
					System.out.println( ((jour-1)*24+heure) + " heures ont été écoulées depuis le début de la semaine");
				}
				else
				{
					System.out.println("Bon repos");
					System.out.println(((jour-1)*24+heure) +" heures ont été écoulées depuis le début de la semaine");
				}
			}
			else
			{
			System.out.println("Cette heure n'existe pas !");	
			}
			break;
		case 6:
		case 7:
			System.out.println("Bon Week-End");
		default:
			System.out.println("Ce jour n'existe pas !");
		}
		}

		
	}

