package javasmmr.zoowsome.models;

public class Chameleon extends Reptile 
{
	public Chameleon(Integer nrOfLegs, String name, boolean laysEggs) 
	{
		super(nrOfLegs, name, laysEggs);
	}
	
	public Chameleon()
	{
		this.name = "Oedipus";
		this.laysEggs = true;
		this.nrOfLegs = 2;
	}

}
