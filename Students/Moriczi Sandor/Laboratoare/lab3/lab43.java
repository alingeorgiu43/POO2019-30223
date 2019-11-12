package lab3_1;

import java.util.Scanner;

public class lab43 {

	public static void main(String[] args) {
		String s="Laborator programare";
		s=s.toUpperCase();
		int voc=0,con=0;
		String svoc="AEIOU";
		for (int i=0; i<s.length(); i++)
			if (svoc.indexOf(s.charAt(i))!=-1)
				voc++;
			else
				if (Character.isLetter(s.charAt(i)))
					con++;
				
		System.out.println("Vocale="+voc+" Consoane="+con);
		
		System.out.println("Dati o vocala:");
		Scanner scan=new Scanner(System.in);
		String cons=scan.nextLine();
		cons=cons.toUpperCase();
		System.out.println("Pozitiile pe care apare vocala: ");
		for (int i=0; i<s.length(); i++)
			if (s.charAt(i)==cons.charAt(0))
				System.out.print(i+" ");
		scan.close();
	}
}
