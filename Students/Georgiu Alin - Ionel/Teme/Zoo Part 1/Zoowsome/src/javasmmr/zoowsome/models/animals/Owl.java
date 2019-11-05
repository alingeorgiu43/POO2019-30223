package javasmmr.zoowsome.models.animals;

public class Owl extends Bird{
	
	public Owl(Integer nrOfLegs,String name,boolean migrates,Integer avgFlightAltitude) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
	
	public Owl() {
		setNrOfLegs(2);
		setName("Night Bird");
		setMigrates(false);
		setAvgFlightAltitude(1230);
	}
}
