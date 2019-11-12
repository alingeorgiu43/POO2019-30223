package hotel;

public class Menajera extends Personal{
	public int nrCamere;
	public int vechime;
	
	public int castig(int nrCamere, int vechime){
		if((nrCamere>10) && (vechime>8))
			this.salariu = 1500 + nrCamere * 10;
		else 
			this.salariu = 1350;
		return salariu;
	}
}
