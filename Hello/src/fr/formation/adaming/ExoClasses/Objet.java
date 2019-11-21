package fr.formation.adaming.ExoClasses;

import java.util.Scanner;

public class Objet {
	private int ident;
	private static int t;

	public Objet() {
		t++;
		this.ident = t - 1;
	}

	public int getIdent() {
		return ident;

	}

	public static int getIdentMax() {
		return t - 1;

	}

	public int setIdentMax(int i) {
		i = this.t - 1;
		return i;
	}

	public static int identZero() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Veuillez entrer une valeur positive initiale");
			t = sc.nextInt();

		} while (t < 0);
		return t;
	}
}
