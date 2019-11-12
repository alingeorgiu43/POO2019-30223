package A1;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {

		int suma1 = 0;
		for (int i = 0; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0)
				suma1 += i;
		}
		System.out.println("Suma tuturor multiplilor de 3 sau 5 mai mici decat 1000 este: " + suma1 + " .");

		int suma2 = 0;
		Scanner keyboard = new Scanner(System.in);
		int intNr = keyboard.nextInt();
		for (int i = 0; i < intNr; i++) {
			if (i % 3 == 0 || i % 5 == 0)
				suma2 += i;
		}
		System.out.println("Suma tuturor multiplilor de 3 sau 5 mai mici decat " + intNr + " este " + suma2 + " .");
		System.out.println("Pentru numarul 95936 suma acestor numere depasea limita int.");
	}

}
