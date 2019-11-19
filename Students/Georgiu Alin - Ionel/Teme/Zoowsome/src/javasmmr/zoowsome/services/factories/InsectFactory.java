package javasmmr.zoowsome.services.factories;

import java.util.Random;

import javasmmr.zoowsome.models.animals.*;

public class InsectFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) {

		Random random = new Random();

		double newMaintananceCost = 0.1 + random.nextDouble() * 8;
		double newDangerPerc = random.nextDouble() * 1;
		if (Constants.Animals.Insects.Bee.equals(type)) {
			return new Bee(8, "Bee", true, true, newDangerPerc, newMaintananceCost);
		} else if (Constants.Animals.Insects.Butterfly.equals(type)) {
			return new Butterfly(6, "Butterfly", true, false, newDangerPerc, newMaintananceCost);
		} else if (Constants.Animals.Insects.Spider.equals(type)) {
			return new Spider(8, "Spider", false, true, newDangerPerc, newMaintananceCost);
		} else {
			return null;
		}
	}
}