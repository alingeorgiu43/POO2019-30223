package asg1;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Introduceti numarul: ");
		int n = in.nextInt();
		int sum;
		sum=8;// Adaugam in suma numerele 3 si 5
		int i;
		
		for( i=6; i<n; i++ )
				if(i%3==0 || i%5==0)
				 sum=sum+i;
			
		System.out.println("Suma multiplilor lui 3 si 5 este: " + sum);
		
		
	}
}
