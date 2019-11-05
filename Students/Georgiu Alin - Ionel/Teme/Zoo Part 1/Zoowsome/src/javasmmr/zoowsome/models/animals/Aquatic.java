package javasmmr.zoowsome.models.animals;

public class Aquatic extends Animal{
	private Integer avgSwimDepth;
	private WaterType waterType;
	
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
