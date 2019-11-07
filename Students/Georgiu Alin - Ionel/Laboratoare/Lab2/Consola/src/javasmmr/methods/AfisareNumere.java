package javasmmr.methods;

import java.util.Scanner;
public class AfisareNumere {
	public static void afisareNumere() {

		int nrInt;
		float nrFloat;
		double nrDouble;

		Scanner in = new Scanner(System.in);

		nrInt = in.nextInt();
		System.out.println("You entered the integer number " + nrInt);
		nrFloat = in.nextFloat();
		System.out.println("You entered the real number " + nrFloat);
		nrDouble = in.nextDouble();
		System.out.println("You entered the real double number " + nrDouble);
	}

}
