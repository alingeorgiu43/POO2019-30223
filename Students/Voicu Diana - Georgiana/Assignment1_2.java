import java.util.Scanner;

public class Assignment1_2 {
	public static void main(String[] args) {
		Scanner Scannerin = new Scanner(System.in);
		System.out.println("Dati n=");
		int n = Scannerin.nextInt();
		int t1 = 1; // termen 1
		int t2 = 2; // termen 2
		int t3; // termen 3
		int suma = 0;
		for (int i=1; i<n; i++) {
			t3 = t1 + t2; // se creeaza noul termen
			t1 = t2; // 
			t2 = t3;
			if (t2 < 4000000) { // sa nu depaseasca 4000000
				if (t1 % 2 == 0) { // sa fie par
					suma = suma + t1; // cond indeplinite => suma
				}
			} 
				else {
				System.out.println("Termenul a depasit valoarea 4.000.000.");
			}
		}
		System.out.println("Suma=" + suma);
		// Cand termenul nou depaseste 4000000, suma va ramane suma anterioara.
	}
}
