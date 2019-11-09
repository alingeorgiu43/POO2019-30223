
public class DotariMasina {

	boolean scauneIncalzite;
	boolean airbag;
	boolean senzoriParcare;

	public DotariMasina() {
		this.scauneIncalzite = false;
		this.airbag = false;
		this.senzoriParcare = false;
	}

	public DotariMasina(boolean scauneIncalzite, boolean airbag, boolean senzoriParcare) {
		this.scauneIncalzite = scauneIncalzite;
		this.airbag = airbag;
		this.senzoriParcare = senzoriParcare;
	}

	public void setAirbag(boolean airbag) {
		this.airbag = airbag;
	}

	public boolean getAirbag() {
		return airbag;
	}

	public void setSenzoriParcare(boolean senzoriParcare) {
		this.senzoriParcare = senzoriParcare;
	}

	public boolean getSenzoriParcare() {
		return senzoriParcare;
	}

	public void setScauneIncalzite(boolean scauneIncalzite) {
		this.scauneIncalzite = scauneIncalzite;
	}

	public boolean getScauneIncalzite() {
		return scauneIncalzite;
	}

}
