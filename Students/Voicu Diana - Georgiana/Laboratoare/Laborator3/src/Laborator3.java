import java.util.Scanner;
public class Laborator3 {
	public static int isprime (int nr)
	{
		int ct=0;
		for(int d=2;d<nr/2;d++)
		{
			if(nr%d == 0)
				ct=ct+1;
		}
		return ct;
	}
	
	public static void main (String[] args) {
	//4.1
	Scanner scaneaza = new Scanner(System.in);
	System.out.println("Intorduceti m=");
	int m = scaneaza.nextInt();
	System.out.println("Intorduceti n=");
	int n = scaneaza.nextInt();
	int nr;
	int contor=0;
	int ct=0;
	for(int i=m; i<=n; i++)
	{
		if(m!= 0) {
		if(i % 2 == 0)
		{
			contor++;
			int var=0;
			for(int j=2; j<=i; j++)
			{
				for(int k=2; k<=i; k++)
				{
					if((isprime(j)==0)&&(isprime(k)==0)&&(j+k==i))
					{
						var++;
					}
				}
			}
			if(var!=0)
			{
				ct++;
			}
		}
	  }
	}
		if(contor == ct)
			{
			System.out.println("Verifica.");
			}
		else
		{
			System.out.println("Eroare.");
		}
	
	}
}
