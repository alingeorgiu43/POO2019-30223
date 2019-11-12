import java.math.BigInteger;

public class BigInteger {

	public static void main(String[] args) {
		int nr;
		BigInteger suma;
		BigInteger putere;
		putere= BigInteger.valueOf(0);
		suma=BigInteger.valueOf(1);
		
		for( nr=0;nr<64;nr++)
		{
			putere=putere.add(suma);
			suma=suma.add(suma);
		}
	System.out.println(putere);

	}

}