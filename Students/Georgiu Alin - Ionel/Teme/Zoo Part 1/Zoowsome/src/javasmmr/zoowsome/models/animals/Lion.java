package javasmmr.zoowsome.models.animals;

public class Lion extends Mammal{
	
	public Lion(Integer nrOfLegs,String name,float normalBodyTemp,float percBodyHair) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
	
	public Lion() {
		setNrOfLegs(4);
		setName("King of jungle");
		setNormalBodyTemp(38);
		setPercBodyHair(78);
	}
}
