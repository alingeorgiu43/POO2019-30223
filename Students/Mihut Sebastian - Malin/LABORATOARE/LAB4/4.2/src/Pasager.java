
//Locurile din spate sunt numerotate incepand din partea soferului(stanga) spre dreapta
enum e {dreapta,spate1,spate2,spate3};
public class Pasager {
	private String nume;
	private int varsta;
	private e loc;
	Pasager(){
		this.nume="Adrian";
		this.varsta=43;
		this.loc=e.dreapta;
	}
	Pasager(String nume,int varsta,e loc){
		this.nume=nume;
		this.varsta=varsta;
		this.loc=loc;
	}
	public void setName(String nume) {
		this.nume=nume;
	}
	public void getName() {
		System.out.println("Numele pasagerului este "+this.nume);
	}
	public void setVarsta(int varsta) {
		this.varsta=varsta;
	}
	public void getVarsta() {
		System.out.println("Pasagerul are "+this.varsta+" ani");
	}
	public void setLoc(e loc) {
		this.loc=loc;
	}
	public void getLoc() {
		System.out.println("Pasagerul sta pe locul din "+this.loc);
	}
	public void getPasager() {
		System.out.println("Unul dintre pasageri are urmatoarea descriere:");
		this.getName();
		this.getVarsta();
		this.getLoc();
		System.out.println();
	}

}
