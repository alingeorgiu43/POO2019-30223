
public class Functions1 {
	static int[] ADD(int a[], int b[]) {
		int sizea = a.length;
		int sizeb = b.length;

		if (sizea > sizeb) {
			for (int i = 0; i < sizeb; i++)
				a[sizea - sizeb + i] = a[sizea - sizeb + i] + b[i];
			return a;
		} else {
			for (int i = 0; i < sizea; i++)
				b[sizeb - sizea + i] = b[sizeb - sizea + i] + a[i];

			return b;
		}

	}

	static int[] SUBTRACT(int a[], int b[]) {
		int sizea = a.length;
		int sizeb = b.length;

		if (sizea > sizeb) {
			for (int i = 0; i < sizeb; i++)
				a[sizea - sizeb + i] = a[sizea - sizeb + i] - b[i];
			return a;
		} else {
			for (int i = 0; i < sizea; i++)
				b[sizeb - sizea + i] = b[sizeb - sizea + i] - a[i];
			return b;
		}

	}

	static int[] MULTIPLY(int a[], int b[]) {
		int sizea = a.length;
		int sizeb = b.length;
		int inmultire[] = new int[sizea + sizeb - 1];

		for (int index1 = 0; index1 < sizea; index1++) {
			for (int index2 = 0; index2 < sizeb; index2++)
				inmultire[index1 + index2] = inmultire[index1 + index2] + a[index1] * b[index2];
		}
		return inmultire;
	}

	static int[] MUL_SCAL(int a[], int n) {
		int sizea = a.length;

		int inmultire[] = new int[sizea];

		for (int index1 = 0; index1 < sizea; index1++)
			inmultire[index1] = a[index1] * n;

		return inmultire;
	}

	static int EVAL(int a[], int n) {
		int sizea = a.length;

		int rezultat = a[0];

		for (int index = 1; index < sizea; index++) {
			rezultat = rezultat*n + a[index];
			
		}
		return rezultat;
	}

}
