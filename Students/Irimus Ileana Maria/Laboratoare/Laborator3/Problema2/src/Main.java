import java.util.Scanner;

public class Main {
	static double f1(double a, double b, double c, double x) {
		return a * x * x + b * x + c;
	}

	static double f2(double a, double b, double x) {
		return 2 * a * x + b;
	}

	static void f3(double a, double b, double c, double x, double e) {
		int numarIteratii = 0;
		double rap = f1(a, b, c, x) / f2(a, b, x);
		while (Math.abs(rap) >= e)
			rap = f1(a, b, c, x) / f2(a, b, x);
		x = x - rap;
		numarIteratii++;
	}System.out.println("solutie:"+x);System.out.println("nr iteratii: "+numarIteratii);

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("e = ");
		double e = scanner.nextDouble();

		System.out.println("a = ");
		double a = scanner.nextDouble();

		System.out.println("b = ");
		double b = scanner.nextDouble();

		System.out.println("c = ");
		double c = scanner.nextDouble();

		System.out.println("x0 = ");
		double x0 = scanner.nextDouble();

		f3(a, b, c, e, x0);

	}

}
