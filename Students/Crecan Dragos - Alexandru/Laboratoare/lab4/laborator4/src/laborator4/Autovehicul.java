package laborator4;

import java.lang.Object;

public class Autovehicul {
	private String marca;
	//Color culoare;
	private String culoare;
	private char treaptaDeViteza;
	private float vitezaCurenta;
	private float vitezaMaxima;
	private static final int nrRoti = 4;
	
	public Autovehicul() {
		this.marca = "Dacia";
		this.culoare = "Negru";
		this.vitezaCurenta = 0;
		this.treaptaDeViteza = 'N';
		this.vitezaMaxima = 200;
	}
	
	public Autovehicul(String marca, String culoare, char treaptaDeViteza, float vitezaCurenta, float vitezaMaxima) {
		this.marca = marca;
		this.culoare = culoare;
		this.treaptaDeViteza = treaptaDeViteza;
		this.vitezaCurenta = vitezaCurenta;
		this.vitezaMaxima = vitezaMaxima;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setCuloare(String culoare) {
		this.culoare = culoare;
	}
	
	public void setTreaptaDeViteza(char treaptaDeViteza) {
		this.treaptaDeViteza = treaptaDeViteza;
	}
	
	public void setVitezaCurenta(float vitezaCurenta) {
		this.vitezaCurenta = vitezaCurenta;
	}
	
	public void setVitezaMaxima(float vitezaMaxima) {
		this.vitezaMaxima = vitezaMaxima;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public String getCuloare() {
		return this.culoare;
	}
	
	public char getTreaptaDeViteza() {
		return this.treaptaDeViteza;
	}
	
	public float getVitezaCurenta() {
		return this.vitezaCurenta;
	}
	
	public float getVitezaMaxima() {
		return this.vitezaMaxima;
	}
	
	public int getNrRoti() {
		return this.nrRoti;
	}
	
}