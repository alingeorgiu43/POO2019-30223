package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect {

	public Butterfly(Integer nrOfLegs, String name, boolean canFly, boolean isDangerous, double dangerPerc,
			double maintenanceCost) {
		super(nrOfLegs, name, canFly, isDangerous, dangerPerc, maintenanceCost);
	}

	public Butterfly(){
		super(4, "Insect Butterfly", true, true, 0.2, 3);
	}
}