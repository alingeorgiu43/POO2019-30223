package lab2;

import java.math.BigInteger;
import java.util.*;

public class Probleme_Boabe {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("i= ");
		int i = in.nextInt();

		BigInteger nr;
		nr = BigInteger.valueOf(2);
			
		nr=nr.pow(i-1);
		
		System.out.println("numarul de boabe este: " + nr);
		
	}

}
