
public class Newton {
	static double f(double a, double b, double c,double x)
	{
		return (a*x*x +b*x +c);
	}	
	static double f_derivat(double a,double b, double c, double x)
	{
		return (2*a*x + b);
	}
	public static void main(String[] args) {
		double epsilon = 1e-7;
		int a = 1, b=2 ,c=1;
		int iteratii = 0;
		double x0=0;
		double x1=x0 - f(a,b,c,x0)/f_derivat(a,b,c,x0);
		
		while(x1>epsilon || Math.abs(f(a,b,c,x0)/f_derivat(a,b,c,x0))>= epsilon)
		{
			x0=x1;
			x1=x0 - f(a,b,c,x0)/f_derivat(a,b,c,x0);
			iteratii++;
			System.out.println(iteratii+ "\n"+ x1);
		}
		
	}

}
