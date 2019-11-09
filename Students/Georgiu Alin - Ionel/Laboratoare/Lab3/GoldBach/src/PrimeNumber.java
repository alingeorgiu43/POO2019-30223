
public abstract class PrimeNumber {
	public static boolean isPrime(int n) {
		int prim = 1;

		if (n < 2)
			prim = 0;
		if (n % 2 == 0 && n > 2)
			prim = 0;
		for (int d = 3; d * d <= n && prim == 1; d++)
			if (n % d == 0)
				prim = 0;
		if (prim == 0)
			return false;
		return true;
	}
}
