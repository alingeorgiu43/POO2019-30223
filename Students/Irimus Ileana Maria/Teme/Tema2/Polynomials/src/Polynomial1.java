
public class Polynomial1 {
	public Polynomial1(int coeficient[]) {

		int putere = coeficient.length - 1;

		// pt primul coeficient
		int index = 0;
		if (coeficient[index]!=0)
			if (coeficient[index] > 0)
				System.out.print(coeficient[index] + "x^" + putere);
			else 
				System.out.print(coeficient[index] + "x^" + putere);
		putere--;

		// pt restul coeficientilor
		for (int index1 = 1; index1 < coeficient.length; index1++) {

			if (coeficient[index1]!=0) {
				if (putere == 1) {
					if (coeficient[index1] > 0)
						System.out.print("+" + coeficient[index1] + "x");
					else
						System.out.print(coeficient[index1] + "x");
				}

				else if (putere == 0) {
					if (coeficient[index1] > 0)
						System.out.print("+" + coeficient[index1]);
					else
						System.out.print(coeficient[index1]);
				}

				else if (coeficient[index1] > 0)
					System.out.print("+" + coeficient[index1] + "x^" + putere);
				else
					System.out.print(coeficient[index1] + "x^" + putere);
			}

			putere--;
		}

	}

}
