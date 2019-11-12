
public class FibonacciEven {
	public static void main(String[] args)
	{
	int n = 4000000;
	int Fib1 = 1,Fib2 = 2, Suma = 0;
	do {
	    if (Fib2 % 2 == 0) 
	    {
	        Suma += Fib2;
	    }
	    int newFib = Fib2 + Fib1;
	    Fib1 = Fib2;
	    Fib2 = newFib;
	    n--;
	} while (Fib2 < n);
	System.out.println(Suma);
	}
}

