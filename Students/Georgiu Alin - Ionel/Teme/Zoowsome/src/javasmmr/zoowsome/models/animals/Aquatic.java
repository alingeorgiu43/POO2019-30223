package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal{
	private Integer avgSwimDepth;
	private WaterType waterType;
	
	public Aquatic(Integer nrOfLegs, String name,Integer avgSwimDepth,WaterType waterType, double dangerPerc, double maintenanceCost) {
		super(nrOfLegs, name, dangerPerc, maintenanceCost);
		this.avgSwimDepth = avgSwimDepth;
		this.waterType = waterType;
	}
	
	public void setAvgSwimDepth(Integer avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}
	
	public Integer getAvgSwimDepth() {
		return avgSwimDepth;
	}
	
	public void setWaterType(WaterType waterType) {
        this.waterType = waterType;
    }
	
	public WaterType getWaterType() {
        return waterType;
    }
}
