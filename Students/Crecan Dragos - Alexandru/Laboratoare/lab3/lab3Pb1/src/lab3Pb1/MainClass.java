package lab3Pb1;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("m = ");
		int m = keyboard.nextInt();
		System.out.println();

		System.out.print("n = ");
		int n = keyboard.nextInt();
		System.out.println();

		if (m < n) {
			for (int i = m; i <= n; i++) {
				if (i % 2 == 0) {
					for (int termen1 = 2; termen1 <= i; termen1++) {
						if (isPrimeNumber(termen1) == true) {
							int termen2 = i - termen1;
							if (termen2 >= termen1 && isPrimeNumber(termen2) == true) {
								System.out.println(i + " = " + termen1 + " + " + termen2);
							}
						}
					}
				}
			}
		}

	}

	public static boolean isPrimeNumber(int number) {
		boolean ok = true;
		for (int divizor = 2; divizor <= number / 2; divizor++) {
			if (number % divizor == 0) {
				ok = false;
			}
		}
		return ok;
	}

}
