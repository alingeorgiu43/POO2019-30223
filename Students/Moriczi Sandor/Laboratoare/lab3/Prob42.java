package lab3_1;
public class Prob42 
{
	
	static void complex(double a, double b, double c, double x)
	{
		if( (b*b) - (4*a*c) <0)
		{
		   System.out.println("Solutii compelxe.");
		   return ;
		}
	
		int i = 0;
		final double ep = 0.0001;
		double r = (a*x*x + b*x + c)/(2*a*x+b);
		while(Math.abs(r) >= ep)
		{
			r = (a*x*x + b*x + c)/(2*a*x+b);
			x = x - r;
			i = i + 1;
		}
		System.out.println("O radacina a ecuatiei " + a + "x^2 + " + b + "x + " + c + " este " + x);
		System.out.println("Numarul de iteratii : " + i);
	}
	
	public static void main(String[] args)
	{
		double x = 0;
		double a = 1;
		double b = 2;
		double c = 1;
		complex(a,b,c,x);
	}
}