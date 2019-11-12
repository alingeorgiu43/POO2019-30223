package string;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		String litera;
		Scanner in = new Scanner(System.in);
		litera = in.nextLine(); 
		int indice = -1;
		String s = "dianatrifu";
		String vocale ="aeiou";
		int l = 0;
		int l1 = 0;
		l = s.length();
		l1 = vocale.length();
		int c = 0;
		int v = 0;
		for(int i=0; i<l; i++)
			for(int j=0; j<l1; j++)
				if(s.charAt(i) == vocale.charAt(j))
					v = v+1;
		c = l - v;	
		for(int i=0; i<l; i++)
			if(s.charAt(i) == litera.charAt(0))
				indice = i;
		
		if(indice == -1)
			System.out.println("Vocala nu se afla in string");
		else 
			System.out.println("Vocala se afla pe pozitia " + indice);
		
		System.out.println("In string sunt " + v + " vocale");
		System.out.println("In string sunt " + c + " consoane");
	}

}
