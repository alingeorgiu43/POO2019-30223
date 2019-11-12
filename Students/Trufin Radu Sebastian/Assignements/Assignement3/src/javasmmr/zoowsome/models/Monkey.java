package javasmmr.zoowsome.models;

public class Monkey extends Mammal 
{
	public Monkey(Integer nrOfLegs, String name, float normalBodyTemp, float percBodyHair)
	{
		super(nrOfLegs, name, normalBodyTemp, percBodyHair);
	}
	
	public Monkey()
	{
		this.name = "Paleologul";
		this.nrOfLegs = 2;
		this.normalBodyTemp = (float) 38.2;
		this.percBodyHair = 82;
	}
}
