package javasmmr.zoowsome.models.animals;

public class Wolf extends Mammal {

	public Wolf(Integer nrOfLegs, String name, float normalBodyTemp, float percBodyHair, double dangerPerc,
			double maintenanceCost) {
		super(nrOfLegs, name, normalBodyTemp, percBodyHair, dangerPerc, maintenanceCost);
	}

	public Wolf() {
		super(4, "Wolf", 38, 70, 0.4, 4);
	}

}
