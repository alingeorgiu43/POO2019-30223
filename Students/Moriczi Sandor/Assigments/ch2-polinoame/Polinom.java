import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Polinom {

	
	static void subtract(int[] a, int[] b,int[] rez, int n, int m)
	{
		int max;
		if(n>m)
			max=n;
		else
			max=m;
		for(int i=0;i<max;i++)
			{
			if(n==max)
			{
				rez[i]=a[i]-b[i];
			}
			else
				rez[i]=b[i]-a[i];
			}
		
	}
	static void add(int[] a, int[] b,int[] rez, int n, int m)
	{
		int max;
		if(n>m)
			max=n;
		else
			max=m;
		for(int i=0;i<max;i++)
			{
			if(n==max)
			{
				rez[i]=b[i]+a[i];
			}
			else
				rez[i]=a[i]+b[i];
			}
		
	}
	static void afisarePolinom(int[] a, int n)
	{
		for(int i=n-1;i>=0;i--)
		{	
			if(a[i]>0)
				System.out.print(" + ");
			if(a[i]!=0)
			{
			if(i==0)
				System.out.print(a[i]+ " ");
			else
				if(i==1)
				System.out.print(a[i]+"x");
				else
					System.out.printf(a[i]+"x^"+i+" ");
			}
		}
		System.out.println();
	}
	public static void main(String[] args) throws FileNotFoundException {
		int[] a;
		int[] b;
		int[] rez;
		int n=3;
		int m=3;
		Functii fun= new Functii();
		rez= new int[100];
		a= new int[100];
		b= new int[100];
		for(int i=0;i<10;i++)
			a[i]=i;
		Scanner scan = new Scanner(new File("F:\\POO\\tema-ch2-1\\src\\in.txt"));
		//int [] tall = new int [100];
		
		for(int i=n-1;i>=0;i--)
		{
			if(scan.hasNextInt())
				a[i]=scan.nextInt();
		}
		for(int i=m-1;i>=0;i--)
		{
			if(scan.hasNextInt())
				b[i]=scan.nextInt();
		}
		int scal;
		//afisarePolinom(b,m);
		String s="NULL";
		String nr;
		while(scan.hasNextLine())
		{
			s=scan.nextLine();
			//System.out.println(s);
			//if(s.contentEquals("MUL_SCAL"))
				//System.out.println("gasit");
			/*if(s.contains("MUL_SCAL"))
			{
				//scal=scan.nextInt();
				//fun.mul_scal(a, rez, n, scal);
			}*/
			
			//sunt puse in comentarii pentru ca la apel se schimba polinomu
			
			if(s.contentEquals("ADD")) //functioneaza
			{
				fun.add(a,b,rez,n,m);
				afisarePolinom(a,n);
				afisarePolinom(b,m);
				afisarePolinom(rez,n);
				System.out.println();
			}
			
			if(s.contentEquals("SUBTRACT")) //functioneaza
			{
				fun.subtract(a,b,rez,n,m);
				afisarePolinom(a,n);
				afisarePolinom(b,m);
				afisarePolinom(rez,n);
				System.out.println();
			}
			
			if(s.contentEquals("MULTIPLY")) //functioneaza
			{
				Arrays.fill(rez,0);
				fun.multiply(a, b, rez, n, m);
				afisarePolinom(a,n);
				afisarePolinom(b,m);
				afisarePolinom(rez,(n+m));
				System.out.println();
			}
			
		}
		/*afisarePolinom(a,n);
		afisarePolinom(b,m);
		afisarePolinom(rez,n);*/
		

}
}
