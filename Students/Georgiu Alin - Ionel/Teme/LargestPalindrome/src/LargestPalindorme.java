public class LargestPalindorme {

	static int palindromFunction(int n) {
		int nrOglindit = 0;
		while (n != 0) {
			nrOglindit = nrOglindit * 10 + n % 10;
			n /= 10;
		}
		return nrOglindit;
	}

	static int palindrom(int lowLimit, int upLimit) {
		int maxProduct = 0;

		for (int i = upLimit; i >= lowLimit; i--) {

			for (int j = i; j >= lowLimit; j--) {

				int product = i * j;
				if (product < maxProduct)
					break;

				int nrOglindit = palindromFunction(product);

				if (product == nrOglindit && product > maxProduct)
					maxProduct = product;
			}
		}
		return maxProduct;
	}

	public static void main(String[] args) {
		
		int maxProduct=palindrom(100,999);
		System.out.println("Max Product for 3 digits is: "+maxProduct);
		maxProduct=palindrom(1000,9999);
		System.out.println("Max Product for 4 digits is: "+maxProduct);
	}

}
