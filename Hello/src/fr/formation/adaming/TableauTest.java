package fr.formation.adaming;

public class TableauTest {
	public static void main(String[] args) {
		int[][] tableau1 = { { 1, 2, 3, 4, 5, 6, 7 }, { 8, 9, 10, 11, 12, 13 }, { 14, 15, 16, 17, 18, 19 } };

		for (int i = 0; i < tableau1.length; i++) {
			for (int j = 0; j < tableau1[i].length; j++) {
				System.out.print(tableau1[i][j] + " ");
			}
			System.out.println();
		}
	}

	/**
	 * @param args
	 */
//	public static void main(String[] args) {
//		int[][] tab = new int[4][6];
//		int j = 0;
//		int i;
//		for (i = 0; i < tab.length; i++) {
//			tab[i][j] = i * j;
//			for (j = 0; j < tab.length; j++)
//				System.out.println(tab[i][j] + " | ");
//		}
//	}
}