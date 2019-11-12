
public class Sofer {
	private String nume;
	private String prenume;
	private int varsta;
	private int nrPermis;

 public Sofer(String nume, String prenume, int varsta, int nrPermis) {
	this.nume = nume;
	this.prenume = prenume;
	this.varsta = varsta;
	this.nrPermis = nrPermis;
	}
	
public String getNume() {
	return this.nume;
}

public void setNume(String newNume) {
	this.nume= newNume;
}

public String getPrenume() {
	return this.prenume;
}

public void setPreume(String newPrenume) {
	this.prenume= newPrenume;
}

public int getVarsta() {
	return this.varsta;
}

public void setVarsta(int newVarsta) {
	this.varsta = newVarsta;
}

public int getNrPermis() {
	return this.nrPermis;
}

public void setNrPermis(int newNrPermis) {
	this.nrPermis = newNrPermis;
}
	
}
