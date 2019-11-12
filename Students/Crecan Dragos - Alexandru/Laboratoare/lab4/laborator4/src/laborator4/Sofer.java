package laborator4;

public class Sofer extends Autovehicul {
	private String nume;
	private String prenume;
	private int varsta;
	private int nrPermisDeConducere;
	
	public Sofer() {
		this.nrPermisDeConducere = 0;
		this.nume = "Domnul";
		this.prenume = "Sofer";
		this.varsta = 18;
	}
	
	public Sofer(String nume, String prenume, int varsta, int nrPermisDeConducere) {
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.nrPermisDeConducere = nrPermisDeConducere;
	}
	
	public void setName(String name) {
		this.nume = name;
	}
	
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	
	public void setNrPremisDeConducere(int nrPermisDeConducere) {
		this.nrPermisDeConducere = nrPermisDeConducere;
	}
	
	public String getName() {
		return this.nume;
	}
	
	public String getPrenume() {
		return this.prenume;
	}
	
	public int getVarsta() {
		return this.varsta;
	}
	
	public int getNrPermisDeConducere() {
		return this.nrPermisDeConducere;
	}
}
