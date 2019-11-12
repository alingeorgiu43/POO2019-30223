package laborator4;

public abstract class Carte {
	public String nume;
	public int nrPagini;
	public String editura;
	
	public void setName(String name)
	{
		nume=name;
	}
	public void setNrPagini(int pagini)
	{
		nrPagini=pagini;
	}
	public void setEditura(String editura)
	{
		this.editura=editura;
	}
	public String getName()
	{
		return nume;
	}
	public String gerEditura()
	{
		return editura;
	}
	public int getNrPagini()
	{
		return nrPagini;
	}
}
