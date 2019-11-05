package javasmmr.zoowsome.models.animals;

public class Dolphin extends Aquatic{
	
	public Dolphin(Integer nrOfLegs,String name,Integer avgSwimDepth,WaterType waterType) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
	
	public Dolphin() {
		setNrOfLegs(0);
		setName("Blue Dolphin");
		setAvgSwimDepth(1000);
		setWaterType(WaterType.FRESHWATER);
	}
}
