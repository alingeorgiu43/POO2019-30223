package javasmmr.zoowsome.services.factories;

import java.util.Random;

import javasmmr.zoowsome.models.animals.*;

public class ReptileFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) {

		Random random = new Random();
		double newMaintananceCost = 0.1 + random.nextDouble() * 8;
		double newDangerPerc = random.nextDouble() * 1;
		if (Constants.Animals.Reptiles.Lizard.equals(type)) {
			return new Lizard(4, "Lizzard", true, newDangerPerc, newMaintananceCost);
		} else if (Constants.Animals.Reptiles.Snake.equals(type)) {
			return new Snake(0, "Snake", true, newDangerPerc, newMaintananceCost);
		} else if (Constants.Animals.Reptiles.Turtle.equals(type)) {
			return new Turtle(4, "Turtle", true, newDangerPerc, newMaintananceCost);
		} else {
			return null;
		}
	}
}