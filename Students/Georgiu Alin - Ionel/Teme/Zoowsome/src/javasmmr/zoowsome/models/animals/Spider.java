package javasmmr.zoowsome.models.animals;

public class Spider extends Insect {

    public Spider(Integer nrOfLegs, String name, boolean canFly, boolean isDangerous, double dangerPerc,
			double maintenanceCost) {
		super(nrOfLegs, name, canFly, isDangerous, dangerPerc, maintenanceCost);
	}
    
    public Spider() {
        super(8, "Spidy", false, true, 0.1, 0);
    }
}