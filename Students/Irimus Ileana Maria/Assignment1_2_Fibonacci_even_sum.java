package tema1;

import java.util.Scanner;

public class Assignment1_2_Fibonacci_even_sum {


	public static void main(String[] args) {

		Scanner keyboardInput = new Scanner(System.in);
		int intNr;

		System.out.println("Introduceti numarul ");
		intNr = keyboardInput.nextInt();

		long termen1 = 1;
		long termen2 = 2;
		long termenUrmator = termen1 + termen2;
		long sumaPari = 0;
		for(int index = 1;index < intNr; index++) 
		{
			termenUrmator = termen1 + termen2;
			termen1 = termen2;
			termen2 = termenUrmator;
			
			if ( termen1 % 2 == 0 && termen2 < 4000000)
				sumaPari = sumaPari + termen1;

		}
		//System.out.println("Termenul2 este " + termen2);
		System.out.print("Suma termenior pari este " + sumaPari);

	}


	}

}
