package javasmmr.zoowsome.models.animals;

public class Bird extends Animal {
	private boolean migrates;
	private Integer avgFlightAltitude;

	public Bird(Integer nrOfLegs, String name, boolean migrates, Integer avgFlightAltitude, double dangerPerc,
			double maintenanceCost) {
		super(nrOfLegs, name, dangerPerc, maintenanceCost);
		this.avgFlightAltitude = avgFlightAltitude;
		this.migrates = migrates;

	}

	public void setMigrates(boolean migrates) {
		this.migrates = migrates;
	}

	public boolean getMigrates() {
		return migrates;
	}

	public void setAvgFlightAltitude(Integer avgFlightAltitude) {
		this.avgFlightAltitude = avgFlightAltitude;
	}

	public Integer getAvgFlightAltitude() {
		return avgFlightAltitude;
	}
}
