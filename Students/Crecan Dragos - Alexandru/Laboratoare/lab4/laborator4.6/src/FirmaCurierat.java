
public class FirmaCurierat {
	private String nume;
	private String oras;
	private int nrAngajati;
	private int nrColete;
	
	public FirmaCurierat() {
		this.nume = "Fan Curier";
		this.oras = "Bucuresti";
		this.nrAngajati = 15;
		this.nrColete = 100;
	}
	
	public FirmaCurierat(String nume, String oras, int nrAngajati, int nrColete) {
		this.nume = nume;
		this.oras = oras;
		this.nrAngajati = nrAngajati;
		this.nrColete = nrColete;
	}
	
	public void setName(String nume) {
		this.nume = nume;
	}
	
	public void setOras(String oras) {
		this.oras = oras;
	}
	
	public void setNeAngajati(int nrAngajati) {
		this.nrAngajati = nrAngajati;
	}
	
	public void setNrColete(int nrColete) {
		this.nrColete = nrColete;
	}
	
	public String getName() {
		return this.nume;
	}
	
	public String getOras() {
		return this.oras;
	}
	
	public int getNrAngajati() {
		return this.nrAngajati;
	}
	
	public int getNrColete() {
		return this.nrColete;
	}

}
