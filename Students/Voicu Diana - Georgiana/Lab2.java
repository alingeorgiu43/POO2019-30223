import java.util.Scanner;
import java.math.BigInteger;
public class Lab2 {
	public static void main (String[] args) {
		//6.1
		System.out.println("Hello world.");
		
		//6.2
		// Initializam Scanner
		Scanner Scannerinput = new Scanner(System.in);
		
		// Citim un intreg + afisam
		System.out.println("Dati un intreg ");
		int val = Scannerinput.nextInt();
		System.out.println("S-a citit " + val);
		
		//  Citim un numar real + afisam
		System.out.println("Dati un float");
		float val2 = Scannerinput.nextFloat();
		System.out.println("S-a citit " + val2); 
		
		//6.3
		
		//6.3.1
		System.out.println(Short.MAX_VALUE+1); // 32768 
		System.out.println(Integer.MAX_VALUE+1); // -2147483648 - trece de limita maxima si afiseaza limita inferioara, practic se reseteaza 
		System.out.println(Long.MAX_VALUE+1); // -9223372036854775808 - la fel
		System.out.println(Byte.MAX_VALUE+1);
		
		//6.3.2
		System.out.println(Short.MAX_VALUE-1); // 32766 - numerele se afla in limite normale, scaderea se realizeaza fara probleme
		System.out.println(Integer.MAX_VALUE-1); // 2147483646 - la fel
		System.out.println(Long.MAX_VALUE-1); // 9223372036854775806 - la fel
		System.out.println(Byte.MAX_VALUE-1);
		//Daca se incearca o scadere mai mare decat valoarea maxima, ne da eroare in compilator,
		//deoarece numarul introdus nu mai reprezinta un numar valid tipului folosit.
		
		//6.3.3
		float nrfloat = 1.11324386759f;
		System.out.println(nrfloat);
		//Afiseaza 6/7 zecimale dupa virgula si ultima zecimala este aproximata prin adaos/lipsa sau nu este aproximata, in functie de numar.
		
		//6.3.4
		float nrfloat1 = 70.0123456789111f;
		float nrfloat2 = 30.0000005467832f;
		float sum;
		sum= nrfloat1+nrfloat2;
		System.out.println("Suma este= "+sum);
		//Se efectueaza adunarea doar primelor 6/7 zecimale, urmatoarea nu mai este luata in considerare, iar ultima, 
		//este fie aproximata prin lipsa, fie prin adaos, in functie de nr introduse.
		
		//6.4
		BigInteger suma;
		BigInteger putere;
		suma = BigInteger.valueOf(1);
		putere = BigInteger.valueOf(1);
		for(int i=0;i<63;i++)
		{
			putere=putere.multiply(BigInteger.valueOf(2));
			suma= suma.add(putere);
		}
		System.out.println("Boabe de grau = " + suma); //18446744073709551615
		
		
		
		
		
		
		
	}
}
