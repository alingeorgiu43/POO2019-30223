import java.util.Scanner;
public class Laborator3_pb4 {
	
	static double factorial(double n) 
    { 
        if (n == 0) 
          return 1; 
          
        return n*factorial(n-1); 
    } 
	public static void main (String[] args) {
		//Sansele de castig la loto 6/49 - Probabilitatea
		// Probabilitate = Nr. Cazuri Favorabile / Nr. Cazuri Posibile
		// Nr. cazuri favorabile = 1
		// Nr. cazuri posibile = Combinari de 49 luate cate 6. 
		 Scanner scaneaza = new Scanner(System.in);
		 System.out.println("Introduceti nr de numere din care se extrage =");
		 double n = scaneaza.nextDouble() ;
		 System.out.println("Introduceti nr de numere extrase =");
		 double k = scaneaza.nextDouble() ;
		 double combinari;
		 double probabilitate;
		 combinari = (factorial(n))/(factorial(n-k)*factorial(k));
		 probabilitate = 1/combinari;
		 System.out.println("Probabilitatea de a castiga la loto este= " + (probabilitate));
		 System.out.println("Deci probabilitate este foarte mica, de aprox. : 0,00000007.");
		 
		 
		 
	}
}
