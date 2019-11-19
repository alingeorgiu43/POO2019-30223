package javasmmr.zoowsome.models.animals;

public class Dolphin extends Aquatic{
	
	public Dolphin(Integer nrOfLegs, String name,Integer avgSwimDepth,WaterType waterType, double dangerPerc, double maintenanceCost) {
		super(nrOfLegs, name, avgSwimDepth, waterType, dangerPerc, maintenanceCost);
	}
	
	public Dolphin() {
		super(0, "NewDolphin", 6000, WaterType.FRESHWATER, 0.6, 9);
	}
}
