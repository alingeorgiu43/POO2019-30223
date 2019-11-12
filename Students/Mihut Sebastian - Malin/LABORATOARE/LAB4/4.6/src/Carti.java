import java.util.Random;

public class Carti {
	
	private int numar;
	private String tip;
	public int getNumar() {
		return this.numar;
	}
	public String getTip() {
		return this.tip;
	}
	private int getRandomNumar(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
	private String getRandomTip(int min, int max) {
		String[] sirTip=new String[]{"Inima Rosie","Romb","Inima Neagra","Trefla"};
		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}
		Random r = new Random();
		return sirTip[r.nextInt((max - min) + 1) + min];
	}
	public void getRandomCarte() {
		this.numar=getRandomNumar(1, 14);
		this.tip=getRandomTip(0,3);
	}

}
