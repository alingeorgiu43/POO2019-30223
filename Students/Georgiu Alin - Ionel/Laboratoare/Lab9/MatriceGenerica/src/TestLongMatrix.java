import java.util.Random;

public class TestLongMatrix {
	public static void main(String[] args) {
		Long[][] m1 = new Long[][] { {new Random().nextLong(),new Random().nextLong()}, {new Random().nextLong(),new Random().nextLong() } };
		Long[][] m2 = new Long[][] { {new Random().nextLong(),new Random().nextLong()}, {new Random().nextLong(),new Random().nextLong() } };

		LongMatrix longMatrix = new LongMatrix();
		System.out.println("The results for 2 Long matrices");
		System.out.println("\nm1 + m2 is ");
		GenericMatrix.printResult(m1, m2, longMatrix.addMatrix(m1, m2), '+');

		System.out.println("\nm1 * m2 is ");
		GenericMatrix.printResult(m1, m2, longMatrix.multiplyMatrix(m1, m2), '*');
	}
}