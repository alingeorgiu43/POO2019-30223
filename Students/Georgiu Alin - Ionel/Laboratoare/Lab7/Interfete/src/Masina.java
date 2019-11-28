import java.awt.Color;

public class Masina implements Cloneable {
	private String marca;
	private Color culoare;

	public Masina(String marca, Color color) {
		this.marca = marca;
		this.culoare = color;
	}

	public String getMarca() {
		return this.marca;
	}

	public Color getCuloare() {
		return this.culoare;
	}

	public void paintCar(Color color) {
		this.culoare = color;
	}

	@Override
	public Masina clone() throws CloneNotSupportedException {
		return (Masina) super.clone();
	}

}