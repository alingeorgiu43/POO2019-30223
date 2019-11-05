package javasmmr.zoowsome.models.animals;

public class Eagle extends Bird{
	
	public Eagle(Integer nrOfLegs,String name,boolean migrates,Integer avgFlightAltitude) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
	
	public Eagle() {
		setNrOfLegs(2);
		setName("Attack Bird");
		setMigrates(false);
		setAvgFlightAltitude(14000);
	}
}
