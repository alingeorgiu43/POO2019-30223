package javasmmr.methods;

import java.math.BigInteger;
public class Limits {
	public static void printIntegerLimits() {

		int integerMaximValue = Integer.MAX_VALUE;
		double realMaximValue = Double.MAX_VALUE;

		BigInteger nr1, nr2;

		nr1 = BigInteger.valueOf(Integer.MAX_VALUE); 
		nr2 = BigInteger.valueOf(300); 
		nr1 = nr1.add(nr2); 
		System.out.println("Value for nr1 " + nr1);

		System.out.println("Maximum int value " + integerMaximValue);
		System.out.println("Maxim double value " + realMaximValue);

	}
}
