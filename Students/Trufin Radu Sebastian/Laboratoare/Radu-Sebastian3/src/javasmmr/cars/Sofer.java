package javasmmr.cars;
public class Sofer 
{
	private String nume;
	private String prenume;
	private Integer varsta;
	private Integer numar_permis;

	Sofer()
	{
		this.nume = "<Unknown name";
		this.prenume = "<Unknown surname>";
		this.varsta = 0;
		this.numar_permis = 0;
	}
	
	Sofer(String nume, String prenume, int varsta, int numar_permis)
	{
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.numar_permis = numar_permis;
	}
	
	public String getName()
	{
		return this.nume;
	}
	
	public String getSurname()
	{
		return this.prenume;
	}
	
	public int getAge()
	{
		return this.varsta;
	}
	
	public int getPassCode()
	{
		return this.numar_permis;
	}
}
