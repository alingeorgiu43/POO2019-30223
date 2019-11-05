package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic{
	
	public Shark(Integer nrOfLegs,String name,Integer avgSwimDepth,WaterType waterType) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
	
	public Shark() {
		setNrOfLegs(0);
		setName("Blue Shark");
		setAvgSwimDepth(2000);
		setWaterType(WaterType.SALTWATER);
	}
}
