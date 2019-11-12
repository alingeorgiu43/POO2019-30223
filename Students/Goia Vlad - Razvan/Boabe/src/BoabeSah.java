import java.math.BigInteger;

public class BoabeSah { 
	    public static void main(String[] args) 
	    { 
	    	BigInteger p = new BigInteger("2");
			BigInteger sum = new BigInteger("0");
					for(int i=0 ; i<=63; i++)
						sum = sum.add(p.pow(i));
		        
	    System.out.println("Valoarea lui rez " + sum ); 
	    } 
}

