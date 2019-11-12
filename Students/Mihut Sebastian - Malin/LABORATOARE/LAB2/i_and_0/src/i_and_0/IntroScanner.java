package i_and_0;

import java.util.Scanner;

public class IntroScanner
{
	public static void main(String[] args) {

		String nume; 
		Scanner in = new Scanner(System.in);
		System.out.println("Care e numele tau, prietene?");			
		nume = in.nextLine(); 
		System.out.println("Du-ma la seful vostru, " + nume);
		System.out.println("\nInput an integer value: ");
		int val = in.nextInt();
		System.out.println("S-a citit: " + val );
		float f;
		System.out.println("\nIntroduceti un numar real: ");
		f = in.nextFloat();
		System.out.println("Numarul de tip float citit este: " + f);
	}
}