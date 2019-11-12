import java.util.*;
public class Stringul {
	static int nr_vocale( String s) {
		int contor = 0;
		if(s.length()==0)
			return 0;
		for( int i =0 ; i < s.length() ; i++)
		{		if(s.charAt(i)=='a' || s.charAt(i) == 'e'||
				s.charAt(i) == 'i' || s.charAt(i) == 'o' ||
				s.charAt(i) == 'u' || s.charAt(i) == 'A' || 
				s.charAt(i) == 'E' || s.charAt(i) == 'I' ||
				s.charAt(i) == 'O' || s.charAt(i) == 'U')
			contor ++;
		}
		return contor;
	}
	static int nr_consoane(String s)
	{
		int contor =0;
		if(s.length() == 0)
			return 0;
		for(int i = 0 ; i < s.length() ;i++)
		{
			if(s.charAt(i)!='a' && s.charAt(i) != 'e'&&
					s.charAt(i) != 'i' && s.charAt(i) != 'o' &&
					s.charAt(i) != 'u' && s.charAt(i) != 'A' && 
					s.charAt(i) != 'E' && s.charAt(i) != 'I' &&
					s.charAt(i) != 'O' && s.charAt(i) != 'U' && s.charAt(i) >= 'A' && s.charAt(i)<='z')
				contor++;			
		}
		return contor;		
	}
	
	public static void main(String[] args) {
		
		String cuvant = "aaaaaa";
		char vocala;
		Scanner in = new Scanner(System.in);
		
		
		
		System.out.println(cuvant + "\n" + "Numar Vocale = " + nr_vocale(cuvant) + "\n" + "Numar consoane = " + nr_consoane(cuvant));
		System.out.println("Introduceti o vocala ");
		vocala = in.next().charAt(0);
		in.close();
		for(int i = 0 ;i < cuvant.length();i++)
		{
			if(cuvant.charAt(i)== vocala)
				System.out.print(i + " ");
		}
	
	}
}
