
public class NewtonSquareRoot {
	static double EPSILON = 0.001;
	static int a = 1, b = 6, c = 9;
	
	static double Function(double x) {
		return a * x * x + b * x + c;
	}
	
	static double DerivateFunction(double x) {
		return 2 * a * x + b;
	}
	
	static void NewtonMethod(double x) {
		double f = Function(x) / DerivateFunction(x);
		int n = 0;
		while(Math.abs(f) >= EPSILON) {
			f = Function(x) / DerivateFunction(x);
			x = x - f;
			n++;
		}
		System.out.println("Solutia polinomului este " + Math.round(x));
		System.out.println("Nr de iteratii este " + n);
	}
	public static void main(String[] args) {
		double x0 = 1;
		NewtonMethod(x0);
	}

}
