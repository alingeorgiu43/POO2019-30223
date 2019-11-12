import java.util.Scanner;

public class ConsoaneVocale {

	public static void main(String[] args) {
		String s = "Consoane si vocale";
		int nr_consoane = 0;
		int nr_vocale = 0;
		
		s = s.toLowerCase();
		
		for(int i=0; i< s.length(); i++) {
			char c = s.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				nr_vocale++;
			}
			else if(c >= 'a' && c <= 'z') {
				nr_consoane++;
			}
		}
		System.out.println("Nr vocale: " + nr_vocale);
		System.out.println("Nr consoane: " + nr_consoane);
		
		
		
		Scanner val = new Scanner(System.in);
		char ch = val.next().charAt(0);
		switch(ch) {
			case 'a' :
			case 'A' :
			case 'e' :
			case 'E' :
			case 'i' :
			case 'I' :
			case 'o' :
			case 'O' :
			case 'u' :
			case 'U' : 
				System.out.println(ch + " este vocala");
				break;
			default:
				System.out.println(ch + " este consoana");
		}
		
	}

}
