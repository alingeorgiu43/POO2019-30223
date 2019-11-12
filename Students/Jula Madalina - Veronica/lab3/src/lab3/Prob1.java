package lab3;

import java.util.Scanner;

public class Prob1 {

	public static void goldenbach(int n)
	{
		int a,b,i,j,ok1=1,ok2=1;
		for ( i=2 ; i<n/2; i++)
		{
			a=i;
			b=n-i;
			for( j=2; j<=(a/2) && ok1==1; j++)
				if(a%j==0)
					ok1=0;
			for( j=2; j<=(b/2) && ok2==1; j++)
				if(b%j==0)
					ok2=0;
			if(ok1==1 && ok2==1 && a!=1 && b!=1)
				System.out.println("Numarul " + n + "este suma dintre " +a+" si "+b);
			ok1=1;
			ok2=1;
		}
	}
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("n= ");
		int n = in.nextInt();
		
		System.out.println("m= ");
		int m = in.nextInt();
		
		int i;
		
		if(n>m)
		{
			int aux=n;
			n=m;
			m=aux;
		}
		
		for(i=n;i<m;i++)
		 goldenbach(i);
		 
	}

}
