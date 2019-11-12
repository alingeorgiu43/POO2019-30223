import java.util.Scanner;
//Find the sum of all the multiplies of 3 or 5. 
public class Assignment1_1 {
	public static void main(String[] args) {
		Scanner Scannerinput = new Scanner(System.in);
		long suma = 0;
		System.out.println("Dati un numar=");
		int nr = Scannerinput.nextInt();
		if (nr != 3) {
			for (int i = 3; i < nr; i++) {
				if ((i % 3 == 0) || (i % 5 == 0)) {
					suma = suma + i;
				}
			}
		} else {
			suma = suma + nr;
		}
		System.out.println("Suma este= " + suma);
		//Am observat ca are loc overflow in momentul in care introducem nr: 100000, respectiv 10 la a 5-a.
		//Pentru long are loc overflow in momentul in care introducem nr: 10000000000, 10 la a 10-a.
		//Astfel ne este interzisa folosirea acestui nr ca exceptie la main.
		
	}
}
