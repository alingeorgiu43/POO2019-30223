package javasmmr.zoowsome.models;

public class Cockroach extends Insect 
{
	public Cockroach(Integer nrOfLegs, String name, boolean canFly, boolean isDangerous) 
	{
		super(nrOfLegs, name, canFly, isDangerous);
	}
	
	public Cockroach()
	{
		this.name = "Caminar";
		this.canFly = true;
		this.isDangerous = false;
	}

}
