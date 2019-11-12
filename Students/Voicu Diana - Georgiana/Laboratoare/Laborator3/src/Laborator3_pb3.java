import java.util.Scanner;
import java.io.IOException;
public class Laborator3_pb3 {
	public static void main (String[] args) throws IOException {
		System.out.println("Introduceti un string=");
		Scanner scaneaza = new Scanner(System.in);
		String s= scaneaza.nextLine();
		int vocale=0;
		int consoane=0;
		System.out.println("Introduceti vocala pe care doriti sa o cautati=");
		char c= (char) System.in.read();
		//referinta pentru stringul s
		s=s.toLowerCase();
		for(int i=0; i<s.length(); i++) {
			char ch=s.charAt(i);
			if ((ch == 'a')||(ch == 'e')||(ch == 'i')||(ch == 'o')||(ch == 'u')) {
				vocale++;
			}
			else if(('a'<=ch)&&(ch<='z'))
			{
				consoane++;
			}
			if(ch == c)
			{
				System.out.println("Indicele la care se gaseste vocala este= " + i);
			}
		}
		
		System.out.println("Nr de vocale este= "+vocale);
		System.out.println("Nr de consoane este= "+consoane);
		
		
	}
}
