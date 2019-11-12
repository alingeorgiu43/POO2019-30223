import java.util.Scanner;

public class GoldbachConjecture {
	
	static boolean IsPrime(int x) {
		if(x <= 1)
			return false;
		for(int d=2; d <= x/2; d++) {
			if(x % d == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		for(int i=m; i<=n; i++)
			for(int j=1; j<i; j++)
				if(IsPrime(j) && IsPrime(i-j)) {
					int s = i-j;
					System.out.println("Nr " + i + " verifica conjectura lui Goldbach: " + j + "+" + s);
				}
				

	}

}
