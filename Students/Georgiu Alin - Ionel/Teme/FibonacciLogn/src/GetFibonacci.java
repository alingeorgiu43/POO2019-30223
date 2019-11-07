public abstract class GetFibonacci{
	
	public static long fibonacci(int n)
	{
		int five=5;
		double term1 = (1+Math.sqrt(five)) / 2;
		double term2 = (1-Math.sqrt(five)) / 2;
		double fibo = (Math.pow(term1, n) - Math.pow(term2, n)) / Math.sqrt(five);
		return (long) Math.ceil((long)fibo);
	}
}
