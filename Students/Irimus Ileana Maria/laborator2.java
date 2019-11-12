package laborator2;

import java.math.BigInteger;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		/*try {

			String value;
			value = "1.4358568";
			int intNr = Integer.parseInt(value);
			double doubleNr = Double.parseDouble(value);

		} catch (NumberFormatException exception) {
			System.out.println("exceptie");
		}*/
		
		
		/*
		if(value1 == value2) //compara adresele
			System.out.println("true");
		else
			System.out.println("false");
		
		if(value1.equals(value2))//compara valorile
			System.out.println("true");
		else
			System.out.println("false");*/
		
		//ex 6.1
		System.out.println("Hello world");
		
		//ex 6.2
		Scanner keyboardInput = new Scanner(System.in);
		int integerNr;
		double doubleNr;
		
		System.out.println("Introduceti intregul ");
		integerNr = keyboardInput.nextInt();
		
		System.out.println("Introduceti realul ");
		doubleNr = keyboardInput.nextDouble();
		
		System.out.println("Numerele introduse sunt:  "+integerNr + ", "  +doubleNr);
		
		//ex 6.3
		
		System.out.println(Byte.MAX_VALUE+1);
		System.out.println(Short.MAX_VALUE+1);
		System.out.println(Integer.MAX_VALUE+1);
		System.out.println(Long.MAX_VALUE+1);
		
		System.out.println(Byte.MAX_VALUE-1);
		System.out.println(Short.MAX_VALUE-1);
		System.out.println(Integer.MAX_VALUE-1);
		System.out.println(Long.MAX_VALUE-1);
		
		float floatNr = 6.487646527647592f;
		System.out.println(floatNr); 
		
		float floatNr1 = 10.00434400099987f;
		float floatNr2 = 36.0002252058763f;
		System.out.println(floatNr1+floatNr2);
		
		//ex 6.4
		
		//v1
		
		BigInteger sumaFinala;
		sumaFinala = BigInteger.valueOf(1);//2^0 
		
		BigInteger termenIntermediar;
		termenIntermediar = BigInteger.valueOf(1);
		
		for(int putere = 1;putere<=63;putere++)
		{
			termenIntermediar = termenIntermediar.multiply(BigInteger.valueOf(2));
			sumaFinala = sumaFinala.add(termenIntermediar);
		}
		System.out.println("In total sunt " + sumaFinala + " boabe de grau pe tabla de sah.");
		
		//v2
		
		BigInteger sumaFinala1 = BigInteger.valueOf(2);
		System.out.println("In total sunt " + sumaFinala1.pow(64).subtract(BigInteger.valueOf(1)) + " boabe de grau pe tabla de sah."); 
		//2^0+2^1+2^2+2^3+...+2^63 = 2^64 -1;  
			
	}
}

