public class newton {
	static double f(double x, int a, int b, int c) {
		return a * x * x + b * x + c;
	}

	static double fd(double x, int a, int b) {
		return 2 * a * x + b;
	}

	public static void main(String[] args) {

		double epsilon = 1e-6;
		int iterations_max = 100;
		int count_it = 0;
		int a = 1, b = 2, c = 1;
		double x = 0;
		for (int i = 0; (i < iterations_max) && (Math.abs(f(x, a, b, c)) > epsilon); i++) {
			x -= f(x,a,b,c)/fd(x,a,b);	
			count_it++;
		}
		if(Math.abs(f(x,a,b,c)) <= epsilon)
			System.out.println("Radacini gasite la x = " + x + " gasita facand " + count_it + " pasi");
		else
			System.out.println("Nu exista radacini");
	}

}