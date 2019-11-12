package laborator4;

public class Remorca extends Autovehicul {
	private int greutate;
	private Boolean prelata;
	private Boolean sistemDeFranare;
	
	public Remorca() {
		this.greutate = 750;
		this.prelata = false;
		this.sistemDeFranare = false;
	}
	
	public void setGreutate(int greutate) {
		this.greutate = greutate;
	}
	
	public void setPrelata(Boolean prelata) {
		this.prelata = prelata;
	}
	
	public void setSistemDeFranare(Boolean sistemDeFranare) {
		this.sistemDeFranare = sistemDeFranare;
	}
	
	public int getGreutate() {
		return this.greutate;
	}
	
	public Boolean getPrelata() {
		return this.prelata;
	}
	
	public Boolean getSistemDeFranare() {
		return this.sistemDeFranare;
	}

}
