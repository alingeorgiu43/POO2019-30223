
public class Senzori {
	private int frana;
	private int semnalizare;
	private int climatizare;
	
	public int getFrana () {
		return frana;
	}
	public int getSemnalizare () {
		return semnalizare;
	}
	public int getClimatizare () {
		return climatizare;
	}
	
	public void setFrana (int frana) {
		this.frana= frana;
	}
	public void setSemnalizare (int semnalizare) {
		this.semnalizare = semnalizare;
	}
	public void setClimatizare (int climatizare) {
		this.climatizare = climatizare;;
	}
	
	
	public Senzori(int frana, int semnalizare, int climatizare) {
		this.frana = frana;
		this.semnalizare= semnalizare;
		this.climatizare = climatizare;
	}
	
	public void verificare (int frana, int semnalizare, int climatizare) {
		if((frana == 1) && (semnalizare == 1) && (climatizare == 1)) {
					System.out.println("Toti senzorii trebuie schimbati.");}
		else if (frana == 0 && semnalizare == 0 && climatizare == 0) {
			System.out.println("Nici un senzor nu trebuie schimbat.");
		}
		else {
		if(frana == 1) {
			System.out.println("Senzorul de frana trebuie schimbat.");
		}
		if(semnalizare == 1) {
			System.out.println("Senzorul de semnalizare trebuie schimbat.");
		}
		if(climatizare == 1) {
			System.out.println("Senzorul de climatizare trebuie schimbat.");
		}
		}
		
	}
}
