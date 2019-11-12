import java.math.BigInteger;

public class Sah {
	public static void main (String[] args)
	{
		BigInteger auxiliar = BigInteger.valueOf(1); 
		BigInteger nr = BigInteger.valueOf(0); 
		
		for (int contor=0; contor<64; contor++) 
		{
			nr=nr.add(auxiliar);
			auxiliar=auxiliar.add(auxiliar);	
		}
		
		System.out.print(nr);
	}
}
