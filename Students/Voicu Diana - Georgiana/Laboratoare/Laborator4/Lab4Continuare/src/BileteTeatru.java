
public class BileteTeatru {
	private String piesa;
	private int rand;
	private int loc;
	private int pret;
	
	public BileteTeatru(String piesa, int rand, int loc, int pret) {
		this.piesa = piesa;
		this.rand = rand;
		this.loc = loc;
		this.pret = pret;
	}
	
	public String getPiesa() {
		return piesa;
	}
	
	public void setPiesa(String piesa) {
		this.piesa = piesa;
	}
	
	public int getRand() {
		return rand;
	}
	
	public void setRand(int rand) {
		this.rand = rand;
	}
	
	public int getLoc() {
		return loc;
	}
	
	public void setLoc(int loc) {
		this.loc = loc;
	}
	
	public int getPret() {
		return pret;
	}
	
	public void setPret(int pret) {
		this.pret = pret;
	}
	
	public float incasari(int pret,int ct) {
		float total=0;
		if(ct == 1)
		total += pret- pret*0.1;
		else if(ct==2)
			total += pret;
		else if(ct == 3)
			total += pret - pret*0.2;
		return total;
	}
	
}
