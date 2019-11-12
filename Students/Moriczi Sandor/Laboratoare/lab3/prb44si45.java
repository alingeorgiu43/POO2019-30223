package lab34;
import java.util.*;
public class prb44 {

	public static void main(String[] args) {
		long a=1;
		for(int i=2;i<=49;i++)
			a=a*i;
		long b=1;
		for(int i=2;i<=6;i++)
			b=b*i;
		double c=(double)b/(double)a;
		System.out.println("sansele de a castiga: "+ c);
		System.out.println("numerele extrase sunt:");
		Random rand= new Random();
		
		for(int i=0;i<6;i++)
		{
			int n1=rand.nextInt(50);
			System.out.printf(n1 + " ");
		}
	}

}
