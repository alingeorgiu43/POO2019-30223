import java.math.BigInteger;

public class Boabele { 
	    public static void main(String[] args) 
	    { 
	    	BigInteger p = new BigInteger("2");
			BigInteger adunare = new BigInteger("0");
					for(int i=0 ; i<=63; i++)
						adunare = adunare.add(p.pow(i));
		        
	    System.out.println("Valoarea rezultatului este = " + adunare ); 
	    } 
}

