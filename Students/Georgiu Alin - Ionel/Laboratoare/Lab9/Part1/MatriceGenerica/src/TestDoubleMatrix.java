
public class TestDoubleMatrix {
	public static void main(String[] args) {
		Double[][] m1 = new Double[][] { { 1.1, 2.2, 3.3 }, { 4.1, 5.2, 6.3 }, { 7.3, 6.2, 5.1 } };
		Double[][] m2 = new Double[][] { { 1.4, 1.5, 1.6 }, { 2.1, 2.2, 2.3 }, { 3.1, 3.2, 3.3 } };

		DoubleMatrix doubleMatrix = new DoubleMatrix();
		System.out.println("The results for 2 Double matrices");
		System.out.println("\nm1 + m2 is ");
		GenericMatrix.printResult(m1, m2, doubleMatrix.addMatrix(m1, m2), '+');

		System.out.println("\nm1 * m2 is ");
		GenericMatrix.printResult(m1, m2, doubleMatrix.multiplyMatrix(m1, m2), '*');
	}
}
