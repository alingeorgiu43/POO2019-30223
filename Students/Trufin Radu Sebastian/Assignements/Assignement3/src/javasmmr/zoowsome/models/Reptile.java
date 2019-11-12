package javasmmr.zoowsome.models;

public abstract class Reptile extends Animal 
{
	Boolean laysEggs;

	public Reptile(Integer nrOfLegs, String name, boolean laysEggs) 
	{
		super(nrOfLegs, name);
		this.laysEggs = laysEggs;
	}
	
	public Reptile()
	{
		this.name = "<Unknown name>";
	}
	
	public void setEggsLayed(Boolean laysEggs)
	{
		this.laysEggs = laysEggs;
	}
	
	public Boolean isLayingEggs()
	{
		return this.laysEggs;
	}
}
