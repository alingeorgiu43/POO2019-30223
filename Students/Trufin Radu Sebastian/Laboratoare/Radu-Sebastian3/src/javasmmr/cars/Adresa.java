package javasmmr.cars;

public class Adresa 
{
	private String strada;
	private String oras;
	private String cod_postal;
	private String stat;
	
	public Adresa()
	{
		this.strada = "<Unknown street>";
		this.oras = "<Unknown city>";
		this.cod_postal = "<Unknown postcode>";
		this.stat = "<Unknown country>";
	}
	
	public Adresa(String street, String city, String postcode, String country)
	{
		this.strada = street;
		this.oras = city;
		this.cod_postal = postcode;
		this.stat = country;
	}
	
	public void setStreet(String street)
	{
		this.strada = street;
	}
	
	public void setCity(String city)
	{
		this.oras = oras;
	}
	
	public void setPostCode(String postcode)
	{
		this.cod_postal = postcode;
	}
	
	public void setCountry(String country)
	{
		this.stat = country;
	}
	
	public String getStreet()
	{
		return this.strada;
	}
	
	public String getCity()
	{
		return this.oras;
	}
	
	public String getPostCode()
	{
		return this.cod_postal;
	}
	
	public String getCountry()
	{
		return this.stat;
	}
	
}
