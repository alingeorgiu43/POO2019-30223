import java.awt.Color;

public class Autovehicul {
	private static final boolean funtional = true;
	private String marca;
	private Color culoare;
	private int vitezaCurenta;
	private int vitezaMaxima;
	private int treaptaCurenta;
	private Sofer sofer;
	
	protected Autovehicul() {
		this.marca = "Volvo";
		this.culoare = Color.DARK_GRAY;
		this.vitezaCurenta = 0;
		this.vitezaMaxima = 210;
		this.treaptaCurenta = 0;
	}

	protected Autovehicul(String marca, Color culoare, int vitezaCurenta, int vitezaMaxima, int treaptaCurenta) {
		this.marca = marca;
		this.culoare = culoare;
		this.vitezaCurenta = vitezaCurenta;
		this.vitezaMaxima = vitezaMaxima;
		this.treaptaCurenta = treaptaCurenta;
	}

	public void accelerare(int viteza) {
		if (vitezaCurenta + viteza <= vitezaMaxima) {
			vitezaCurenta += viteza;
			schimbaViteza();
		} else {
			vitezaCurenta = vitezaMaxima;
			schimbaViteza();
			System.out.println("VitezaMaxima nu poate fi depasita");
		}
	}
	public void schimbaViteza() {
		if (vitezaCurenta > 0 && this.vitezaCurenta <= 20)
			treaptaCurenta = 1;
		else if (vitezaCurenta <= 30)
			treaptaCurenta = 2;
		else if (vitezaCurenta <= 60)
			treaptaCurenta = 3;
		else if (vitezaCurenta <= 90)
			treaptaCurenta = 4;
		else if (vitezaCurenta <= 130)
			treaptaCurenta = 5;
		else
			treaptaCurenta = 6;
	}
	public void oprire() {
		vitezaCurenta = 0;
		treaptaCurenta = 0;
	}

	public void decelerare(int viteza) {
		if (vitezaCurenta - viteza <= 0) {
			oprire();
			System.out.println("Masina a franat pana la oprire");
		} else {
			vitezaCurenta-=viteza;
			schimbaViteza();
		}
	}
	
	public void decelerare(int viteza,int treaptaCurenta) {
		if (vitezaCurenta - viteza <= 0) {
			oprire();
			this.treaptaCurenta=treaptaCurenta;
			System.out.println("Masina a franat pana la oprire");
		} else {
			vitezaCurenta-=viteza;
			this.treaptaCurenta=treaptaCurenta;
			schimbaViteza();
		}
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getVitezaCurenta() {
		return vitezaCurenta;
	}

	public void setVitezaCurenta(int vitezaCurenta) {
		this.vitezaCurenta = vitezaCurenta;
	}

	public int getTreaptaCurenta() {
		return treaptaCurenta;
	}

	public void setTreaptaCurenta(int treaptaCurenta) {
		this.treaptaCurenta = treaptaCurenta;
	}

	public int getVitezaMaxima() {
		return vitezaMaxima;
	}

	public void setVitezaMaxima(int vitezaMaxima) {
		this.vitezaMaxima = vitezaMaxima;
	}

	public Color getCuloare() {
		return culoare;
	}

	public void setCuloare(Color culoare) {
		this.culoare = culoare;
	}
	public String toString()
	{
		return "Marca masina: "+getMarca() + "\nCuloarea: " + getCuloare()
		+ "\nViteza Maxima: " + getVitezaMaxima()+ "\n";
	}
	
}
