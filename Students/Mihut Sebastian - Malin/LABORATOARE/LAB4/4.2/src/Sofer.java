
public class Sofer {
	private String nume;
	private int varsta;
	private int nrPermis;
	Sofer(){
		this.nume="Adrian";
		this.varsta=43;
		this.nrPermis=115;
	}
	Sofer(String nume,int varsta,int nrPermis){
		this.nume=nume;
		this.varsta=varsta;
		this.nrPermis=nrPermis;
	}
	public void setNme(String nume) {
		this.nume=nume;
	}
	public void getName() {
		System.out.println("Soferul se numeste "+this.nume);
	}
	public void setVarsta(int varsta) {
		this.varsta=varsta;
	}
	public void getVarsta() {
		System.out.println("Soferul are "+this.varsta+" ani");
	}
	public void setNrPermis(int nrPermis) {
		this.nrPermis=nrPermis;
	}
	public void getNrPermis() {
		System.out.println("Soferul are permisul cu numarul "+this.nrPermis);
	}
	public void getSofer() {
		System.out.println("Soferul masinii are urmatoare descirere:");
		this.getName();
		this.getVarsta();
		this.getNrPermis();
		System.out.println();
	}

}
