import java.util.Scanner;
public class VocaleSiConsoane {
	public static void main(String argv[])
	{
		Scanner input= new Scanner(System.in);
		String propozitie= input.nextLine();
		String sirVocale="aeiou";
		
		int vocale=0;
		int consoane=0;
		
		for(int i=0; i<propozitie.length(); i++)
		{
			int ok=0;
			for(int j=0; j<sirVocale.length(); j++)
				if (propozitie.charAt(i)==sirVocale.charAt(j))
				{
					vocale++;
					ok=1;
				}
			if (ok==0)
				consoane++;
		}
		System.out.println("sunt " + vocale +" vocale");
		System.out.println("sunt " + consoane +" consoane");
	
		String vocalaCitita=input.nextLine();
		int este=0;
		for(int i=0; i<propozitie.length(); i++)
		{
			if (propozitie.charAt(i)==vocalaCitita.charAt(0))
			{
				este++;
				System.out.println("pozitia la care se afla " + vocalaCitita.charAt(0) + " este "+ i);
			}
		}
		if (este==0)
			System.out.print(vocalaCitita.charAt(0) + "nu se gaseste in propozitie");
		
	}
}
