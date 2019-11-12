package laborator4;

public class SoferCamion extends Sofer{

	public SoferCamion(String nume, String prenume, int varsta, int permis, String firma, int experienta) {
		super(nume, prenume, varsta, permis);
		this.numeFirma=firma;
		this.nrAniExperienta=experienta;
	}
	public String numeFirma;
	public int nrAniExperienta;
	
	public SoferCamion()
	{
		this("Moldovan", "Alex",46,754,"Auchen",20);
	}
	
	public void setAniExperienta(int ani)
	{
		nrAniExperienta=ani;
	}
	public int getAniExperienta()
	{
		return nrAniExperienta;
	}
	public void setFirma(String firma)
	{
		numeFirma=firma;
	}
	public String getFirma()
	{
		return numeFirma;
	}
}
