
public class GoldbachClass{
	public static void goldbach(int n) {

		if (n < 2) {
			System.out.println("numarul introdus e mai mic decat 2");
			return;
		}

		if (n % 2 != 0) {
			System.out.println("numarul introdus e impar");
			return;
		}

		for (int i = 2; i <= n / 2 + 1; i++) {
			if (PrimeNumber.isPrime(i) && PrimeNumber.isPrime(n - i)) {
				System.out.println(i + "+" + (n - i));
			}

		}
	}
}
