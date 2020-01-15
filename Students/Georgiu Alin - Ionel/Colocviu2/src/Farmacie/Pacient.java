package Farmacie;

public abstract class Pacient {
	private String nume;
	private String prenume;
	private int varsta;
	private String sex;
	private DoctorFarmacie d;

	public Pacient(String nume, String prenume, int varsta, String sex) {
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.sex = sex;
	}

	public String getNume() {
		return nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public boolean getIsFemale() {
		if(sex.equals("masculin"))
			return true;
		return false;
	}
	
	public boolean getIsMale() {
		if(sex.equals("feminin"))
			return true;
		return false;
	}
	
	public int gradSeveritate() {
		return varsta;
	}
}
