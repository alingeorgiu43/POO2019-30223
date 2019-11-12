package javasmmr.zoowsome.models;

public class Tiger extends Mammal 
{
	public Tiger(Integer nrOfLegs, String name, float normalBodyTemp, float percBodyHair)
	{
		super(nrOfLegs, name, normalBodyTemp, percBodyHair);
	}
	
	Tiger()
	{
		this.name = "Vlad Rusu";
		this.normalBodyTemp = (float) 37.5;
		this.percBodyHair = 95;
		this.nrOfLegs = 2;
	}

}
