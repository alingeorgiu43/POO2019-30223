package laborator4;


public class FirmaAngajat {
	private int vechime;
	private int salariu_oferit;
	 
	FirmaAngajat(){
		vechime=0;
		salariu_oferit=0;
	}
	
	public int getVechime() {
		return this.vechime;

	}
	public int getSalariu_oferit() {
		return this.salariu_oferit;
	}
	
	public void setVechime(int vechime) {
		this.vechime=vechime;
	}
	public void setSalariu_oferit(int salariu_oferit) {
		this.salariu_oferit=salariu_oferit;
	}
	
	public FirmaAngajat getfirma_angajat() {
		FirmaAngajat f=new FirmaAngajat() ;
		return f;
	}
}
