
public class CertificatInmatriculare {

	private Autovehicul autovehicul;
	private String numarInmatriculare;
	private String dataInmatriculare;
	private String id;
	private String categorie;
	private String sursaEnergie;
	private Sofer sofer;
	

	public Autovehicul getAutovehicul() {
		return this.autovehicul;
	}
	public void setAutovechicul(Autovehicul autovehicul) {
		this.autovehicul = autovehicul;
	}
	
	public String getNumarInmatriculare() {
		return this.numarInmatriculare;
	}

	public void setNumarInmatriculare(String numarInmatriculare) {
		this.numarInmatriculare = numarInmatriculare;
	}

	public String getDataInmatriculare() {
		return this.dataInmatriculare;
	}

	public void setDataInmatriculare(String dataInmatriculare) {
		this.dataInmatriculare = dataInmatriculare;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCategorie() {
		return this.categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public String getSursaEnergie() {
		return this.sursaEnergie;
	}

	public void setSursaEnergie(String sursaEnergie) {
		this.sursaEnergie = sursaEnergie;
	}
	public Sofer getSofer() {
		return this.sofer;
	}
	public void setSofer(Sofer sofer) {
		this.sofer = sofer;
	}
	

}
