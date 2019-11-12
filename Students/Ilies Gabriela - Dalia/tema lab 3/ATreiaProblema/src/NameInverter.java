import java.util.*;
public class NameInverter {
	public static void main(String argv[])
	{
		Scanner input=new Scanner(System.in);
		String propozitie=input.nextLine();
		String ss=returnare(propozitie);
		System.out.print(ss);
	
	}
	
	
	public static String returnare(String str)
	{
		String s=new String();
		if(str=="")
			s="";
		else
		{
			int ok=0;
			int poz=0;
			if (str.charAt(0)!=' ') 
			{
				for(int i=0; i<str.length(); i++)
					if (str.charAt(i)==' ')
					{
						ok++;
						poz=i;
					}
				if (ok==0)
					s=str;
				else 
					if (ok==1)
				{
					for(int i=poz+1; i<str.length(); i++)
						s=s.concat(Character.toString(str.charAt(i)));
					s=s.concat(", ");
					for(int i=0; i<poz; i++)
						s=s.concat(Character.toString(str.charAt(i)));
				}
					else
						if (ok==2)
						{
							String aux=" ";
							int j=0;
							while (str.charAt(j)!=' ')
							{
								aux=aux.concat(Character.toString(str.charAt(j)));
								j++;
							}
							for(int i=poz+1; i<str.length(); i++)
								s=s.concat(Character.toString(str.charAt(i)));
							s=s.concat(", ");
							for(int i=j+1; i<poz; i++)
								s=s.concat(Character.toString(str.charAt(i)));
							s=s.concat(aux);
						}
						else
							if (ok==3)
							{
								String aux=" ";
								int j=0;
								int spatii=0;
								while (spatii!=2)
								{
									aux=aux.concat(Character.toString(str.charAt(j)));
									j++;
									if (str.charAt(j)==' ')
										spatii++;
								}
								
							
							for(int i=poz+1; i<str.length(); i++)
								s=s.concat(Character.toString(str.charAt(i)));
							s=s.concat(", ");
							for(int i=j+1; i<poz; i++)
								s=s.concat(Character.toString(str.charAt(i)));
							s=s.concat(aux);
							}
					
			}
			else
				if(str.charAt(0)!=' ')
			{
				ok=0;
				for(int i=0; i<str.length()-1; i++)
					if (str.charAt(i)==' ')
					{
						ok++;
						poz=i;
					}
				if (ok==0)
					for(int i=1; i<str.length(); i++)
						s=s.concat(Character.toString(str.charAt(i)));
				else
				{
					for(int i=poz+1; i<str.length()-1; i++)
						s=s.concat(Character.toString(str.charAt(i)));
					s=s.concat(", ");
					for(int i=1; i<poz; i++)
						s=s.concat(Character.toString(str.charAt(i)));
				}
			}
		}
			return s;
		
	}		
	
}
