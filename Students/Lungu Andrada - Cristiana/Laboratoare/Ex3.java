package lab3;
import java.util.*;
//import java.io;
public class Ex3 {
	public static int consoane(String s) {
		int cons = 0; 
		for(int i=0;i<s.length();i++)
			if( s.charAt(i)!='a' && s.charAt(i)!='e' && s.charAt(i)!='i' && s.charAt(i)!='o' && s.charAt(i)!='u' && s.charAt(i)!='A' && s.charAt(i)!='E' && s.charAt(i)!='I' && s.charAt(i)!='O' && s.charAt(i)!='U' && ((s.charAt(i)>='a' && s.charAt(i)<='z')||(s.charAt(i)>='A' && s.charAt(i)<='Z')))
				cons++;
		return cons;
		
	}
	public static int vocale(String s) {
		int voc = 0; 
		for(int i=0;i<s.length();i++)
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' ||s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
				voc++;
		return voc;
	}	
	
	//private static int length(String s) {
		// TODO Auto-generated method stub
		//return length(s);
	//}
	public static void indicii(String s) {
		for(int i=0;i<s.length();i++)
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' ||s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
				System.out.println("o vocala se afla pe pozitia"+i);
	}
	public static void main(String[] args) {
		String S=("Ana are mere");
		System.out.println(S.length());
		
		int cons=0;
		cons=consoane(S);
		int voc=0;
		voc=vocale(S);
		System.out.println("sunt "+voc +"vocale");
		System.out.println("sunte"+cons+"consoane");
		indicii(S);
	}

	

}
