import java.math.BigInteger;

public class BoabeGrau {

	public static void main(String[] args) {
		BigInteger firstNr, ratio;
		firstNr = BigInteger.valueOf(1);
		ratio = BigInteger.valueOf(2);
		System.out.printf("%d",ratio.pow(64).subtract(firstNr));
		
	}

}
