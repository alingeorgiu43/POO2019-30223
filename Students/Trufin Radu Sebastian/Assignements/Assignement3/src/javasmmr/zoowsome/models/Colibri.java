package javasmmr.zoowsome.models;

public class Colibri extends Bird 
{
	public Colibri(Integer nrOfLegs, String name, boolean migrates, Integer avgFlightAltitude) 
	{
		super(nrOfLegs, name, migrates, avgFlightAltitude);
	}
	
	public Colibri()
	{
		this.name = "Eugenia";
		this.migrates = false;
		this.avgFlightAltitude = 10;
		this.nrOfLegs = 2;
	}

}
