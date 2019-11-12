package javasmmr.zoowsome.models;

public abstract class Insect extends Animal
{
	Boolean canFly;
	Boolean isDangerous;
	
	public Insect(Integer nrOfLegs, String name, boolean canFly, boolean isDangerous) 
	{
		super(nrOfLegs, name);
		this.canFly = canFly;
		this.isDangerous = isDangerous;
	}
	
	public Insect()
	{
		this.name = "<Unknown name>";
	}
	
	public void setFly(boolean canFly)
	{
		this.canFly = canFly;
	}
	
	public void setDanger(boolean isDangerous)
	{
		this.isDangerous = isDangerous;
	}
	
	public Boolean Flies()
	{
		return this.canFly;
	}
	
	public Boolean Endanger()
	{
		return this.isDangerous;
	}	
}
