package javasmmr.zoowsome.models.animals;

public class Snake extends Reptile{
	
	public Snake(Integer nrOfLegs,String name,boolean laysEggs) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	}
	
	public Snake()
	{
		setNrOfLegs(0);
		setName("Ssssshssss");
		setLaysEggs(true);
	}
}
