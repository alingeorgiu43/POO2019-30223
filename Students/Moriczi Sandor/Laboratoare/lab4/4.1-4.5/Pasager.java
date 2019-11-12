package laborator4;

public class Pasager {

	public String nume;
	public String prenume;
	public int varsta;
	public String job;
	public Pasager(String nume, String prenume, int varsta, String job)
	{
		this.nume=nume;
		this.prenume=prenume;
		this.varsta=varsta;
		this.job=job;
	}
	public Pasager()
	{
		this("Moriczi", "Sanyi",19,"Nu are");
	}
	public String toString()
	{
		return "pasagerul este: " + nume + " " + prenume;
	}
	public void setFullName(String nume, String prenume)
	 {
		 this.nume=nume;
		 this.prenume=prenume;
	 }
	public String getName()
	 {
		 return nume;
	 }
	 public String getPrenume()
	 {
		 return prenume;
	 }
}
