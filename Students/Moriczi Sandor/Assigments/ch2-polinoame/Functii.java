import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Functii {
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
	static void multiply(int[] a, int[] b,int[] rez, int n, int m)
	{
		int k=0;
		for(int i=0;i<n;i++)
			{
			for(int j=0;j<m;j++)
			{
				rez[k]=rez[k]+a[i]*b[j];
				k++;
			}
			k=i+1;
			}
		
	}
	static void mul_scal(int[] a,int[] rez, int n, int scal)
	{
		for(int i=0;i<n;i++)
			{
				rez[i]=a[i]*scal;

			}
		
	}
	
}
