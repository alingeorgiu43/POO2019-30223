//functie ce calculeaza cel mai mare palindrom al carui produs e de two n-digits numbers
public class LargestPalindrome {
	public static int LargestPal(int n) {
		int max_limit = 0;
		for(int i=1; i<=n; i++) { // lopp to calculate upper bound
			max_limit *= 10;
			max_limit += 9;
		}
		
		int min_limit = 1 + max_limit / 10; //1+largest number of n-1 digits is lower limit
		
		int pmax = 0; // produsul maxim initializat
		for(int i = max_limit; i >= min_limit; i--) {
			for(int j=i; j >= min_limit; j--) {
				int p = i*j; //produsul a 2 n-digits nr
				if(p < pmax)
					break;
				int nr = p;
				int ogl = 0;
				//calculez oglinditul produsului ca sa verific daca e palindrom sau nu
				while(nr != 0) {
					ogl = ogl*10 + nr%10;
					nr = nr/10;
				}
				
				if(p == ogl && p>pmax)
					pmax = p;
			}
		}
		return pmax;
	}
	public static void main(String[] args) {
		int n=3;
		System.out.println(LargestPal(n));
		int k=4;
		System.out.println(LargestPal(k));
		
	}

}
