package lab;
import java.util.Scanner;
public class Lab3Ex1 {
	public static int prim(int n) {
		int div=0;
		for(int i=2;i<n;i++)
			if(n%i==0)
				div=div+1;
		return div;
	}
	public static void main(String[] args) {
		
	System.out.println("m=");
	Scanner nr=new Scanner(System.in);
	int m=nr.nextInt();
	
	System.out.println("n=");
	Scanner nr2=new Scanner(System.in);
	int n=nr2.nextInt();
	
	int i;
	int j;
	if (m%2==0)
		i=m;
	else
		i=m+1;
	int prime=0;
	while(i<=n){
		//prime=0;
		int sem=0;
		for(int n1=1;n1<i;n1++)
			for(int n2=1;n2<i;n2++)
				if((prim(n1)==0) && (prim(n2)==0) && (n1+n2==i))
					sem=1;
		if (sem==1)
			prime++;
		i=i+2;
	}
	int pare=0;
	for(int k=m;k<=n;k++)
		if(k%2==0)
			pare++;
	if (prime==pare)
		System.out.println("verifica");
		else
			System.out.println("nu verifica");
		
	}
}
