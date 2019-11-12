package A4;

public class MainClass {

	public static void main(String[] args) {
		int n = 7;
		int[][] a = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				a[i][j] = 0;
		}

		int maxNr = n*n;
		int limitaStanga = 0;
		int limitaSus = 0;
		int limitaDreapta = n-1;
		int limitaJos = n-1;
		float contorNumerePrime = 0;

		while (maxNr > 0) {
			for (int i = limitaJos; i >= limitaStanga; i--) {
				a[limitaJos][i] = maxNr;
				if (i == limitaStanga && isPrimeNumber(maxNr) == true && maxNr >= 3) {
					contorNumerePrime++;
				}
				maxNr--;
			}

			limitaJos--;

			for (int i = limitaJos; i >= limitaSus; i--) {
				a[i][limitaStanga] = maxNr;
				if (i == limitaSus && isPrimeNumber(maxNr) == true && maxNr >= 3) {
					contorNumerePrime++;
				}
				maxNr--;
			}

			limitaStanga++;

			for (int i = limitaStanga; i <= limitaDreapta; i++) {
				a[limitaSus][i] = maxNr;
				if (i == limitaDreapta && isPrimeNumber(maxNr) == true && maxNr >= 3) {
					contorNumerePrime++;
				}
				maxNr--;
			}

			limitaSus++;

			for (int i = limitaSus; i <= limitaJos; i++) {
				a[i][limitaDreapta] = maxNr;
				if (i == limitaJos && isPrimeNumber(maxNr) == true && maxNr >= 3) {
					contorNumerePrime++;
				}
				maxNr--;
			}

			limitaDreapta--;

		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] < 10)
					System.out.print(" ");
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		float impartitor = 2 * n - 1;
		float ratio = (contorNumerePrime / impartitor) * 100;
		//int ratie = (int) ratio;
		System.out.println(ratio);
		

	}
	
	public static boolean isPrimeNumber(int intNumber) {
		boolean ok = true;
		int divizor = 2;
		while (divizor <= intNumber / 2 && ok == true) {
			if (intNumber % divizor == 0) {
				ok = false;
			}
			divizor++;
		}
		return ok;
	}

}