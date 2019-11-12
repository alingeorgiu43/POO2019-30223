import java.util.Scanner;

public class numarVocaleConsoane {
	public static boolean cauta2(char a)
	{
		String x = "bcdfghjklmnpqrstvxzwyBCDFGHJKLMNPQRSTVXZWY";
		for(int i=0; i<x.length(); i++)
			if(x.charAt(i) == a)
				return true;
		return false;
	}
	
	public static boolean cauta(char a)
	{
		String x = "aeiouAEIOU";
		for(int i=0; i<x.length(); i++)
			if(x.charAt(i) == a)
				return true;
		return false;
	}
	public static void numarare(String x)
	{
		int v = 0;
		int c = 0;
		for(int i=0; i< x.length(); i++)
		{
			if(cauta(x.charAt(i)))
				v++;
			else if(cauta2(x.charAt(i)))
				c++;	
		}
			System.out.println(v+ " vowels");
			System.out.println(c + " consonants");
	}
	public static void litera(char x, String s)
	{
		int ok=0;
		System.out.println(x + " can be found at the following indexes: ");
		for(int i=0; i<s.length(); i++)
			if(s.charAt(i) == x)
			{
				ok++;
				System.out.println(i);
			}
		if(ok==0)
			System.out.println("Nu exista in sir");
	}
	public static void main(String[] args) {
		int a;
		String y;
		System.out.println("Apasati 1 daca doriti sa tastati un sir si 0 daca doriti sa folositi sirul default");
		Scanner keyboard = new Scanner(System.in);
		a = keyboard.nextInt();
		if(a==0) 
		{
			y = "Killa Fonic (numele de scena al lui Ionut Raducanu) este un trapper român. In prezent activeaza ca artist solo, dupã iesirea în 2019 din trupa Satra B.E.N.Z Killa Fonic si-a creat propiul sau label pe nume KHK (Killa House Klan).";
		}
		else
		{
			Scanner tastatura = new Scanner(System.in);
			System.out.println("Introduceti text");
			y = tastatura.nextLine();
		}
		System.out.println("Sirul este " + y);
		numarare(y);
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Introduceti litera cautata");
		char c = myScanner.next().charAt(0);
		litera(c, y);
		myScanner.close();
		keyboard.close();
	}

}