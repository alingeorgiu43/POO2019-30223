
public abstract class LoterryChances {
	
	public static double getCombinations(int n,int k) {
		double rez=1;
		int var=n-k+1;
		for(int i=var;i<=n;i++) {
			rez=rez*i/k;
			if(k>1) {
				k--;
			}
			else
				k=1;
		}
		return rez;
	}
	
	public static void printWinProbability() {
		
		int n = 49;
		int k = 6;
		double rez = 1.0 / (double)(getCombinations(n,k));
		System.out.println("Probabilitatea de a castiga la 6 din 49 este: "+rez);

	}

	public static boolean winChances() {
		int[] winingNumbers = new int[] { 10, 12, 14, 16, 19, 7 };
		int[] alins_numbers = new int[7];
	
		for (int i = 1; i <= 6; i++) {
			int randomNumber = (int) (Math.random() * 50 + 1);
			alins_numbers[i] = randomNumber;
		}
		int correctNumbers = 0;
		for (int i = 1; i <= 6; i++) {
			for (int j = 0; j <= 5; j++) {
				if (winingNumbers[j] == alins_numbers[i]) {
					correctNumbers++;
				}
			}
		}
		if (correctNumbers == 6)
			return true;
		return false;

	}

}
