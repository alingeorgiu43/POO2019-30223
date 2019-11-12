import java.math.BigInteger;
import java.lang.Math;

public class Boaba {
	public static void main(String[] args) 
	{
		BigInteger s = new BigInteger("2");
		BigInteger rez = new BigInteger("0");
				for(int i=0 ; i<=63; i++)
					rez = rez.add(s.pow(i));
		System.out.println("Valoarea lui rez " + rez );
		// https://www.wolframalpha.com/input/?i=sum+k%3D0+to+63+2%5Ek 
	}
}
