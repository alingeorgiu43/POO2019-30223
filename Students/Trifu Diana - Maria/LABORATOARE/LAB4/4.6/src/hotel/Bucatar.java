package hotel;

public class Bucatar extends Personal{
	public int nrPortii;
	public int ture;

	public int castig(int ture, int nrPortii) {
		if((ture > 2) && (nrPortii > 100))
			this.salariu = 2000 + nrPortii * 4;
		else 
			this.salariu = 2250;
		return salariu;
	}
}
