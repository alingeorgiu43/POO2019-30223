package javasmmr.zoowsome.models;

public class Iguana extends Reptile 
{
	public Iguana(Integer nrOfLegs, String name, boolean laysEggs) 
	{
		super(nrOfLegs, name, laysEggs);
	}
	
	public Iguana()
	{
		this.name = "Nelu";
		this.laysEggs = true;
		this.nrOfLegs = 4;
	}	
}
