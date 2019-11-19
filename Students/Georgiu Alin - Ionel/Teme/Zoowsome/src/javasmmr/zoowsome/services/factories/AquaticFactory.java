package javasmmr.zoowsome.services.factories;
import java.util.Random;

import javasmmr.zoowsome.models.animals.*;

public class AquaticFactory extends SpeciesFactory {

    @Override
    public Animal getAnimal(String type) {
    	Random random = new Random();
    	int newAvgSwimDepth=random.nextInt(10000);
		double newMaintananceCost = 0.1 + random.nextDouble() * 8;
		double newDangerPerc = random.nextDouble()*1;
        if (Constants.Animals.Aquatics.Shark.equals(type)) {
            return new Shark(0, "Shark", newAvgSwimDepth, WaterType.SALTWATER, newDangerPerc, newMaintananceCost);
        } else if (Constants.Animals.Aquatics.Whale.equals(type)) {
            return new Whale(0, "Whale", newAvgSwimDepth, WaterType.FRESHWATER, newDangerPerc, newMaintananceCost);
        } else if (Constants.Animals.Aquatics.Dolphin.equals(type)) {
            return new Dolphin(0, "Dolphin", newAvgSwimDepth, WaterType.SALTWATER, newDangerPerc, newMaintananceCost);
        } else {
            return null;
        }
    }
}