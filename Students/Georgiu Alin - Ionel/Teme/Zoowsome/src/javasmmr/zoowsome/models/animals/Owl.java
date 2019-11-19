package javasmmr.zoowsome.models.animals;

public class Owl extends Bird {

	public Owl(Integer nrOfLegs, String name, boolean migrates, Integer avgFlightAltitude, double dangerPerc,
			double maintenanceCost) {
		super(nrOfLegs, name, migrates, avgFlightAltitude, dangerPerc, maintenanceCost);
	}

	public Owl()  {
		super(2, "Owl Bird", true, 9000, 0.2, 3);
	}
}
