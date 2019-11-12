package A3;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Dati numarul de cifre: ");
		int nrCifre = keyboard.nextInt();

		if (nrCifre <= 0) {
			System.out.println("Imposibil!");
		} else {
			int intMaxNbr1 = ridicareLaPuterePozitiva(10, nrCifre) - 1;
			int intMaxNbr2;
			int intMinNbr = ridicareLaPuterePozitiva(10, nrCifre - 1);
			int intCont = 0;
			int intCont2 = 0;

			while (intCont == 0 && intMaxNbr1 >= intMinNbr) {
				intMaxNbr2 = ridicareLaPuterePozitiva(10, nrCifre) - 1;
				while (intCont == 0 && intMaxNbr2 >= intMinNbr) {
					intCont2++;
					int intProdus = intMaxNbr1 * intMaxNbr2;
					if (isNbrPalindrome(intProdus) == true) {
						intCont++;
						System.out.println(intMaxNbr1);
						System.out.println(intMaxNbr2);
						System.out.println(intProdus);
					}
					intMaxNbr2--;
				}
				intMaxNbr1--;
			}
			
			if (intCont == 0)
				System.out.println("Niciun numar palindrom nu este produsul a doua numere de " + nrCifre + " cifre!");

		}
	}

	public static boolean isNbrPalindrome(int intNr) {

		int intAux = intNr;
		int intInvers = 0;
		while (intAux > 0) {
			intInvers = intInvers * 10 + intAux % 10;
			intAux /= 10;
		}

		if (intNr == intInvers)
			return true;
		else
			return false;

	}

	public static int ridicareLaPuterePozitiva(int baza, int exponent) {
		int result = 1;
		for (int i = 1; i <= exponent; i++)
			result *= baza;

		return result;
	}

}
