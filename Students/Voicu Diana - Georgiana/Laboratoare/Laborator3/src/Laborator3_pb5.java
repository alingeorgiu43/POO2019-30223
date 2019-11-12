import java.util.Random;
import java.util.Scanner;
public class Laborator3_pb5 {
	public static void main(String[] args) {
		int n = 49;
		Scanner scaneaza = new Scanner(System.in);
		int a[]= new int[6];
		int b[]= new int[6];
		System.out.println("Intorduceti numerele dvs. : ");
		for(int i=0;i<6;i++)
		{
			b[i] = scaneaza.nextInt(); //imi citesc array-ul introdus de la tastatura
		}
		Random rand = new Random();
		// generez random 6 numere pentru array
		a[0]= rand.nextInt(n);
		a[1]= rand.nextInt(n);
		a[2]= rand.nextInt(n);
		a[3]= rand.nextInt(n);
		a[4]= rand.nextInt(n);
		a[5]= rand.nextInt(n);
		
		/*a[0]=1;
		a[1]=1;
		a[2]=2;       //am facut proba pe un vector mai mic sa imi verific for-ul ce urmeaza.
		a[3]=3;
		a[4]=5;
		a[5]=3; */
		for(int i=0;i<6;i++)
		{
			if(a[i]==0) //a[i] nu trebuie sa fie 0 deoarece numerele sunt de la 1-49.
			{
				a[i]= rand.nextInt(n); // daca e 0, generez alt numar.
			}
			for(int j=i+1;j<6;j++) {
				if(a[i]==a[j]) //Verific daca 2 nr. au fost generate la fel, si le schimb, deoarece
				{				// nu am voie sa lucrez cu duplicate in acest joc, conform wikipedia.
					a[j]= rand.nextInt(n);
				}
			}
		}
		
		for(int i=0;i<6;i++)
		{
			System.out.print(a[i]+" "); // imi printez rezultatele ca sa le pot observa.
		}
		int ct=0;
		for(int i=0; i<a.length; i++)
		{
			for(int j=i;j<b.length;j++)
			{
				if (a[i] == b[j]) // verific daca vreun numar introdus de la tastatura este egal cu
				{				// numarul generat random, respectiv "tras la sorti".
					ct++; // daca este egal, incrementez un contor.
				}
			}
		}
		if(ct!=0) 
		{
			if(ct == 6 ) // daca contorul este 6, inseamna ca toate nr. sunt la fel => conform regulilor
			{				// ca am castigat potul cel mare.
				System.out.println(" ");
				System.out.println("Ati castigat potul cel mare!");
			}
			else
			{
				System.out.println(" ");
				System.out.println("Ati obtinut un castig partial."); // altfel daca am un contor >0 dar,
			} //acesta nu este 6, am sa obtin castiguri partiale.
		}
		else
		{
			System.out.println(" ");
			System.out.println("Necastigator."); // in cazul in care contorul meu este 0 => necastigator.
		}
		
	} 

}
