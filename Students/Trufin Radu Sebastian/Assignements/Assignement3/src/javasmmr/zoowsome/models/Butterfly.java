package javasmmr.zoowsome.models;

public class Butterfly extends Insect 
{
	public Butterfly(Integer nrOfLegs, String name, boolean canFly, boolean isDangerous) 
	{
		super(nrOfLegs, name, canFly, isDangerous);
	}
	
	public Butterfly()
	{
		this.name = "Lepidoptera";
		this.nrOfLegs = 6;
		this.canFly = true;
		this.isDangerous = false;
	}
	
	

}
