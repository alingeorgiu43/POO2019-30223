
import java.math.BigDecimal;
import java.util.Scanner;

public class MatrixOperations {
	public final static int linii = 4;
	public final static int coloane = 4;

	static BigDecimal[][] init(BigDecimal matrix[][]) {
		for (int i = 0; i < linii; i++)
			for (int j = 0; j < coloane; j++)
				matrix[i][j] = BigDecimal.valueOf(0);
		return matrix;
	}

	public static BigDecimal[][] add(BigDecimal matrix1[][], BigDecimal matrix2[][]) {
		BigDecimal matrixRez[][] = new BigDecimal[linii][coloane];

		/*
		 * for (int index1 = 0; index1 < linii; index1++) { for (int index2 = 0; index2
		 * < coloane; index2++) { matrixRez[index1][index2] = BigDecimal.valueOf(0); } }
		 */ // imi returneaza null

		matrixRez = init(matrixRez);

		for (int i = 0; i < linii; i++)
			for (int j = 0; j < coloane; j++) {
				matrixRez[i][j] = matrixRez[i][j].add(matrix1[i][j]);
				matrixRez[i][j] = matrixRez[i][j].add(matrix2[i][j]);
			}
		return matrixRez;
	}

	public static BigDecimal[][] subtract(BigDecimal matrix1[][], BigDecimal matrix2[][]) {
		BigDecimal matrixRez[][] = new BigDecimal[linii][coloane];

		/*
		 * for (int index1 = 0; index1 < linii; index1++) { for (int index2 = 0; index2
		 * < coloane; index2++) { matrixRez[index1][index2] = BigDecimal.valueOf(0); } }
		 */
		matrixRez = init(matrixRez);
		for (int i = 0; i < linii; i++)
			for (int j = 0; j < coloane; j++) {
				matrixRez[i][j] = matrixRez[i][j].add(matrix1[i][j]);
				matrixRez[i][j] = matrixRez[i][j].subtract(matrix2[i][j]);
			}
		return matrixRez;
	}

	public static BigDecimal[][] multiply(BigDecimal matrix1[][], BigDecimal matrix2[][]) {
		BigDecimal matrixRez[][] = new BigDecimal[linii][coloane];

		/*
		 * for (int index1 = 0; index1 < linii; index1++) { for (int index2 = 0; index2
		 * < coloane; index2++) { matrixRez[index1][index2] = BigDecimal.valueOf(0); } }
		 */
		matrixRez = init(matrixRez);

		for (int i = 0; i < linii; i++) {
			for (int j = 0; j < coloane; j++) {
				matrixRez[i][j] = BigDecimal.valueOf(0);
				for (int k = 0; k < linii; k++)
					matrixRez[i][j] = matrixRez[i][j].add(matrix1[i][k].multiply(matrix2[k][j]));
			}
		}
		return matrixRez;
	}

	public static BigDecimal[][] multiplyScalar(BigDecimal matrix[][], BigDecimal k) {
		BigDecimal matrixRez[][] = new BigDecimal[linii][coloane];
		matrixRez = init(matrixRez);
		for (int i = 0; i < linii; i++)
			for (int j = 0; j < coloane; j++) {
				matrixRez[i][j] = matrixRez[i][j].add(matrix[i][j]);
				matrixRez[i][j] = matrixRez[i][j].multiply(k);
			}

		return matrixRez;
	}

	public static boolean areEqual(BigDecimal matrix1[][], BigDecimal matrix2[][]) {
		for (int i = 0; i < linii; i++)
			for (int j = 0; j < coloane; j++)
				if (matrix1[i][j].equals(matrix2[i][j]) == false)
					return false;
		return true;

	}

	public static boolean isZeroMatrix(BigDecimal matrix[][]) {

		for (int i = 0; i < linii; i++)
			for (int j = 0; j < coloane; j++)
				if (matrix[i][j].equals(new BigDecimal("0")) == false)
					return false;

		return true;
	}

	public static boolean isIdentityMatrix(BigDecimal matrix[][]) {
		for (int i = 0; i < linii; i++) {
			for (int j = 0; j < coloane; j++) {
				if (i == j && matrix[i][j].equals(new BigDecimal("1")) == false)
					return false;
				else if (i != j && matrix[i][j].equals(new BigDecimal("0")) == false)
					return false;
			}
		}
		return true;
	}

	public static BigDecimal fillDegree(BigDecimal matrix[][]) {

		BigDecimal numarElemente = new BigDecimal("16"); // linii * coloane = 4 * 4 = 16
		BigDecimal elementeNenule = new BigDecimal("0");
		for (int i = 0; i < linii; i++)
			for (int j = 0; j < coloane; j++)
				if (matrix[i][j].equals(new BigDecimal("0")) == false)
					elementeNenule = elementeNenule.add(new BigDecimal("1"));
		BigDecimal procent = elementeNenule.divide(numarElemente);
		procent = procent.multiply(new BigDecimal("100"));

		return procent;
	}

	public static void printMatrix(BigDecimal matrix[][]) {
		for (int i = 0; i < linii; i++) {
			for (int j = 0; j < coloane; j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		BigDecimal matrix1[][] = new BigDecimal[linii][coloane];
		System.out.println("Dati prima matrice");
		for (int i = 0; i < linii; i++) {
			for (int j = 0; j < coloane; j++) {
				matrix1[i][j] = scanner.nextBigDecimal();
			}
		}

		BigDecimal matrix2[][] = new BigDecimal[linii][coloane];
		System.out.println("Dati cea de-a doua matrice");
		for (int i = 0; i < linii; i++)
			for (int j = 0; j < coloane; j++)
				matrix2[i][j] = scanner.nextBigDecimal();

		BigDecimal matrixRez[][] = new BigDecimal[linii][coloane];

		add(matrix1, matrix2);
		printMatrix(matrixRez);

		subtract(matrix1, matrix2);
		printMatrix(matrixRez);

		multiply(matrix1, matrix2);
		printMatrix(matrixRez);

		BigDecimal scalar = new BigDecimal("3");
		multiplyScalar(matrix1, scalar);
		printMatrix(matrixRez);

		if (areEqual(matrix1, matrix2))
			System.out.println("Matricele sunt identice");
		else
			System.out.println("Matricele nu sunt identice");

		if (isZeroMatrix(matrix1))
			System.out.println("Matricea contine doar 0");
		else
			System.out.println("Matricea nu contine doar 0");

		if (isIdentityMatrix(matrix1))
			System.out.println("Matricea este matrice identica");
		else
			System.out.println("Matricea nu este matrice indentica");
		System.out.println("Matricea este umpluta " + fillDegree(matrix1) + "%");

	}

}
