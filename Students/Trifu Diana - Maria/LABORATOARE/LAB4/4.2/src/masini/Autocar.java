package masini;

public class Autocar extends autovehicul {
	public int nrLocuri;
	public int nrSoferi;
	public float presiuneRoti;
	
	public int newSofer(int nrSoferi, int experienta) {
		if(experienta>3)
			this.nrSoferi = nrSoferi + 1;
		
		return nrSoferi;
	}
}
