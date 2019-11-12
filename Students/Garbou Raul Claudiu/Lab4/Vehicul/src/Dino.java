public class Dino {
	private Autovehicul autovehicul;
	private int caiPutereLaRoata;
	private int caiPutereLaVolanta;
	private int topspeed;
	private String emisii;
	
	public void setcaiPutereLaRoata(int caiPutereLaRoata) {
		this.caiPutereLaRoata = caiPutereLaRoata;
	}
	public int getcaiPutereLaRoata() {
		return caiPutereLaRoata;
	}
	public void setcaiPutereLaVolanta(int caiPutereLaVolanta) {
		this.caiPutereLaVolanta = caiPutereLaVolanta;
	}
	public int getcaiPutereLaVolanta() {
		return caiPutereLaVolanta;
	}
	public int gettopspeed() {
		return topspeed;
	}
	public void settopspeed(int topspeed) {
		this.topspeed = topspeed;
	}
	public String getemisii() {
		return emisii;
	}
	public void setemisii(String emisii) {
		this.emisii = emisii;
	}
	public Autovehicul getAutovehicul() {
		return autovehicul;
	}
	public void setAutovehicul(Autovehicul autovehicul) {
		this.autovehicul = autovehicul;
	}
}