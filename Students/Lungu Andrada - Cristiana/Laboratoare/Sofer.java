package laborator4;


public class Sofer {
	private String nume;
	private String prenume;
	private int varsta;
	private String numar_permis;
	
	Sofer(){
		nume=null;
		prenume=null;
		varsta=0;
		numar_permis=null;
	}
	public Sofer getsofer() {
		Sofer s=new Sofer() ;
		return s;
	}
	
	public String getNume() {
		return this.nume;
	}
	public String getPrenume() {
		return this.prenume;
	}
	public int getVarsta() {
		return this.varsta;
	}
	public String getNrPerm() {
		return this.numar_permis;
	}
	public void setNume(String nume) {
		this.nume=nume;
	}
	public void setPrenume(String prenume) {
		this.prenume=prenume;
	}
	public void setVarsta(int varsta) {
		this.varsta=varsta;
	}
	public void setNrPerm(String numar_permis) {
		this.numar_permis=numar_permis;
	}

	}
