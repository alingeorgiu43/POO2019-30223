
public class Spectator {
	private String nume;
	private String prenume;
	private int varsta;
	private int nrCrt;
	
	public Spectator (String nume, String prenume, int varsta, int nrCrt) {
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.nrCrt = nrCrt;
	}
	
	public String getNume() {
		return this.nume;
	}

	public void setNume(String newNume) {
		this.nume= newNume;
	}

	public String getPrenume() {
		return this.prenume;
	}

	public void setPreume(String newPrenume) {
		this.prenume= newPrenume;
	}

	public int getVarsta() {
		return this.varsta;
	}

	public void setVarsta(int newVarsta) {
		this.varsta = newVarsta;
	}

	public int getNrCrt() {
		return this.nrCrt;
	}

	public void setNrCrt(int newNrCrt) {
		this.nrCrt = newNrCrt;
	}
	
	public int grupeVarsta(Spectator a,BileteTeatru b) {
		int ct=0;
		if(varsta >= 18 && varsta <25) {
			System.out.println("Acest Spectator prezinta o reducere de student de 10%.");
			ct=1;
		}
		else if(25<= varsta && varsta <= 60) {
			System.out.println("Acest Spectator plateste pret intreg.");
			ct=2;
		}
		else if(varsta > 60) {
			System.out.println("Acest Spectator prezinta o reducere de senior de 20%.");
			ct=3;
		}
		return ct;
	}
	
	
}
