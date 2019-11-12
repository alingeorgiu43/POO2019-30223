package tema1;

import java.util.Scanner;

//int sumaMultiplii = > overflow pt numarDat >= 10^5
//long sumaMultiplii => overflow pt numarDat >= 10^10

public class Assignment1_1_Sum_of_multiples {

	public static void main(String[] args) {

		// int sumaMultiplii = 0;
		long sumaMultiplii = 0;

		Scanner keyboardInput = new Scanner(System.in);
		int numarDat;

		System.out.println("Introduceti numarul ");
		numarDat = keyboardInput.nextInt();

		for (int index = 3; index < numarDat; index++)
			if (index % 3 == 0 || index % 5 == 0)
				sumaMultiplii = sumaMultiplii + index;

		if (numarDat == 3)
			System.out.println("Suma multiplilor de 3 sau 5 este 3");
		else
			System.out.println("Suma multiplilor de 3 sau 5 este " + sumaMultiplii);
	}

}
