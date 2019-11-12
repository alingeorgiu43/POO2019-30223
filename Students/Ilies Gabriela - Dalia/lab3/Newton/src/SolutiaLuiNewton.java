import java.util.*;

public class SolutiaLuiNewton {
	public static void main(String argv[])
	{
		Scanner input=new Scanner(System.in);
		
		System.out.print("a=");
		int a=input.nextInt();
		
		System.out.print("b=");
		int b=input.nextInt();
		
		System.out.print("c=");
		int c=input.nextInt();
			
		System.out.print("x0=");
		double x0=input.nextDouble();
		
		int x2Derivat=0;
		int xDerivat=0;
		
		if (a!=0)
			x2Derivat=a*2;
		if (b!=0)
			xDerivat=b;
		
		double x1=0;
		int ok=0;
		int iteratie=0;
		while (ok==0)
		{
			double fx=a*(x0*x0) + b*x0 + c;
			double fDerivx=x2Derivat*x0 + xDerivat;
			
			x1=x0-(fx/fDerivx);
			
			
			if (Math.abs(x1-x0)<0.01 && Math.abs(x1-x0)>0.000001)
			{
				ok=1;

			}
			iteratie++;
			x0=x1;
			
		}
		System.out.println("solutia este "+ x1);
		System.out.print("numarul de iteratii este "+ iteratie);
		
	}
}
