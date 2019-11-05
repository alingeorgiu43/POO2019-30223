package javasmmr.zoowsome.models.animals;

public class Deer extends Mammal{
	
	public Deer(Integer nrOfLegs,String name,float normalBodyTemp,float percBodyHair) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
	
	public Deer() {
		setNrOfLegs(4);
		setName("Wild Deer");
		setNormalBodyTemp(39);
		setPercBodyHair(67);
	}
	
}
