
public class Zi {
	private String zi;
	private boolean ziLucratoare;

	Zi(String zi, Boolean ziLucratoare) {
		this.zi = zi;
		this.ziLucratoare = ziLucratoare;
	}

	public void setNume(String nume) {
		this.zi = nume;
	}

	String getNume() {
		return this.zi;
	}

	public void setZiLucratoare(Boolean ziLucratoare) {
		this.ziLucratoare = ziLucratoare;
	}

	public boolean getTipZi() {
		return this.ziLucratoare;
	}
}
