package javasmmr.zoowsome.models.animals;

public class Whale extends Aquatic{
	
	public Whale(Integer nrOfLegs,String name,Integer avgSwimDepth,WaterType waterType) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
	
	public Whale() {
		setNrOfLegs(0);
		setName("Blue Whale");
		setAvgSwimDepth(3000);
		setWaterType(WaterType.SALTWATER);
	}
}
