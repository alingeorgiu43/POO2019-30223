import java.util.Scanner;

public class Prim {
	public static int isprime(int n)
	{
		for(int i=2;i<n;i++)
			if(n%i==0)
				return 0;
			return 1;
	}
	public static void main(String[] args) { 
		Scanner keyboard= new Scanner(System.in);
		int m=keyboard.nextInt();
		int n=keyboard.nextInt();
		for(int i=2;i<=n;i++)
		{
			for(int j=2;j<=n;j++)
				for(int k=m;k<=n;k++)
					if(k%2==0 && k==i+j && isprime(i)==1 && isprime(j)==1)
						System.out.print(k+ "=" +i+ "+" +j+" ") ;
		}
	}
}
