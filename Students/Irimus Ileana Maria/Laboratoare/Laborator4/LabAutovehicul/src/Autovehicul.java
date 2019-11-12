import java.awt.Color;
import java.util.Scanner;

public class Autovehicul {

	private String marca;
	private Color culoare;
	private double vitezaCurenta;
	private int treaptaViteza;
	private double vitezaMaxima;
	private final int numarLocuri = 5;
	private Sofer sofer;

	public Autovehicul(String marca, Color culoare) {
		this.marca = marca;
		this.culoare = culoare;
	}

	public Autovehicul() {
		vitezaCurenta = 0.0;
		treaptaViteza = 0;
		vitezaMaxima = 0.0;
	}
	
	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String stringMarca) {
		this.marca = stringMarca;
	}

	public Color getCuloare() {
		return this.culoare;
	}

	public void setCuloare(Color colorCuloare) {
		this.culoare = colorCuloare;
	}

	
	public double getVitezaCurenta() {
		return this.vitezaCurenta;
	}
	
	public void setVitezaCurenta(double vitezaCurenta) {
		this.vitezaCurenta = vitezaCurenta;
	}


	public int getTreaptaViteza() {
		return this.treaptaViteza;
	}
	
	public void setTreaptaViteza(int treaptaViteza) {
		this.treaptaViteza = treaptaViteza;
	}

	public double getVitezaMaxima() {
		return this.vitezaMaxima;
	}
	
	public void setVitezaMaxima(double vitezaMaxima) {
		this.vitezaMaxima = vitezaMaxima;
	}
	
	public int getNumarLocuri() {
		return this.numarLocuri;
	}
	
	public Sofer getSofer() {
		return this.sofer;
	}

	public void setSofer(Sofer sofer) {
		this.sofer = sofer;
	}
	
	public void accelereaza(double kmPlus) {
		vitezaCurenta = vitezaCurenta + kmPlus;
	}

	public void accelereaza(int kmPlus) {
		vitezaCurenta = vitezaCurenta + kmPlus;
	}//pentru supraincarcare

	public void decelereaza(double kmMinus) {
		vitezaCurenta = vitezaCurenta - kmMinus;
	}

	public void schimbaTreapta(int treaptaNoua) {
		treaptaViteza = treaptaNoua;
	}

	public void opreste() {
		vitezaCurenta = 0;
		treaptaViteza = 0; // masina scoasa din viteza
	}


}
