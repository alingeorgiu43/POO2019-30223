package javasmmr.zoowsome.models.animals;

public abstract class Reptile extends Animal {
	private boolean laysEggs;

	public Reptile(Integer nrOfLegs, String name, boolean laysEggs, double dangerPerc, double maintenanceCost) {
		super(nrOfLegs, name, dangerPerc, maintenanceCost);
		this.laysEggs = laysEggs;
	}

	public void setLaysEggs(boolean laysEggs) {
		this.laysEggs = laysEggs;
	}

	public boolean getLaysEggs() {
		return laysEggs;
	}
}
