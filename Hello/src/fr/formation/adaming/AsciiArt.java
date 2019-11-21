package fr.formation.adaming;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.util.Scanner;

public class AsciiArt {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer une lettre à afficher");
		String T = sc.nextLine();
		int width = 150;
		int height = 10;
		BufferedImage image = new BufferedImage(width, height,BufferedImage.TYPE_INT_RGB);
		Graphics graph = image.getGraphics();
		Graphics2D graph1 = (Graphics2D) graph ;
		graph1.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		graph.drawString(T, 1, 10);
//		graph.drawRect(1, 10, width, height);
		System.out.println("Entrer le style");
	    String o = sc.next();
		for (int y = 0; y < height; y++) {
		    StringBuilder ascii = new StringBuilder();
		    String ajout;
		    for (int x = 0; x < width; x++) {
		    	if (image.getRGB(x, y) == -16777216) {
		    		ajout = " ";
		    	}
		    	else {
		    		ajout = o;
		    	}
		        ascii.append(ajout);
		    }

		    if (ascii.toString().trim().isEmpty()) {
		        continue;
		    }

		    System.out.println(ascii);
		}
	}
}
