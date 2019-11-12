
public class Curier extends FirmaCurierat {
	private String numeCurier;
	private String prenumeCurier;
	private String numarDeTelefon;
	private int nrColeteLivrate;
	
	public Curier() {
		this.numeCurier = "Domnul";
		this.prenumeCurier = "Curier";
		this.numarDeTelefon = "0756943367";
		this.nrColeteLivrate = 0;
	}
	
	public Curier(String numeCurier, String prenumeCurier, String numarDeTelefon, int nrColeteLivrate) {
		this.numeCurier = numeCurier;
		this.prenumeCurier = prenumeCurier;
		this.numarDeTelefon = numarDeTelefon;
		this.nrColeteLivrate = nrColeteLivrate;
	}
	
	public void setNumeCurier(String numeCurier) {
		this.numeCurier = numeCurier;
	}
	
	public void setPrenumeCurier(String prenumeCurier) {
		this.prenumeCurier = prenumeCurier;
	}
	
	public void setNrDeTelefon(String numarDeTelefon) {
		this.numarDeTelefon = numarDeTelefon;
	}
	
	public void setNrColeteLivrate(int nrColeteLivrate) {
		this.nrColeteLivrate = nrColeteLivrate;
	}
	
	public String getNumeCurier() {
		return this.numeCurier;
	}
	
	public String getPrenumeCurier() {
		return this.prenumeCurier;
	}
	
	public String getNrDeTelefon() {
		return this.numarDeTelefon;
	}
	
	public int getNrColeteLivrate() {
		return this.nrColeteLivrate;
	}

}
