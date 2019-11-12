import java.util.Scanner;

public class Main {
	public static int nr_prim(int numar) {

		int divizor;
		if (numar < 2)
			return 0;
		if (numar % 2 == 0 && numar > 2)
			return 0;
		divizor = 3;
		while (divizor * divizor <= numar)
			if (numar % divizor == 0)
				return 0;
			else
				divizor = divizor + 2;
		return 1;

	}
	public static void main(String[] args) {

		Scanner keyboardInput = new Scanner(System.in);
		int numarM, numarN;

		System.out.println("m = ");
		numarM = keyboardInput.nextInt();

		System.out.println("n = ");
		numarN = keyboardInput.nextInt();

		for (int index1 = 2; index1 < 100; index1++)
			for (int index2 = 2; index2 < 100; index2++) {

				if (nr_prim(index1) == 1 && nr_prim(index2) == 1)
					if ((index1 + index2) > numarM)
						if ((index1 + index2) < numarN)
							if ((index1 + index2) % 2 == 0)
								System.out.println((index1 + index2) + " = " + index1 + " + " + index2);
			}
	}

}

