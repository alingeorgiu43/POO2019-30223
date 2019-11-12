
public class PermisDeConducere extends Sofer {
	private String categorie;
	private Boolean valid;

	public PermisDeConducere() {
		this.categorie = "B";
		this.valid = true;
	}

	public void setCtegorie(String categorie) {
		this.categorie = categorie;
	}

	public void setValid(Boolean valid) {
		this.valid = valid;
	}

	public String getCategorie() {
		return this.categorie;
	}

	public Boolean getValid() {
		return this.valid;
	}

}
