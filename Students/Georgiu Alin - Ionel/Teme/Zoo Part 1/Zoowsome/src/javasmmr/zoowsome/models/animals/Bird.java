package javasmmr.zoowsome.models.animals;

public class Bird extends Animal{
	private boolean migrates;
	private Integer avgFlightAltitude;

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
