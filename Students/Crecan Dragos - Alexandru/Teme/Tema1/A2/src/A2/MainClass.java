package A2;

public class MainClass {

	public static void main(String[] args) {
		int fibo1 = 1;
		int fibo2 = 2;
		int fibo3 = fibo1 + fibo2;

		int suma = 0;
		if (fibo1 % 2 == 0)
			suma += fibo1;
		if (fibo2 % 2 == 0)
			suma += fibo2;

		while (fibo3 < 4000000) {
			if (fibo3 % 2 == 0)
				suma += fibo3;
			fibo1 = fibo2;
			fibo2 = fibo3;
			fibo3 = fibo1 + fibo2;
		}

		System.out.println(suma);

	}

}
