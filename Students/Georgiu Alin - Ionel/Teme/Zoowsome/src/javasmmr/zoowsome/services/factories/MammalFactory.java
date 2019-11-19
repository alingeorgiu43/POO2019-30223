package javasmmr.zoowsome.services.factories;

import java.util.Random;

import javasmmr.zoowsome.models.animals.*;

public class MammalFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) {

		Random random = new Random();
		float newBodyTemperature = 30 + random.nextFloat() * 30;
		float newBodyHairPercent = random.nextFloat() * 95;
		double newMaintananceCost = 0.1 + random.nextDouble() * 8;
		double newDangerPerc = random.nextDouble() * 1;
		if (Constants.Animals.Mammals.Lion.equals(type)) {
			return new Lion(4, "Lion", newBodyTemperature, newBodyHairPercent, newDangerPerc, newMaintananceCost);
		} else if (Constants.Animals.Mammals.Deer.equals(type)) {
			return new Deer(4, "Deer", newBodyTemperature, newBodyHairPercent, newDangerPerc, newMaintananceCost);
		} else if (Constants.Animals.Mammals.Wolf.equals(type)) {
			return new Wolf(4, "Wolf", newBodyTemperature, newBodyHairPercent, newDangerPerc, newMaintananceCost);
		} else {
			return null;
		}
	}
}