package lab3_1;
import java.util.*;
public class prb41 {

	static boolean isPrime(int n) {
	    for(int i=2;i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
	static void verif(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(isPrime(i))
			{
				int m=n-i;
				if(isPrime(m))
				{
					System.out.println( (i+m) + " = " + i + " + " + m);
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner cit= new Scanner(System.in);
		int n=cit.nextInt();
		int m=cit.nextInt();
		for(int i=n;i<=m;i++)
		{
			if(i%2==0)
			verif(i);
		}
		

	}

}
