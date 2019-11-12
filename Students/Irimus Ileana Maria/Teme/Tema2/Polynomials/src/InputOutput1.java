import java.util.Scanner;

import java.io.File;
public class InputOutput1 {
	public static void main(String[] args) throws Exception {
		File f = new File("C:\\Users\\User\\Desktop\\pol.txt");
		Scanner scanner = new Scanner(f);

		String stringSir1 = scanner.nextLine();
		String[] intSir1 = stringSir1.split(" ");
		int numarM = intSir1.length;
		int coeficient1[] = new int[numarM];
		for (int index = 0; index < numarM; index++) {
			coeficient1[index] = Integer.parseInt(intSir1[index]);
		}
		
		Polynomial1 polinom1 = new Polynomial1(coeficient1);
		System.out.println(" ");

		String stringSir2 = scanner.nextLine();
		String[] intSir2 = stringSir2.split(" ");
		int numarN = intSir2.length;
		int coeficient2[] = new int[numarN];
		for (int index = 0; index < numarN; index++) {
			coeficient2[index] = Integer.parseInt(intSir2[index]);
		}
		
		Polynomial1 polinom2 = new Polynomial1(coeficient2);
		System.out.println(" ");

		int copie1a[] = new int[numarM];
		for (int i = 0; i < numarM; i++)
			copie1a[i] = coeficient1[i];

		int copie1b[] = new int[numarN];
		for (int i = 0; i < numarN; i++)
			copie1b[i] = coeficient2[i];

		int copie2a[] = new int[numarM];
		for (int i = 0; i < numarM; i++)
			copie2a[i] = coeficient1[i];

		int copie2b[] = new int[numarN];
		for (int i = 0; i < numarN; i++)
			copie2b[i] = coeficient2[i];
		
		int copie3a[] = new int[numarM];
		for (int i = 0; i < numarM; i++)
			copie3a[i] = coeficient1[i];

		int copie3b[] = new int[numarN];
		for (int i = 0; i < numarN; i++)
			copie3b[i] = coeficient2[i];
		
		int copie4a[] = new int[numarM];
		for (int i = 0; i < numarM; i++)
			copie4a[i] = coeficient1[i];

		int copie4b[] = new int[numarN];
		for (int i = 0; i < numarN; i++)
			copie4b[i] = coeficient2[i];

		Functions1 function = new Functions1();
		
		Polynomial1 polinom3 = new Polynomial1(function.ADD(coeficient1, coeficient2));
		System.out.println(" ");

		Polynomial1 polinom4 = new Polynomial1(function.SUBTRACT(copie1a, copie1b));
		System.out.println(" ");

		Polynomial1 polinom5 = new Polynomial1(function.MULTIPLY(copie2a, copie2b));
		System.out.println(" ");
		
		Polynomial1 polinom6 = new Polynomial1(function.MUL_SCAL(copie3a, 10));
		System.out.println(" ");
		
		Polynomial1 polinom7 = new Polynomial1(function.MUL_SCAL(copie3b, 10));
		System.out.println(" ");
		
		int polinom8 = function.EVAL(copie4a, 2);
		System.out.println(polinom8);
		
		int polinom9 = function.EVAL(copie4b, 2);
		System.out.println(polinom9);
		
	}
}
