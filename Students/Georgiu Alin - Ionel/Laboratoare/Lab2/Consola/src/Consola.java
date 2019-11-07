import java.math.BigInteger;
import java.lang.Math;
import java.util.*;
import javasmmr.methods.*;
public class Consola {

	static void catchError() {
		String s = "43";
		try {
			int val = Integer.parseInt(s);
		} catch (NumberFormatException nx) {
			System.out.println("A intervenit o eroare neasteptata");
		}
	}

	public static void main(String[] args) {
		AfisareNumere.afisareNumere();
		Limits.printIntegerLimits();
		catchError();
		ProblemaBoabelor.solveBoabe();
		float nr1;
		double nr2;
		nr2 = Math.PI;
		nr1 = 25;

		nr2 *= nr1;
		nr1 /= 5.23;

		System.out.printf("Numar corect de zecimale %.6e\n", nr1);
		System.out.printf("Numar de zecimale in exces %.9f\n", nr1);

		System.out.printf("Numar corect de zecimale %.15e\n", nr2);
		System.out.printf("Numar de zecimale in exces %.20e\n", nr2);

		System.out.print(nr1 * 2.9 + nr2 * 87.2);

	}

}
