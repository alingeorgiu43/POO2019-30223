import java.math.BigDecimal;

public class MatrixOperations {
	public static BigDecimal[][] add(BigDecimal[][] a, BigDecimal[][] b) {
		BigDecimal[][] c = new BigDecimal[100][100];

		int rowsa = a.length;
		int colsa = a[0].length;
		int rowsb = b.length;
		int colsb = b[0].length;
		if (rowsa != rowsb || colsa != colsb) {
			System.out.println("Operation cannot be done, check matrices");
			return null;
		}
		for (int i = 0; i < rowsa; i++) {
			for (int j = 0; j < colsa; j++) {
				c[i][j] = a[i][j].add(b[i][j]);
			}
		}
		return c;
	}

	public static BigDecimal[][] subtract(BigDecimal[][] a, BigDecimal[][] b) {
		BigDecimal[][] c = new BigDecimal[100][100];

		int rowsa = a.length;
		int colsa = a[0].length;
		int rowsb = b.length;
		int colsb = b[0].length;
		if (rowsa != rowsb || colsa != colsb) {
			System.out.println("Operation cannot be done, check matrices");
			return null;
		}
		for (int i = 0; i < rowsa; i++) {
			for (int j = 0; j < colsa; j++) {
				c[i][j] = a[i][j].subtract(b[i][j]);
			}
		}
		return c;
	}

	public static BigDecimal[][] multiply(BigDecimal[][] a, BigDecimal[][] b) {
		BigDecimal[][] c = new BigDecimal[100][100];

		int rowsa = a.length;
		int colsa = a[0].length;
		int rowsb = b.length;
		int colsb = b[0].length;
		if (rowsa != rowsb || colsa != colsb) {
			System.out.println("Operation cannot be done, check matrices");
			return null;
		}
		for (int i = 0; i < rowsa; i++) {
			for (int j = 0; j < colsa; j++) {
				for (int k = 0; k < colsa; k++) {
					c[i][j] = c[i][j].add(a[i][k].multiply(b[k][j]));
				}
			}
		}
		return c;
	}

	public static BigDecimal[][] multiplyByScalar(BigDecimal[][] a, int k) {

		int rowsa = a.length;
		int colsa = a[0].length;

		for (int i = 0; i < rowsa; i++) {
			for (int j = 0; j < colsa; j++) {
				a[i][j].multiply(BigDecimal.valueOf(k));
			}
		}
		return a;
	}

	static BigDecimal determinant(BigDecimal[][] a, int n) {
		BigDecimal[][] aux = new BigDecimal[n][n];
		BigDecimal delta = new BigDecimal("0");
		BigDecimal coef = new BigDecimal("1");
		BigDecimal coef2 = new BigDecimal("-1");

		if (n == 1)
			delta = a[1][1];
		else {
			for (int k = 1; k <= n; k++) {
				for (int i = 2; i <= n; i++)
					for (int j = 1; j <= n; j++) {
						if (j < k)
							aux[i - 1][j] = a[i][j];
						if (j > k)
							aux[i - 1][j - 1] = a[i][j];
					}
				BigDecimal aux1 = a[1][k];
				aux1.multiply(coef);
				delta.add(aux1.multiply(determinant(aux, n - 1)));
				coef.multiply(coef2);
			}
		}
		return delta;
	}

	public static void areEqual(BigDecimal[][] a, BigDecimal[][] b) {
		int ok = 1;
		int rowsa = a.length;
		int colsa = a[0].length;
		int rowsb = b.length;
		int colsb = b[0].length;
		if (rowsa != rowsb || colsa != colsb) {
			System.out.println("Operation cannot be done, check matrices");
			return;
		}

		for (int i = 0; i < rowsa; i++)
			for (int j = 0; j < colsa; j++)
				if (a[i][j] != b[i][j])
					ok = 0;
		if (ok == 1)
			System.out.println("Matrices are equal");
		else
			System.out.println("Matrices are not equal");
	}

	public static void isZeroMatrix(BigDecimal[][] a) {
		int rowsa = a.length;
		int colsa = a[0].length;
		for (int i = 0; i < rowsa; i++)
			for (int j = 0; j < colsa; j++)
				if (a[i][j].intValue() != 0) {
					System.out.println("Matrix does not contain only 0s.");
					return;
				}
		System.out.println("Matrix contains only 0s");
	}

	public static void isIdenitityMatrix(BigDecimal[][] a) {
		int rowsa = a.length;
		for (int i = 0; i < rowsa; i++)
			if (a[i][i].intValue() != 1) {
				System.out.println("Matrix is not an identity matrix");
				return;
			}
		System.out.println("Matrix is an identity matrix");
	}

	public static float fillDegree(BigDecimal[][] a) {
		float k = 0;
		BigDecimal c = new BigDecimal("0");
		int rowsa = a.length;
		int colsa = a[0].length;
		for (int i = 0; i < rowsa; i++)
			for (int j = 0; j < colsa; j++) {
				if (a[i][j].compareTo(c) == 0)
					k = k + 1;
			}
		return k / rowsa / rowsa;
	}

	public static void printMatrix(BigDecimal[][] a) {
		int rowsa = a.length;
		int colsa = a[0].length;
		for (int i = 0; i < rowsa; i++) {
			for (int j = 0; j < colsa; j++) {
				 System.out.print(a[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

}
