package javasmmr.zoowsome.models.animals;

public class Deer extends Mammal {

	public Deer(Integer nrOfLegs, String name, float normalBodyTemp, float percBodyHair, double dangerPerc,
			double maintenanceCost) {
		super(nrOfLegs, name, normalBodyTemp, percBodyHair, dangerPerc, maintenanceCost);
	}

	public Deer() {
		super(4, "Deer", 38, 70, 0.4, 4);
	}

}
