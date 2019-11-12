package javasmmr.zoowsome.models;

public abstract class Aquatic extends Animal
{
	public Integer avgSwimDepth;
	public enum waterType {saltwater, freshwater};
	public waterType livesIn;
	
	public Aquatic(Integer nrOfLegs, String name, Integer avgSwimDepth, waterType livesIn)
	{
		super(nrOfLegs,name);
		this.avgSwimDepth = avgSwimDepth;
		this.livesIn = livesIn;
	}
	
	public Aquatic()
	{
		this.name = "<Unknown name>";
	}
	
	public void setWaterType(waterType livesIn)
	{
		this.livesIn = livesIn;
	}
	
	public void setAvgSwimDepth(Integer avgSwimDepth)
	{
		this.avgSwimDepth = avgSwimDepth;
	}
	
	public waterType getWaterType()
	{
		return this.livesIn;
	}
	
	public Integer getAvgSwimDepth() 
	{
		return this.avgSwimDepth;
	}
	
	
}
