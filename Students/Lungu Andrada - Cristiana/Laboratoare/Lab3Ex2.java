package lab3;

public class Lab3Ex2 {
	static double epsilon=0.001;
	static int a=1,b=6,c=9;
	
	static double Functie(double x) {
		double f;
		f=a*x*x+b*x+c;
		return f;
	}
	
	static double Derivata(double x) {
		double d;
		d=2*a*x+b;
		return d;
	}
	static void MetodaNewton(double x) {
		double f=Functie(x)/Derivata(x);
		int n=0;
		while(Math.abs(f)>=epsilon) {
			f=(Functie(x)/Derivata(x));
			x=x-f;
			n++;
		}
	System.out.println("Solutia polinomului="+Math.round(x));
	System.out.println("Numar de iteratii="+n);
	}
	
	public static void main(String[] args) {
		double x0=1;
		MetodaNewton(x0);
		
	}
}
