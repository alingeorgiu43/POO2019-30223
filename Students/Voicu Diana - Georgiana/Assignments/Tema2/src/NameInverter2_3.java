import java.util.Scanner;
public class NameInverter2_3
{
	public static String InversareString(String myString)
	{
		if (myString == null) 	//daca stringul e null
			return null;		//print null

		String PrimulNume = "";
		String AlDoileaNume = "";
		String MrSAUMrs = "";
		String Phd = "";

		//String str = myString.strip(" ");	-elimina spatiile de la inceputul si de la sfarsitul stringului
		//dar din pacate nu e definit pt. aceasta versiune de Java.
		String str= myString;
		String trim = str.trim(); 			//elimina spatiile albe extra din interiorul stringului
		String[] word = str.split("\\s+"); 	//imparte stringul in cuvinte
		
		int nrCuvinte;
		nrCuvinte = trim.split("\\s+").length; //nrCuvinte e numarul de cuvinte din string

		for (int i = 0; i < nrCuvinte; i++) //parcurgem stringul cuvant cu cuvant
		{
			if (word[i].equals("Mr."))			//daca gasim "Mr.", il salvam in MrSAUMrs
				MrSAUMrs = "Mr. ";
			else if (word[i].equals("Mrs."))	//daca gasim "Mrs.", il salvam in MrSAUMrs
				MrSAUMrs = "Mrs.";
			else if (word[i].equals("Phd."))	//daca gasim "Phd.", il salvam in Phd
				Phd = "Phd. ";
			else if (PrimulNume.equals(""))		//daca stringul PrimulNume e inca gol, citeste PrimulNume
				PrimulNume = word[i] + " ";		
			else if (AlDoileaNume.equals(""))	//daca stringul AlDoileaNume e inca gol, citeste AlDoileaNume
				AlDoileaNume = word[i] + ", ";
		}
		return (AlDoileaNume + PrimulNume + MrSAUMrs + Phd);	//returneaza sirul in ordinea dorita
	}

	public static void main(String[] args)
	{
		
		//Give your own string
		System.out.println("Introduceti un string=");
		Scanner scaneaza = new Scanner(System.in);
		String s= scaneaza.nextLine();
		System.out.println(InversareString(s));
		
		
		
		
	}
}