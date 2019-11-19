package javasmmr.zoowsome.models.animals;

public class Snake extends Reptile {

	public Snake(Integer nrOfLegs, String name, boolean laysEggs, double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name, laysEggs, dangerPerc, maintenanceCost);
	}

	public Snake() {
		super(9, "Snake", false, 0.3, 5);
	}
}