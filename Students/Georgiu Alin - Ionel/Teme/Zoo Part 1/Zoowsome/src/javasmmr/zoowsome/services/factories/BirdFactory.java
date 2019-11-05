package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class BirdFactory extends SpeciesFactory {

    @Override
    public Animal getAnimal(String type) {
        if (Constants.Animals.Birds.Phoenix.equals(type)) {
            return new Phoenix();
        } else if (Constants.Animals.Birds.Owl.equals(type)) {
            return new Owl();
        } else if (Constants.Animals.Birds.Eagle.equals(type)) {
            return new Eagle();
        } else {
            return null;
        }
    }
}