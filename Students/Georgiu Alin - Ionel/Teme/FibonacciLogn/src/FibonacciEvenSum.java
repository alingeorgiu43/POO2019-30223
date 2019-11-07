import java.util.Scanner;
import java.lang.Math.*;
public class FibonacciEvenSum extends GetFibonacci{
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long sumEvenTermFibo=0;
		
		for(int i=1;i<n;i++)
		{
			long aux = fibonacci(i);
			if(aux%2==0) {
				sumEvenTermFibo = sumEvenTermFibo + aux;
			}
		}
		System.out.println("Sum of even terms is: " + sumEvenTermFibo);
	}

}