package javasmmr.zoowsome.models.animals;

public class Bee extends Insect {

	public Bee(Integer nrOfLegs, String name, boolean canFly, boolean isDangerous, double dangerPerc,
			double maintenanceCost) {
		super(nrOfLegs, name, canFly, isDangerous, dangerPerc, maintenanceCost);
	}

	public Bee() {
		super(6, "Insect Bee", true, true, 0.2, 3);
	}
}