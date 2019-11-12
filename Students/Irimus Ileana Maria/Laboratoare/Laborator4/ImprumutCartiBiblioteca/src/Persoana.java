
public class Persoana {

	private String nume;
	private String prenume;
	private int idPermis;
	private String dataImprumut;
	private int perioadaImprumut;

	public String getNume() {
		return this.nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return this.prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public int getIdPermis() {
		return this.idPermis;
	}

	public void setIdPermis(int idPermis) {
		this.idPermis = idPermis;
	}

	public String getDataImprumut() {
		return this.dataImprumut;
	}

	public void setDataImprumut(String dataImprumut) {
		this.dataImprumut = dataImprumut;
	}

	public int getPerioadaImprumut() {
		return this.perioadaImprumut;
	}

	public void setPerioadaImprumut(int perioadaImprumut) {
		this.perioadaImprumut = perioadaImprumut;
	}
	
	public int prelungireImprumut(int prelungireImprumut)
	{
		perioadaImprumut = perioadaImprumut + prelungireImprumut;
		return perioadaImprumut;
	}

}
