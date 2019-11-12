package lab2ProblBoabelor;
import java.math.BigInteger;

public class MainClass {

	public static void main(String[] args) {
		int nr1 = BigInteger.valueOf(1);
		int nr2; 
		for (int i=1;i<64;i++)
		{  
			nr2 = BigInteger.valueOf(Math.round((Math.pow(2, i))));
			nr1=nr1.add(nr2);
		}

		System.out.println(nr1);


	}

}
