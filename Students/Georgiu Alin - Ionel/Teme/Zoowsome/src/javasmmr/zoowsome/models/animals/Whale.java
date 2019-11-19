package javasmmr.zoowsome.models.animals;

public class Whale extends Aquatic{
	
	public Whale(Integer nrOfLegs, String name,Integer avgSwimDepth,WaterType waterType, double dangerPerc, double maintenanceCost) {
		super(nrOfLegs, name, avgSwimDepth, waterType, dangerPerc, maintenanceCost);
	}
	
	public Whale() {
		super(0, "NewWhale", 13000, WaterType.SALTWATER, 0.8, 8);
	}
}
