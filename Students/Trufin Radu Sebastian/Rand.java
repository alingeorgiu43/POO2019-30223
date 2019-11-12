import java.util.Random;

public class Rand {
    public static void main(String[] args) {
    	
    	// metoda 1 ( clasa random ) 
    	System.out.println("Metoda 1 : ");
    	Random x = new Random();
    	int n;
    	
    	for(int i=1; i<=10; i++)
    	{
    		n = x.nextInt(10);
    		System.out.println(2*n + " ");
    	}
    	
    	// metoda 2 ( math.random )
    	System.out.println("Metoda 2 : ");
    	
    	for(int i=1; i<=10; i++)
    	{
    	    double doubleRandom = Math.random()*10;
    	    int intRandom = (int)(doubleRandom);
    	    System.out.println(2*intRandom + " ");
    	}
    }
}
