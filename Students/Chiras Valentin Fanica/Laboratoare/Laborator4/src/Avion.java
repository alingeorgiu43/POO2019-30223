
public class Avion extends Aeroport{
	private String nume;
	private int nrLocuri;
	private String companie;
	private String cursa;
	private int distanta;
	private int oraPlecare;
	private int oraSosire;
	
	public void setNume(String nume)
	{
		this.nume=nume;
	}
	public void setNrLocuri(int nr)
	{
		this.nrLocuri=nr;
	}
	public void setCompanie(String nume)
	{
		this.companie=nume;
	}
	public void setCursa(String nume)
	{
		this.cursa=nume;
	}
	public void setDistanta(int distanta)
	{
		this.distanta=distanta;
	}
	public void setOraPlecare(int ora)
	{
		this.oraPlecare=ora;
	}
	public void setOraSosire(int ora)
	{
		this.oraSosire=ora;
	}
	public String getNume()
	{
		return this.nume;
	}
	public int getNrLocuri()
	{
		return this.nrLocuri;
	}
	public String setCompanie()
	{
		return this.companie;
	}
	public String setCursa()
	{
		return this.cursa;
	}
	public int setDistanta()
	{
		return this.distanta;
	}
	public int setOraPlecare()
	{
		return this.oraPlecare;
	}
	public int setOraSosire()
	{
		return this.oraSosire;
	}
	public String toString()
	{
		return this.nume + " " + this.companie + " " + this.cursa + " "+
	this.distanta + " " + this.nrLocuri + " " + this.oraPlecare + " " + this.oraSosire;
	}
	
}
