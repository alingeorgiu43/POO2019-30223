import java.util.Scanner;

public class SumOfMultiples {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i<1000; i++) {
			if((i % 3 == 0) || (i % 5 == 0))
				sum = sum + i;
		}
		System.out.println(sum);
	
   
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number from the keyboard:");
	int nrTerms = scanner.nextInt();
	int suma = 0;
	for(int k = 0; k<nrTerms; k++) {
		if((k % 3 == 0) || (k % 5 == 0))
			suma = suma + k;
	}
	System.out.println(suma);
	
	
	
	
	
	}
}
