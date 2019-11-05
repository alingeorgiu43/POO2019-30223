package javasmmr.zoowsome.models.animals;

public class Wolf extends Mammal{
	
	public Wolf(Integer nrOfLegs,String name,float normalBodyTemp,float percBodyHair) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
	
	public Wolf() {
		setNrOfLegs(4);
		setName("Big Bad Wolf");
		setNormalBodyTemp(36);
		setPercBodyHair(75);
	}
	
}
