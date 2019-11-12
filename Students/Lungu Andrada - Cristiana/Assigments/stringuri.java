package lab3;
import java.util.*;
public class stringuri {
	public static String conv(String s) {
		String s1="";
		if (s==null)
			s1=null;
		else
			if (s=="")
				s1="";
			else 
	
				if(s.indexOf(" ")==-1)
					s1=s;
				else {
					int i=s.indexOf(" ");
					int j=s.lastIndexOf(" ");
					if(i==j)
					{
						s1=s.substring(i+1,s.length())+", "+s.substring(0,i);
					}
					//else 
						/*String p=s.trim();
						String sir=s.substring(1,s.length()-2);
						if(s.startsWith(" ")&& (s.endsWith(" "))&& (p.indexOf(" ")==0))
							s1=s.trim();
						else 
						
							//String p1=s.trim();
					
							if((/*p.indexOf(" ")==p.lastIndexOf(" "))&& s.startsWith(" ")&& s.endsWith(" "))
							{
								//s1=s.trim();
								int k=p.indexOf(" ");
								s1=	p.substring(k+1,s1.length())+", "+p.substring(0,k);
							}*/
							else
								if(s.startsWith("Mr. Phd. ") )
								{
									int poz=s.indexOf(" ",7);
									int poz2=s.lastIndexOf(" ");
									s1=s.substring(poz2+1,s.length())+", "+s.substring(poz,poz2)+" Mr. Phd.";
								}
								else
									if(s.startsWith("Mrs. Phd. "))
									{
										{
											int poz=s.indexOf(" ",8);
											int poz2=s.lastIndexOf(" ");
											s1=s.substring(poz2+1,s.length())+", "+s.substring(poz,poz2)+" Mrs. Phd. ";
										}
									}
									else
										if(s.startsWith("Mr. ") )
										{
											int poz=s.indexOf(" ",3);
											int poz2=s.lastIndexOf(" ");
											s1=s.substring(poz2+1,s.length())+", "+s.substring(poz,poz2)+" Mr. ";
										}
										else
											if(s.startsWith("Mrs. ") )
											{
												int poz=s.indexOf(" ",4);
												int poz2=s.lastIndexOf(" ");
												s1=s.substring(poz2+1,s.length())+", "+s.substring(poz,poz2)+" Mrs. ";
											}
											else
											{
												String p=s.trim();
												if(p.indexOf(" ")!=0) {
													int k=p.indexOf(" ");
													s1=p.substring(k+1,p.length())+", "+p.substring(0,k);
												}
												else
												{
													s1=s.trim();
												}
											}
												
				
				}
		return s1;
		
	}
	public static void main(String[] args) {
		String s="Mr. Phd. FirstName LastName";
		String s1;
		s1=conv(s);
		System.out.println(s1);
		
	}
	
}
