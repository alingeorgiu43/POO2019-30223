package javasmmr.methods;

import java.math.BigInteger;
import javasmmr.methods.*;

public class ProblemaBoabelor {
	public static void solveBoabe() {

		int n = 8;
		BigInteger totalBoabe = BigInteger.valueOf(1);
		int nrCasute = n * n;
		for (int i = 1; i < nrCasute; i++) {

			BigInteger nrBoabeCasuta = PowerMethod.getPower(i);
			totalBoabe = totalBoabe.add(nrBoabeCasuta);
		}
		System.out.println(totalBoabe);
	}
}
