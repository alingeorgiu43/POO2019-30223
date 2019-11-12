package javasmmr.zoowsome.models;

public abstract class Mammal extends Animal 
{
	float normalBodyTemp;
	float percBodyHair;
	
	public Mammal(Integer nrOfLegs, String name, float normalBodyTemp, float percBodyHair) 
	{
		super(nrOfLegs, name);
		this.normalBodyTemp = normalBodyTemp;
		this.percBodyHair = percBodyHair;
	}
	
	public Mammal()
	{
		this.name = "<Unknown name>";
	}
	
	public void setPercBodyHair(float percBodyHair)
	{
		this.percBodyHair = percBodyHair;
	}
	
	public void setBodyTemperature(float normalBodyTemp)
	{
		this.normalBodyTemp = normalBodyTemp;
	}
	
	public float getNormalBodyTemperature()
	{
		return this.normalBodyTemp;
	}
	
	public float getPercBodyHair()
	{
		return this.percBodyHair;
	}
}
