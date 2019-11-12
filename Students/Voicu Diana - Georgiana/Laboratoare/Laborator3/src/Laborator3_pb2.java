import java.util.Scanner;
public class Laborator3_pb2 {
	
	static double functie(double x, double a, double b,double c)
	{
		return a*x*x+b*x+c;
	}
	
	static double derivf(double x, double a, double b)
	{
		return 2*a*x+b;
	}
	
	static void Newton (double x,double a,double b, double c, double epsilon)
	{
		int n=0;
		double h = functie(x,a,b,c)/derivf(x,a,b);
		while( Math.abs(h) >= epsilon)
		//while(-h >= epsilon)
		{
			h= functie(x,a,b,c)/derivf(x,a,b);
		//	xn+1 = xn -f(x)/f'(x)
			x=x-h;
			n++;
		}
		System.out.println("Valoarea radacinii este= " + x);
		System.out.println("Numarul de iteratii este= "+ n);
	} 
	
	
	public static void main (String[] args){
		
		Scanner scaneaza= new Scanner(System.in);
		System.out.println("Introduceti valoarea lui epsilon intre 0.01 si 0.000001 = ");
		double epsilon = scaneaza.nextDouble();
		System.out.println("Introduceti valoarea lui a = ");
		double a = scaneaza.nextDouble();
		System.out.println("Introduceti valoarea lui b = ");
		double b = scaneaza.nextDouble();
		System.out.println("Introduceti valoarea lui c = ");
		double c = scaneaza.nextDouble();
		System.out.println("Introduceti valoarea lui x0 = ");
		double x0 = scaneaza.nextDouble();
		Newton(x0,a,b,c,epsilon);
		
		
		
	} 
	
	
}
