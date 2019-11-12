package javasmmr.zoowsome.models;

public class Penguin extends Bird 
{
	public Penguin(Integer nrOfLegs, String name, boolean migrates, Integer avgFlightAltitude) 
	{
		super(nrOfLegs, name, migrates, avgFlightAltitude);
	}
	
	public Penguin()
	{
		this.name = "Happy Feet";
		this.avgFlightAltitude = 0;
		this.migrates = false;
		this.nrOfLegs = 2;
	}
}
