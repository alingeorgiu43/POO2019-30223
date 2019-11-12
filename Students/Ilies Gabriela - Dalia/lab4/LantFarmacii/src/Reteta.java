
public class Reteta {
	private Medicament[] medicament=new Medicament[3];
	private String numePacient;
	
	public String getNumePacient() {
		return numePacient;
	}
	public void setNumePacient(String numePacient) {
		this.numePacient = numePacient;
	}
	
	public Medicament[] getMedicament() {
		return medicament;
	}
	
	public void setMedicament(Medicament[] medicamente) {
		for(int i=0; i<medicamente.length; i++)
			this.medicament[i]=medicamente[i];
	}

	public double calculeazaPret()
	{
		double pret=0;
		for(int i=0; i<medicament.length; i++)
			pret=this.medicament[i].getPret()+pret;
		return pret;
	}
}
