import java.text.DecimalFormat;

public class Operations extends FunctionsClass{
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	private static int contor = 0;
	private static int contorMax=200;
	private static double epsilon = 0.000001;

	public static void doOperations() {
		int a, b, c;
		double x;
		a = 1;
		b = 2;
		c = 1;
		x = 0;
		double functionRez = returnGrade2Funtion(a, b, c, x);
		while (Math.abs(functionRez) > epsilon && contor<contorMax) {
			x = x - returnGrade2Funtion(a, b, c, x) / returnDerivateFunction(a, b, x);
			contor++;
			functionRez = returnGrade2Funtion(a, b, c, x);
		}
		functionRez = returnGrade2Funtion(a, b, c, x);
		if (Math.abs(functionRez) <= epsilon) {
			System.out.println(
					"Radacina gasita este " + df2.format(x) + " si a fost gasita dupa un numar de " + contor + " pasi");
		} else
			System.out.println("Nu s-au gasit radacini");
	}
}
