
public class Lista {
	private Carte[] carti = new Carte[2];


	public Carte[] getCarti() {
		return this.carti;
	}

	public void setCarti(Carte[] carti) {
		for (int i = 0; i < 2; i++)
			this.carti[i] = carti[i];
	}
	

	public void printareCartiImprumutate()
	{
		for(int i=0; i<2; i++)
		{
			carti[i].printareCarte(); 
		}
	}
}
