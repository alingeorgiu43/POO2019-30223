import java.math.BigInteger;
import java.util.Scanner;

public class NumScanner 
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Introdu un numar intreg:");
		int n=input.nextInt();
		System.out.print("Introdu un numar cu virgula:");
		double f=input.nextDouble();
		System.out.println(n);
		System.out.println(f);
	}
}
