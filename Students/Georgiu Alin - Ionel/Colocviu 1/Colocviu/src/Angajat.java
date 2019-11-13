
public class Angajat extends Persoana {
	private String dataAngajare;
	private int nrClienti;

	private String info;

	Angajat() {
		this.dataAngajare = "Unknown";
		this.nrClienti = 0;
		this.info = "Unknown info";
	}

	Angajat(String dataAngajare, int nrClienti, String info) {
		this.dataAngajare = dataAngajare;
		this.nrClienti = nrClienti;
		this.info = info;
	}

	public void setNrClienti(int nrClienti) {
		this.nrClienti = nrClienti;
	}

	public int getNrClienti() {
		return this.nrClienti;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getInfo() {
		return this.info;
	}

	public void setDataAngajare(String dataAngajare) {
		this.dataAngajare = dataAngajare;
	}

	public String getDataAngajare() {
		return this.dataAngajare;
	}

}
