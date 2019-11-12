package pr2;

public class MainClass {
	public static void main(String[] args) {
		int fib[]=new int[15];
		fib[0] = 1;
		fib[1] = 2;
		int sum = fib[1];
		for(int i=2; i<15; i++)
		{
			fib[i] = fib[i-1] + fib[i-2];
			if(fib[i] % 2 == 0 && (fib[i]<4000000))
				sum = sum + fib[i];
		}
		
		System.out.println(sum);
		
}
}