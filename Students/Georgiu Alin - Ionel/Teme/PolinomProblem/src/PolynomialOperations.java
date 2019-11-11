public class PolynomialOperations {
	private int degree;
	int[] coefficients;

	public int getDegree() {
		int grad = 0;
		int n = coefficients.length;
		for (int i = 0; i < n; i++) {
			if (coefficients[i] != 0) {
				grad = i;
			}
		}
		return grad;
	}

	public int getCoefficients(int i) {
		return coefficients[i];
	}

	public PolynomialOperations(int[] arr) {
		coefficients = new int[arr.length + 1];
		for (int i = 0; i < coefficients.length; i++) {
			coefficients[i] = arr[arr.length - i - 1];
		}
		degree = getDegree();
	}

	public PolynomialOperations(int grad, int k) {
		coefficients = new int[grad + 1];
		coefficients[grad] = k;
		degree = getDegree();
	}

	public PolynomialOperations(PolynomialOperations pol) {
		int n = pol.coefficients.length;
		coefficients = new int[n];
		for (int i = 0; i < n; i++) {
			coefficients[i] = pol.coefficients[i];
		}
	}

	public static PolynomialOperations add(PolynomialOperations p1, PolynomialOperations p2) {
		int gradMax = Math.max(p1.degree, p2.degree);
		PolynomialOperations pSum = new PolynomialOperations(gradMax, gradMax);
		for (int i = 0; i <= p1.degree; i++) {
			pSum.coefficients[i] += p1.coefficients[i];
		}
		for (int i = 0; i <= p2.degree; i++) {
			pSum.coefficients[i] += p2.coefficients[i];
		}
		return pSum;
	}

	public PolynomialOperations substract(PolynomialOperations p1, PolynomialOperations p2) {
		int gradMax = Math.max(p1.degree, p2.degree);
		PolynomialOperations pDif = new PolynomialOperations(gradMax, gradMax);
		for (int i = 0; i <= p1.degree; i++) {
			pDif.coefficients[i] += p1.coefficients[i];
		}
		for (int i = 0; i <= p2.degree; i++) {
			pDif.coefficients[i] -= p2.coefficients[i];
		}
		return pDif;
	}

	public PolynomialOperations multilpyByScalar(PolynomialOperations p, int k) {
		if (k == 0) {
			p.degree = 0;
			p.coefficients = new int[0];
		}
		for (int i = 0; i <= p.degree; i++) {
			p.coefficients[i] = p.coefficients[i] * k;
		}
		return p;
	}

	public PolynomialOperations multiply(PolynomialOperations p1, PolynomialOperations p2) {
		PolynomialOperations pMul = new PolynomialOperations(p1.degree + p2.degree, Math.max(p1.degree, p2.degree));
		for (int i = 0; i < p1.degree; i++) {
			for (int j = 0; j < p2.degree; j++) {
				pMul.coefficients[i + j] += p1.coefficients[i] * p2.coefficients[j];
			}
		}
		return pMul;
	}

	public int eval(PolynomialOperations p, int n) {
		int rez = 0;
		for (int i = 0; i <= p.degree; i++)
			rez += (coefficients[i] * Math.pow(n, i));

		return rez;
	}

	public boolean isZero(PolynomialOperations p) {
		for (int i = 0; i < p.degree; i++)
			if (p.coefficients[i] != 0)
				return false;
		return true;
	}

	public int getCoeficient(int grad) {
		return coefficients[grad];
	}
}