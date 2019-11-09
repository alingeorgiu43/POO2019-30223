
public class Sofer {
	private String nume;
	private String prenume;
	private int varsta;
	private int numarPermis;
	
	public Sofer() {
		this.nume = "Georgiu";
		this.prenume = "Alin";
		this.varsta = 20;
		this.numarPermis = 99123456;
	}
	
	public Sofer(String nume,String prenume,int varsta,int numarPermis) {
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.numarPermis = numarPermis;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getNume() {
		return nume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setNumarPermis(int numarPermis) {
		this.numarPermis = numarPermis;
	}

	public int getNumarPermis() {
		return numarPermis;
	}
	public String toString()
	{
		return "Numele soferului este:" +getNume() + " " + getPrenume()+"\n";
	}
}
