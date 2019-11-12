
public class Rezervor {
	private int capacitateMax;
	private int cantitate;
	
	public int getCantitate() {
		return this.cantitate;
	}
	
	public void setCantitate(int newCantitate) {
		this.cantitate = newCantitate;
	}
	
	public int getCapacitateMax() {
		return this.capacitateMax;
	}
	
	public void setCapacitateMax(int newCapacitateMax) {
		this.capacitateMax = newCapacitateMax;
	}
	
	
	
	public Rezervor(int cantitate, int capacitateMax) {
		this.cantitate = cantitate;
		this.capacitateMax = capacitateMax;
	}

	public void rezervorGol(int capacitate) {
		if(capacitate == 0) {
			System.out.println("Masina a ramas fara benzina!");
		}
	}
	
	public void alimentare(int nrLitri) {
		if(cantitate<capacitateMax) {
			cantitate += nrLitri;
		}
		if(cantitate == capacitateMax) {
			System.out.println("Rezervorul este la limita.");
			cantitate += nrLitri;
		}
		else if(cantitate > capacitateMax){
			System.out.println("Prea multa benzina!");
			cantitate = capacitateMax;
		}
		System.out.println("Rezervorul are acum (L): "+' '+cantitate);
	}
}
