package javasmmr.zoowsome.models.animals;

public class Turtle extends Reptile {

	public Turtle(Integer nrOfLegs, String name, boolean laysEggs, double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name, laysEggs, dangerPerc, maintenanceCost);
	}

	public Turtle() {
		super(4, "Turtle", true, 0.1, 2);
	}
}
