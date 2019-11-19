package javasmmr.zoowsome.models.animals;

public class Phoenix extends Bird {

	public Phoenix(Integer nrOfLegs, String name, boolean migrates, Integer avgFlightAltitude, double dangerPerc,
			double maintenanceCost) {
		super(nrOfLegs, name, migrates, avgFlightAltitude, dangerPerc, maintenanceCost);
	}

	public Phoenix() {
		super(2, "Fire Bird", true, 9000, 0.1, 2);
	}
}
