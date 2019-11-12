package fibonacci_even_sum;

public class Fibo {

	public static void main(String[] args) {
		int fibo1 = 1;
		int fibo2 = 2;
		long sum=0;
		while(fibo1 <4000000 && fibo2<4000000) {
			int aux;
			aux = fibo1;
			fibo1 = fibo2;
			fibo2 = fibo2+aux;
			if(fibo1 % 2==0) {
				sum=sum+fibo1;
			}
		}
		System.out.println(sum);
	}
}
