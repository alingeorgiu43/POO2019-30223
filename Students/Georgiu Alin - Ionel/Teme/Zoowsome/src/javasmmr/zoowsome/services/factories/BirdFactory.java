package javasmmr.zoowsome.services.factories;

import java.util.Random;

import javasmmr.zoowsome.models.animals.*;

public class BirdFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) {

		Random random = new Random();
		boolean NewMigrates = random.nextBoolean();
		int NewFlightAltitude = random.nextInt(10000);
		double newMaintananceCost = 0.1 + random.nextDouble() * 8;
		double newDangerPerc = random.nextDouble() * 1;
		if (Constants.Animals.Birds.Phoenix.equals(type)) {
			return new Phoenix(2, "Phoenix", NewMigrates, NewFlightAltitude, newDangerPerc, newMaintananceCost);
		} else if (Constants.Animals.Birds.Owl.equals(type)) {
			return new Owl(2, "Owl", NewMigrates, NewFlightAltitude, newDangerPerc, newMaintananceCost);
		} else if (Constants.Animals.Birds.Eagle.equals(type)) {
			return new Eagle(2, "Eagle", NewMigrates, NewFlightAltitude, newDangerPerc, newMaintananceCost);
		} else {
			return null;
		}
	}
}