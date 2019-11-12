package lab1_tema1;
import java.util.Scanner;

public class Prb1 {
	
	public static void main(String[] args)
	{
		Scanner n = new Scanner(System.in);
		int myint=n.nextInt() ;
		int s=0;
		int maxim=Integer.MAX_VALUE;
		for(int i=1;i<myint;i++)
		{
		if(i%3 == 0 || i%5==0)
			{
			//System.out.println(i);
			s=s+i;
			if(s<0)
			{
				System.out.println("numarul maxim este " + (i-1) );
				break;
			}
			}
		}
		System.out.println(s);
		//System.out.println(maxim);
	}
	
}
