package Farmacie;

public class Medicament {
	private double pret;
	private String nume;

	public Medicament(int pret, String nume) {
		this.pret = pret;
		this.nume = nume;
	}

	public double getPret() {
		return pret;
	}

	public String getNume() {
		return nume;
	}
}
