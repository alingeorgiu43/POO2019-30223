
public class Sofer extends FirmaDeTransport{
		private String  nume;
		private String prenume;
		private int varsta;
		private String nr_permis;
		
		Sofer(){
			this.nume=null;
			this.prenume=null;
			this.varsta=0;
			this.nr_permis=null;
		}
		Sofer(String nume,String prenume,int varsta,String nr_permis)
		{	
			
			this.nume=nume;
			this.prenume=prenume;
			this.varsta=varsta;
			this.nr_permis=nr_permis;
		}
	public String toString()
	{
		return "Sofer: "+ this.nume + " " + this.prenume + " " + this.varsta + " " +
				this.nr_permis;
	}
	public String getNume()
	{
		return this.nume;
	}
	public String getPrenume()
	{
		return this.prenume;
	}
	public int getVarsta()
	{
		return this.varsta;
	}
	public String getNrPermis()
	{
		return this.nr_permis;
	}
	public void setNume(String nume)
	{
		this.nume=nume;
	}
	public void setPrenume(String prenume)
	{
		this.prenume=prenume;
	}
	public void setVarsta(int varsta)
	{
		this.varsta=varsta;
	}
	public void setNrPermis(String nrPermis)
	{
		this.nr_permis=nrPermis;
	}
}
