package javasmmr.methods;

import java.math.BigInteger;

public class PowerMethod {
	public static BigInteger getPower(int n) {
		BigInteger f;
		f = BigInteger.valueOf(1);
		for (int i = 1; i <= n; i++) {
			f = f.multiply(BigInteger.valueOf(2));
		}
		return f;
	}
}
