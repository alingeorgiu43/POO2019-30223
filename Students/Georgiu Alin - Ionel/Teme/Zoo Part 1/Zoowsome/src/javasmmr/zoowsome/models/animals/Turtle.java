package javasmmr.zoowsome.models.animals;

public class Turtle extends Reptile{
	
	public Turtle(Integer nrOfLegs,String name,boolean laysEggs) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	}
	
	public Turtle()
	{
		setNrOfLegs(4);
		setName("Johnattan");
		setLaysEggs(true);
	}
}
