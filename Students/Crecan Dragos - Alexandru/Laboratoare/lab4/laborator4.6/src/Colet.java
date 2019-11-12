
public class Colet extends Curier {
	String numeColet;
	int nrColet;
	boolean statusLivrare;
	
	public Colet() {
		this.nrColet = 0;
		this.numeColet = "Colet";
		this.statusLivrare = false;
	}
	
	public Colet(String numeColet, int nrColet, boolean statusLivrare) {
		this.numeColet = numeColet;
		this.nrColet = nrColet;
		this.statusLivrare = statusLivrare;
	}
	
	public void setNumeColet(String numeColet) {
		this.numeColet = numeColet;
	}
	
	public void setNrColet(int nrColet) {
		this.nrColet = nrColet;
	}
	
	public void setStatusLivrare(boolean statusLivrare) {
		this.statusLivrare = statusLivrare;
	}
	
	public String getNumeColet() {
		return this.numeColet;
	}
	
	public int getNrColet() {
		return this.nrColet;
	}
	
	public boolean getStatusLivrare() {
		return this.statusLivrare;
	}

}
