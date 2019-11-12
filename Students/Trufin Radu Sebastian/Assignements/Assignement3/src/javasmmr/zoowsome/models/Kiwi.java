package javasmmr.zoowsome.models;

public class Kiwi extends Bird 
{
	public Kiwi(Integer nrOfLegs, String name, boolean migrates, Integer avgFlightAltitude) 
	{
		super(nrOfLegs, name, migrates, avgFlightAltitude);
	}
	
	public Kiwi()
	{
		this.name = "Zalmoxis";
		this.avgFlightAltitude = 0;
		this.migrates = false;
		this.nrOfLegs = 2;
	}
}
