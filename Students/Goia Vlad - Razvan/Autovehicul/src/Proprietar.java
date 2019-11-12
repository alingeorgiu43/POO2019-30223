
public class Proprietar extends Sofer{
	private String nume;
	private int varsta;
	Proprietar(){
		this.nume="Adina";
		this.varsta=43;
	}
	Proprietar(String nume,int varsta){
		this.nume=nume;
		this.varsta=varsta;
	}
	public void setNme(String nume) {
		this.nume=nume;
	}
	public void getName() {
		System.out.println("Numele proprietarului este "+this.nume);
	}
	public void setVarsta(int varsta) {
		this.varsta=varsta;
	}
	public int getVarsta() {
		System.out.println("Proprietarul are "+this.varsta+" ani");
		return varsta;
	}

	public void getProprietar() {
		System.out.println("Proprietarul masinii  are urmatoarea descriere:");
		this.getName();
		this.getVarsta();
		System.out.println();
	}

}