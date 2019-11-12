package javasmmr.zoowsome.models;

public class Seahorse extends Aquatic 
{
	public Seahorse(Integer nrOfLegs, String name, Integer avgSwimDepth, waterType livesIn)
	{
		super(nrOfLegs, name, avgSwimDepth, livesIn);
	}

	public Seahorse()
	{
		this.name = "Murgu";
		this.nrOfLegs = 0;
		this.avgSwimDepth = 500;
	}
}
