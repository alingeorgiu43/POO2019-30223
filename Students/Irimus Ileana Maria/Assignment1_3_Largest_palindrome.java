package tema1;

import java.util.Scanner;


public class Assignment1_3_Largest_palindrome {

	public static void main(String[] args) {

		long longPalindrom;
		long longInvers = 0;
		long longCopie;
		long longMaxim = 0;

		//pt 4 cifre: indexNr1 = 9999 si indexNr1 > 999, iar indexNr2 = indexNr1 si indexNr1 > 999
		for (int indexNr1 = 999; indexNr1 > 99; indexNr1--) {
			for (int indexNr2 = indexNr1; indexNr2 > 99; indexNr2--)

			{
				longPalindrom = indexNr1 * indexNr2;
				
				longInvers = 0;
				longCopie = longPalindrom;

				while (longPalindrom > 0) {
					longInvers = (longInvers * 10) + (longPalindrom % 10);
					longPalindrom = longPalindrom / 10;
				}
				
				if (longCopie == longInvers)
					if (longCopie > longMaxim)
						longMaxim = longCopie; 

			}
		}
		System.out.print("Cel mai mare palindrom este " + longMaxim);
	}
}
