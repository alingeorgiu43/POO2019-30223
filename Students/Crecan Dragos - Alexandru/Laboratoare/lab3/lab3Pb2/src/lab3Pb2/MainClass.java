package lab3Pb2;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// avem a*x^2 + b*x + c
		Scanner keyboard = new Scanner(System.in);
		System.out.print("a = ");
		int a = keyboard.nextInt();
		
		System.out.print("b = ");
		int b = keyboard.nextInt();
		
		System.out.print("c = ");
		int c = keyboard.nextInt();
		
		int delta = b * b - (4 * a * c);
		if (delta >= 0) {
			float radacina = findRoot(15,a,b,c);
			System.out.println("Radacina este: " + radacina);
		} else {
			System.out.println("delta = " + delta + " < 0" + " => nu avem radacini reale.");
		}

	}
	
	public static float evaluareExpresie(float x, int a, int b, int c) {
		return a * x * x + b * x + c;
	}
	
	public static float evaluareDerivata(float x, int a, int b) {
		return 2 * a * x + b;
	}
	
	public static float findRoot(float x0, int a, int b, int c) {
		float x1 = x0;
		int contor = 0;
		do {
			x0 = x1;
			x1 = x0 - evaluareExpresie(x0,a,b,c) / evaluareDerivata(x0,a,b);
			contor++;
		} while (Math.abs(x1-x0) > 0.000001f);
		
		System.out.println("Numarul de iteratii este: " + contor);
		
		return x1;
	}

}
