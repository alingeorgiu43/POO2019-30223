package lab3pr3;
import java.util.*;


public class MainClass {
	
	public static int vocale(String s) {
		int k=0;
		for(int i=0;i<s.length();i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'|| s.charAt(i) == 'o' || s.charAt(i) == 'u')
				k++;
			
		}
		return k;
		
	}
	
	
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		String cuvant=in.nextLine();
		int v=vocale(cuvant);
		int c=cuvant.length()-v;
		System.out.println(v);
		System.out.println(c);
	}
}
