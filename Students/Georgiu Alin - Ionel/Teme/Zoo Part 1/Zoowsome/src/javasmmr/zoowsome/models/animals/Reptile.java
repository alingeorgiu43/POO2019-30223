import javasmmr.zoowsome.models.animals;

public class Reptile extends Animal {
	private boolean laysEggs;

	public void setLaysEggs(boolean laysEggs) {
		this.laysEggs = laysEggs;
	}
	
	public boolean getLaysEggs() {
		return laysEggs;
	}
}
