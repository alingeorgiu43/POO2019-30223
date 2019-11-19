package javasmmr.zoowsome.models.animals;

public class Lion extends Mammal {

	public Lion(Integer nrOfLegs, String name, float normalBodyTemp, float percBodyHair, double dangerPerc,
			double maintenanceCost) {
		super(nrOfLegs, name, normalBodyTemp, percBodyHair, dangerPerc, maintenanceCost);
	}

	public Lion() {
		super(4, "Lion", 38, 70, 0.9, 8);
	}
}
