import java.util.*; 
import java.math.BigInteger; 

public class BoabeDeGrau {
		public static void main(String arg[])
		{
				BigInteger nr1,nr2,NumarBoabe;
					nr1=BigInteger.valueOf(1);
					nr2=BigInteger.valueOf(2);
					NumarBoabe=BigInteger.valueOf(1);
				Scanner in= new Scanner(System.in);
				int numar_casute=in.nextInt();
				for(int i = 1;i<numar_casute;i++)
			{
				nr1=nr1.multiply(nr2);
				NumarBoabe=NumarBoabe.add(nr1);
			}
				System.out.println("Numarul de boabe din ultima casuta:"+nr1);
				System.out.println("Numarul total de boabe:" + NumarBoabe);
				
		}
}
