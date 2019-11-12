package javasmmr.zoowsome.models;

public class Gecko extends Reptile 
{
	public Gecko(Integer nrOfLegs, String name, boolean laysEggs) 
	{
		super(nrOfLegs, name, laysEggs);
	}
	
	public Gecko() 
	{
		this.name = "Palmoliviu";
		this.laysEggs = true;
		this.nrOfLegs = 4;
	}
}
