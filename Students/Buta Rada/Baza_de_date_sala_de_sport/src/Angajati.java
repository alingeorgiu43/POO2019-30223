
public class Angajati {
 private String nume;
 private String varsta;
 private String ocupatie;
 private String salar;
 
 public void set_nume(String c)
	{
		 nume=c;
	}
	public void set_varsta(String c)
	{
		varsta=c;
		
	}
	public void set_ocupatie(String v)
	{
		 ocupatie=v;
	}
	public void set_salar(String c)
	{
		 salar=c;
	}
	
	public String get_nume()
	{
		 return nume;
	}
	public String get_varsta()
	{
		 return varsta;
		 
	}
	
	public String get_ocupatie()
	{
		return ocupatie;
	}
	public String get_salar()
	{
		return salar;
	}
	
	public void set_characteristics_angajat(Angajati Angajat_1,String nume_1,String varsta_1,String ocupatie_1,String salar_1)
	{ Angajat_1.set_nume(nume_1);
	  Angajat_1.set_varsta(varsta_1);
	  Angajat_1.set_ocupatie(ocupatie_1);
	  Angajat_1.set_salar(salar_1);
	  System.out.println(" \n Angajatul "+ get_nume() +"   "+ "  are varsta de  " + get_varsta()+ "  , este responsabil pentru ocupatia de  " + get_ocupatie()+"  avand un salar de " + get_salar() + " . ");
		
	}
}
