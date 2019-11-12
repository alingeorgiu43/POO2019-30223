import java.util.*;

public class StringMethod {
	public static String conv(String s) {
		
		String s1="";
		
		if(s==null)
			return null;
		else if(s.indexOf(" ")==-1)
			s1=s;
		else {
			int i = s.indexOf(" ");
			int l = s.lastIndexOf(" ");
			if(i == l) {s1=s.substring(i+1, s.length()) + ", " + s.substring(0,i);
		}
			else if(s.startsWith("Phd. ")) {
				int poz1 = s.indexOf(" ", 4);
				int poz2 = s.lastIndexOf(" ");
				s1 = s.substring(poz2+1, s.length()) + ", " + s.substring(poz1, poz2) + "Phd.";
			}
			else if(s.startsWith("Mr. ")) {
				int poz=s.indexOf(" ", 3);
				int poz1=s.lastIndexOf(" ");
				s1=s.substring(poz1+1, s.length()) + ", " +s.substring(poz, poz1) + " Mr. ";
			}
			else {
				String t = s.trim();
				if(t.indexOf(" ")!=0) {
					int it = t.indexOf("");
					s1 = t.substring(it+1, t.length())+", " + t.substring(0,it);
				}
				else {
					s1 = s.trim();
				}
			}
		}
		
		return s1;

	}
	public static void main(String[] args) {
		String s = "Mr. Phd. FirstName LastName";
		String s1 = conv(s);
		System.out.println(s1);
	}

}
