
public class Sofer {
	private String Nume;
	private String Prenume;
	private int varsta;
	private String numar_permis;
	
	public void set_nume(String c)
	{
		 Nume=c;
	}
	public void set_prenume(String c)
	{
		Prenume=c;
		
	}
	public void set_varsta(int v)
	{
		 varsta=v;
	}
	public void set_numar_permis(String c)
	{
		 numar_permis=c;
	}
	
	public String get_nume()
	{
		 return Nume;
	}
	public String get_prenume()
	{
		 return Prenume;
		 
	}
	
	public int get_varsta()
	{
		return varsta;
	}
	public String get_nr_permis()
	{
		return numar_permis;
	}
	
	public void set_characteristics_sofer(Sofer Sofer_1,String nume_1,String Prenume_1,int varsta_1,String numar_permis_1)
	{ Sofer_1.set_nume(nume_1);
	  Sofer_1.set_prenume(Prenume_1);
	  Sofer_1.set_varsta(varsta_1);
	  Sofer_1.set_numar_permis(numar_permis_1);
	  System.out.println("  Soferul  "+ get_nume() +"   "+ get_prenume()+ "  are varsta de  " + get_varsta()+ " ani   si numarul permisului lui este  " + get_nr_permis());
		
	}
	

}
