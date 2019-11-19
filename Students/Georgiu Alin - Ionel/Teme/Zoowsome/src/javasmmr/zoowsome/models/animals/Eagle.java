package javasmmr.zoowsome.models.animals;

public class Eagle extends Bird {

	public Eagle(Integer nrOfLegs, String name, boolean migrates, Integer avgFlightAltitude, double dangerPerc,
			double maintenanceCost) {
		super(nrOfLegs, name, migrates, avgFlightAltitude, dangerPerc, maintenanceCost);
	}

	public Eagle() {
		super(2, "Eagle Bird", true, 9000, 0.1, 2);
	}
}
