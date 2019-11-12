import java.util.stream.IntStream;

public class SumOfMultiples {
	public static void main(String[] args) 
	{
		int suma = IntStream.range(0, 1000)
				.filter(a -> a%3==0 || a%5==0)
				.sum();
	    System.out.println(suma);
	}
}
