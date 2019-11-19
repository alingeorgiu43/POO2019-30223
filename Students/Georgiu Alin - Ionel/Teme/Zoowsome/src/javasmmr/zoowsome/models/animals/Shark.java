package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic {

	public Shark(Integer nrOfLegs, String name, Integer avgSwimDepth, WaterType waterType, double dangerPerc,
			double maintenanceCost) {
		super(nrOfLegs, name, avgSwimDepth, waterType, dangerPerc, maintenanceCost);
	}

	public Shark() {
		super(0, "NewShark", 9000, WaterType.SALTWATER, 0.9, 6);
	}
}
