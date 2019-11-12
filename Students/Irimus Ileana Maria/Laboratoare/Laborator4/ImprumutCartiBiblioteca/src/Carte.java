
public class Carte {

	private String titlu;
	private String autor;
	private String editura;
	private int cod;
	
	public String getTitlu() {
		return this.titlu;
	}

	public void setNume(String titlu) {
		this.titlu = titlu;
	}

	public String getAutor() {
		return this.autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditura() {
		return this.editura;
	}

	public void setEditura(String editura) {
		this.editura = editura;
	}

	public int getCod() {
		return this.cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public void printareCarte() {
		System.out.println("''" + getTitlu() + "'',\t" + getAutor() + ",\t editura " + getEditura());
	}
}
