
public class NameInverter {
	public String Inverseaza( String Nume)
	{	
		if(Nume == null)
			return Nume;
		String[] cuvant= Nume.split(" ");
		if(cuvant.length == 1)
		{
			return cuvant[0];
		}
		else if(cuvant.length == 2)
		{
			return cuvant[1]+", "+cuvant[0];
			
		}
		else if(cuvant.length==3)
		{
			if(cuvant[0].compareTo("Mr.") !=0 && cuvant[0].compareTo("Mrs.")!=0)
			return " Format invalid";
		return cuvant[2]+", "+cuvant[1]+' '+cuvant[0];		
		}	
		else
		{
			if((cuvant[0].compareTo("Mr.") !=0 && cuvant[0].compareTo("Mrs.")!=0) || cuvant[1].compareTo("Phd.")!=0)
			return "Format invalid";
			return cuvant[3]+", "+cuvant[2]+' ' +cuvant[1]+' '+cuvant[0];	
		}
		
		
	}
	public static void main(String[] args) {
		NameInverter nume = new NameInverter();
		System.out.println(nume.Inverseaza(null));

	}

}
