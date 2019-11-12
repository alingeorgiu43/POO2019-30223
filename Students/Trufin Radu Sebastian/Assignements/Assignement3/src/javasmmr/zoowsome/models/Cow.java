package javasmmr.zoowsome.models;

public class Cow extends Mammal 
{
	public Cow(Integer nrOfLegs, String name, float normalBodyTemp, float percBodyHair)
	{
		super(nrOfLegs, name, normalBodyTemp, percBodyHair);
	}
	
	public Cow()
	{
		this.name = "Jiuncutza";
		this.normalBodyTemp = (float) 38.6;
		this.percBodyHair = 5;
		this.nrOfLegs = 4;
	}
	
}
