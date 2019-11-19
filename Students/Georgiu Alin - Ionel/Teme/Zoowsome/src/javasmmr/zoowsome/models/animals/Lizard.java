package javasmmr.zoowsome.models.animals;

public class Lizard extends Reptile {

	public Lizard(Integer nrOfLegs, String name, boolean laysEggs, double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name, laysEggs, dangerPerc, maintenanceCost);
	}

	public Lizard() {
		super(4, "Lizzy", true, 0.2, 6);
	}
}
