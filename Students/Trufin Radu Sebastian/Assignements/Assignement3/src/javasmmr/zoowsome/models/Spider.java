package javasmmr.zoowsome.models;

public class Spider extends Insect 
{
	public Spider(Integer nrOfLegs, String name, boolean canFly, boolean isDangerous) 
	{
		super(nrOfLegs, name, canFly, isDangerous);
	}
	
	public Spider()
	{
		this.name = "Lucas";
		this.canFly = false;
		this.isDangerous = true;
		this.nrOfLegs = 8;
	}
}
