
public class Aeroport {
	private String nume;
	private int nrAvioane;
	
	private String adresa;
	
	public void setNume(String nume)
	{
		 this.nume=nume;
	}
	public void setNrAvioane(int nrAvioane)
	{
		 this.nrAvioane=nrAvioane;
	}
	public void setAdresa(String adresa)
	{
		this.adresa=adresa;
	}
	public String getNume()
	{
		return this.nume;
	}
	public int getNrAvioane()
	{
		return this.nrAvioane;
	}
	public String getAdresa(String adresa)
	{
		return this.adresa;
	}
	public String toString()
	{
		return this.nume + " " + this.adresa + " " + this.nrAvioane;
	}
}

