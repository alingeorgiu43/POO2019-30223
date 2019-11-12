package javasmmr.zoowsome.models;

public class Salamander extends Aquatic 
{
	public Salamander(Integer nrOfLegs, String name, Integer avgSwimDepth, waterType livesIn)
	{
		super(nrOfLegs, name, avgSwimDepth, livesIn);
	}
	
	public Salamander()
	{
		this.name = "Cerasela";
		this.nrOfLegs = 4;
		this.avgSwimDepth = 175;
	}
}
