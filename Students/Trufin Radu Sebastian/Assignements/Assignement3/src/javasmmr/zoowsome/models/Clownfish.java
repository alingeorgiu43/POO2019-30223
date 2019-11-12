package javasmmr.zoowsome.models;

public class Clownfish extends Aquatic 
{
	public Clownfish(Integer nrOfLegs, String name, Integer avgSwimDepth, waterType livesIn)
	{
		super(nrOfLegs, name, avgSwimDepth, livesIn);
	}
	
	public Clownfish()
	{
		this.name = "Nemo";
		this.nrOfLegs = 0;
		this.avgSwimDepth = 250;
	}
}
