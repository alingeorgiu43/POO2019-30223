import java.math.*;
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		BigInteger[][] tablaSah = new BigInteger[8][8];
		BigInteger suma = new BigInteger("0");
		BigInteger valoareAnterioara = new BigInteger("1");
		BigInteger doi = new BigInteger("2");
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				tablaSah[i][j] = new BigInteger("0");
			}
		}

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (i == 0 && j == 0) {
					tablaSah[i][j] = tablaSah[i][j].add(valoareAnterioara);
					suma = suma.add(tablaSah[i][j]);
				} else {
					tablaSah[i][j] = tablaSah[i][j].add(valoareAnterioara);
					tablaSah[i][j] = tablaSah[i][j].multiply(doi);
					suma = suma.add(tablaSah[i][j]);
					valoareAnterioara = valoareAnterioara.multiply(doi);
				}
			}
		}

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(tablaSah[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Suma este: " + suma);

	}

}
