package javasmmr.zoowsome.models.animals;

public class Phoenix extends Bird{
	
	public Phoenix(Integer nrOfLegs,String name,boolean migrates,Integer avgFlightAltitude) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
	
	public Phoenix() {
		setNrOfLegs(2);
		setName("Fire Bird");
		setMigrates(false);
		setAvgFlightAltitude(12300);
	}
}
